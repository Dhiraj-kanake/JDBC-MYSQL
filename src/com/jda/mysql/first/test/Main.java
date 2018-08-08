package com.jda.mysql.first.test;

import com.jda.mysql.first.MySQLAccess;

public class Main {
	public static void main(String[] args) throws Exception {
      MySQLAccess dao = new MySQLAccess();
      dao.readDataBase();
  }
}
