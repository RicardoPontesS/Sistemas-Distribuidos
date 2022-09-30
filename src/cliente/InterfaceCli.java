package cliente;

import java.rmi.Remote;
import java.rmi.RemoteException;

import servidor.Servidor;

public interface InterfaceCli extends Remote{
	
	public void checkMsg(Servidor server,String remetente) throws RemoteException;
	
	public void sendMsg(Servidor server,String destinatario,String msg) throws RemoteException;
	public void sendMsg(String destinatario,String msg) throws RemoteException;
}
