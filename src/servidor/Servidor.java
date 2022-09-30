package servidor;

import java.util.ArrayList;
import cliente.Mensagem;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.LocateRegistry;

//import java.rmi.RMISecurityManager;

public class Servidor extends UnicastRemoteObject implements InterfaceServer {

	

	public Servidor() throws RemoteException {
		super();
	}

	private static final long serialVersionUID = 1L;
	ArrayList<Mensagem> mensagens = new ArrayList<Mensagem>();

	public void receberMensagem(String remetente, String destinatario, String msgString) {

		Mensagem msg = new Mensagem();
		msg.setDestinatario(destinatario);
		msg.setRemetente(remetente);
		msg.setMsg(msgString);
		mensagens.add(msg);

	}

	public void getMenssagem(String remetente, String destinatario) {
		String str = "";
		System.out.println(mensagens.size());
		for (Mensagem m : mensagens) {

			if (m.getRemetente().equals(remetente) && m.getDestinatario().equals(destinatario)) {
				str = m.getMsg();
				System.out.println(str);
			}
		}
		if (str.isBlank())
			System.out.println("nenhuma msg!");
	}
	
	public static void registroRMI() {
		try{
			java.rmi.registry.LocateRegistry.createRegistry(1099);
			System.out.println("Servidor RMI rodando com sucesso.");
		}
		catch(RemoteException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		registroRMI();	
		String hostName = "localhost";
		String serviceName = "ChatSistemasDistribuidos";
		
		
		try{
			InterfaceServer hello = new Servidor();
			Naming.rebind("rmi://" + hostName + "/" + serviceName, hello);
			System.out.println("Chat RMI está rodando...");
		}
		catch(Exception e){
			System.out.println("Problemas ao executar o servidor.");
		}	
	}

}

		