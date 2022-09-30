package servidor;
import java.rmi.Remote;
import java.rmi.RemoteException;
import org.json.JSONObject;

import org.json.JSONObject;

import cliente.Cliente;

public interface InterfaceServer extends Remote{

	public void receberMensagem(String remetente,String destinatario, String msgString) throws RemoteException;
	
	//public void getMenssagem(String destinatario,String msg) throws RemoteException;
	public void getMenssagem(Servidor server,JSONObject jsonObject) throws RemoteException;
}
