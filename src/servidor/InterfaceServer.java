package servidor;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceServer extends Remote{

	public void receberMensagem(String remetente,String destinatario, String msgString) throws RemoteException;
	
	public void getMenssagem(String remetente,String destinatario) throws RemoteException;
	
}
