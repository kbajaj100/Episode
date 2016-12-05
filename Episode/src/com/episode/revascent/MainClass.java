package com.episode.revascent;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class MainClass {

	public static void main(String[] args) throws FileNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub

		DBExecute myDB = new DBExecute();
		
		int rulecount = myDB.getRuleCount();
		int RuleID;
		
		for (int i = 1; i< rulecount; ++i){
			RuleID = myDB.getRuleID(i);
			ExecuteRuleset(RuleID, myDB);
		}
			
	}

	private static void ExecuteRuleset(int RuleID, DBExecute myDB) {
		// TODO Auto-generated method stub
		
		int side = 1;
				
		for (int j = 1; j <=2; ++j)
			myDB.ExecuteRule(RuleID,j);
	}

}
