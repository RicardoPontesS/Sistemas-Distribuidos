package cliente;
import java.util.ArrayList;

import servidor.InterfaceServer;
import servidor.Servidor;
import java.rmi.RemoteException;
import java.io.FileWriter;
import java.net.MalformedURLException;
import java.rmi.ConnectException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import org.json.simple.JSONObject;

public class Cliente {
	private String nome;
	static InterfaceServer serverIf;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cliente(String nome) {
		this.nome = nome;
	}

	public void checkMsg(Servidor server,String remetente) throws RemoteException {
		server.getMenssagem(remetente,nome);
	}

	public void sendMsg(Servidor server,String destinatario,String msg) throws RemoteException {
		server.receberMensagem(nome, destinatario, msg);
	}
	public void sendMsg(Cliente remetente,String destinatario, String msg) throws RemoteException {
		serverIf.getMenssagem(destinatario, msg);
		}
		
		public static void main(String[] args) throws RemoteException, MalformedURLException, NotBoundException {
			String hostName ="localhost";
			String serviceName="ChatSistemasDistribuidos";
			
			serverIf = ( InterfaceServer )Naming.lookup("rmi://" + hostName + "/" + serviceName);	
			FileWriter arquivoTexto = null;
			JSONObject objJson = new JSONObject();
			Cliente c1 = new Cliente("joao");
			Cliente c2 = new Cliente("maria");
			Servidor server = new Servidor();
			
			objJson.put(server, "maria");
			objJson.put("maria", "Olá, tudo bem?");
			
			//c1.sendMsg(server,"maria", "olá, tudo bem?");
			c1.checkMsg(server, "joao");
		}
	}

	
