package br.com.cod3r.factory.app.dbadapter;

import br.com.cod3r.factory.app.dbadapter.db.DB;
import br.com.cod3r.factory.app.dbadapter.db.PostgresDB;
import br.com.cod3r.factory.app.dbadapter.factory.OracleDBFactory;
import br.com.cod3r.factory.app.dbadapter.factory.PostgresDBFactory;

public class Client {

	public static void main(String[] args) {

		DB db = new OracleDBFactory().getDatabase();
		db.query("SELECT * FROM CLIENTS");

		DB db2 = new PostgresDBFactory().getDatabase();
		db2.update("Select id from client");
	}
}
