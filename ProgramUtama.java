import java.util.*;
public class ProgramUtama {
	//Inisialisasi vector user
	public static Vector <String> username = new Vector <String>();
	public static Vector <String> password = new Vector <String>();
	public static Vector <String> status = new Vector <String>();
	public static Scanner sc = new Scanner (System.in);
	
	public static void main (String [] args){
		//Data awal
		username.add("admin");
		password.add("admin");
		status.add("admin");
		username.add("kasir");
		password.add("kasir");
		status.add("kasir");
			boolean ceklogin = false;
		
		do {
			//Menu Login
			System.out.println ("");
			System.out.println ("======= SILAHKAN ANDA LOGIN =======");
			System.out.print ("Input Username \t: ");
			String user = sc.next();
			System.out.print ("Input Password \t: ");
			String pass = sc.next();
				if (username.contains(user) && password.contains(pass)) {
					if (username.indexOf(user) == password.indexOf(pass)){
						int urutan = username.indexOf(user);
						String cek = status.elementAt(urutan);
						if (cek.equalsIgnoreCase("admin")){
							System.out.println ("Login Sukses"+user+", Anda Login sebagai ADMIN");
							AreaAdmin.admin ();
							ceklogin = true;
							}
							else if (cek.equalsIgnoreCase("kasir")) {
								System.out.println ("Login Sukses"+user+", Anda Login sebagai KASIR");
								AreaAdmin.kasir();
								ceklogin=true;
							}
						}
						else {
							System.out.println ("Oops,..Inputan anda salah, Login gagal"); }
				}
					else {
						System.out.println ("Oops,..Inputan anda salah, Login gagal"); }
		} while (ceklogin = true);
	}
	
	//Menu Manajemen User
	public static void ManajemenUser() {
		boolean manajemenuser = false;
		do {
			System.out.println ("");
			System.out.println ("======= Manajemen User =======");
			System.out.println ("1. Menambah Data User");
			System.out.println ("2. Menghapus Data User");
			System.out.println ("3. Update User");
			System.out.println ("4. Menampilkan User");
			System.out.println ("5. Exit");
			System.out.print ("Pilih pilihan [1-4] : ");
			int piluser = sc.nextInt();
			int urutan=-1;
			
			if (piluser == 1){
				System.out.println ("");
				System.out.println ("> Menambah Data User");
				System.out.print ("Masukan User Name \t: ");
					String userbaru = sc.next();
				System.out.print ("Masukkan Password \t: ");
					String passbaru = sc.next();
				System.out.print ("Masukkan Status \t: ");
					String statbaru = sc.next();
				System.out.println ("Ingin Menambah");
				System.out.println (userbaru+"\t"+passbaru);
				System.out.print ("[y/t]");
					String TambahUser = sc.next();
					if (TambahUser.equalsIgnoreCase("y")){
						username.add(userbaru);
						password.add(passbaru);
						status.add(statbaru);
					}
					else {
						System.out.println ("Data tidak ditambahkan");}
			}
			
			if (piluser == 2){
				System.out.println ("");
				System.out.println ("> Manambah Data User");
				System.out.print ("Username yang ingin di hapus \t: ");
				String hapususer = sc.next();
				if (username.contains(hapususer)){
					System.out.print ("Apakah Anda akan menghapus username "+hapususer+" [y/t]? ");
					String HapusUser = sc.next();
					if (HapusUser.equalsIgnoreCase("y")){
						urutan = username.indexOf(hapususer);
						username.remove(urutan);
						password.remove(urutan);
						status.remove(urutan);
						System.out.println ("Username "+hapususer+" berhasil dihapus!");
					}
					else
						System.out.print ("Username tidak terhapus");
				}
				else
					System.out.println ("Username tidak ditemukan!");
			}
			
			if (piluser == 3){
				System.out.print ("");
				System.out.print ("> Update User");
				System.out.print ("Masukkan Username : ");
				String updateuser = sc.next();
				if (username.contains(updateuser)){
					urutan = password.indexOf(updateuser);
					System.out.print ("Masukkan Username Baru : ");
						String UpdateUser = sc.next();
					System.out.print ("Masukkan Password Baru : ");
						String UpdatePass = sc.next();
					System.out.print ("Masukkan Status Baru : ");
						String UpdateStat = sc.next();
					System.out.println ("Mengganti . .");
					System.out.println (username.elementAt(urutan)+"\t"+password.elementAt(urutan)+"\t"+status.elementAt(urutan));
					System.out.println ("Dengan . .");
					System.out.println (UpdateUser+"\t"+UpdatePass+"\t"+UpdateStat);
					System.out.print ("Ganti [y/n] :");
						String Update= sc.next();
					if (Update.equalsIgnoreCase("y")){
						username.setElementAt(UpdateUser,urutan);
						password.setElementAt(UpdatePass,urutan);
						password.setElementAt(UpdateStat,urutan);
						System.out.println ("Update");
					}
					else
						System.out.println ("Data tidak di update");
				}
				else
					System.out.println ("Username tidak ditemukan");
			}
			
			if (piluser == 4){
				for (int i=0; i<username.size(); i++){
					System.out.println (username.elementAt(i)+"\t"+password.elementAt(i));
				}
			}
			
			if (piluser == 5){
				manajemenuser = true;
			}
			
		} while (manajemenuser = false);
	}

}