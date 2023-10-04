/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author sys-user
 */
public class MyappDataReader {
    
    public static Properties p ;
    
    public  MyappDataReader () 
            
            
    {
        try {
            
        
        File fls = new File("C:\\Users\\Shaj\\Documents\\NetBeansProjects\\MyApp\\src\\Main\\Myapp.properties");
        
        FileReader fr = new FileReader(fls);
        
        p = new Properties();
        
        p.load(fr);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public String getUserName(){
    String username = p.getProperty("username");
        return username;
    }
   
    
    public String getPassword(){
    String password = p.getProperty("password");
        return password;
       
}
    public String getSql_New_Account(){
       String sql_new_account = p.getProperty("sql_new_account");
        return sql_new_account;
       
    }
    
    public String getSql_Acc(){
        String sql_acc = p.getProperty("sql_acc");
        return sql_acc;
    }
    
    public String getCredit_Message(){
        String credit_message = p.getProperty("credit_message");
        return credit_message;
    }
    
     public String getDebit_Message(){
        String debit_message = p.getProperty("debit_message");
        return debit_message;
        
     }
     
     public String getSql_Accounts_Accountno(){
         String sql_accounts_accountno = p.getProperty("sql_accounts_accountno");
         return sql_accounts_accountno;
     }
     
     public String getCustomer_Name(){
         String customer_name = p.getProperty("customer_name");
         return customer_name;
     }
     
     public String getCustomer_Dob(){
         String customer_dob = p.getProperty("customer_dob");
         return customer_dob;
     }
     
     public String getCustomer_Gender(){
         String customer_gender = p.getProperty("customer_gender");
        return customer_gender;
     
     }
     
     public String getCustomer_Nationality(){
         String customer_nationality = p.getProperty("customer_nationality");
         return customer_nationality;
     }
     
     public String getcustomer_Account_Type(){
         String customer_account_type = p.getProperty("customer_account_type");
         return customer_account_type;
     }
     
     public String getcustomer_Account_No(){
         String customer_account_no = p.getProperty("customer_account_no");
         return customer_account_no;
     }
     
     public String getCustomer_Mobile(){
         String customer_mobile = p.getProperty("customer_mobile");
         return customer_mobile;
     }
     public String getCustomer_Security_Question(){
         String customer_security_question = p.getProperty("customer_security_question");
         return customer_security_question;
     }
     
     public String getCustomer_Amount(){
         String customer_amount = p.getProperty("customer_amount");
         return customer_amount;
     }
     
     public String getSql_Deposite(){
         String sql_deposite = p.getProperty("sql_deposite");
         return sql_deposite;
              
     }
     public String getSql_Withdraw(){
         String sql_withdraw = p.getProperty("sql_withdraw");
         return sql_withdraw;
     }
     
     public String getSql_Transfer1(){
         String sql_transfer1 = p.getProperty("sql_transfer1");
         return sql_transfer1;
               
     }
     
       public String getSql_Transfer2(){
         String sql_transfer2 = p.getProperty("sql_transfer2");
         return sql_transfer2;
               
     }
       
       public String getSql_Change_Pin(){
           String sql_change_pin  = p.getProperty("sql_change_pin");
           return sql_change_pin ;
       } 
       
       public String getSql_Transactions(){
           String sql_transactions = p.getProperty("sql_transactions");
           return sql_transactions;
       }
       
       public String getsql_Accounts(){
           String sql_Accounts = p.getProperty("sql_Accounts");
           return sql_Accounts;
                   
       }
       
       public String getSql_Employee_Login(){
           String sql_employee_login = p.getProperty("sql_employee_login");
           return sql_employee_login;
       }
     
       public String getSql_New_Employee(){
           String sql_new_employee = p.getProperty("sql_new_employee");
           return sql_new_employee;
       }
     
       public String getSql_Employee_Page(){
           String sql_employee_page = p.getProperty("sql_employee_page");
           return sql_employee_page;
       }
       
       public String getSql_Employee_Table(){
           String sql_employee_table = p.getProperty("sql_employee_table");
           return sql_employee_table;
       }
       
       public String getEmp_Name(){
           String emp_name = p.getProperty("emp_name");
           return emp_name;
       }    
       
        public String getEmp_Dob(){
           String emp_dob = p.getProperty("emp_dob");
           return emp_dob;
       }     
        
        public String GetEmp_Mobile(){
            String emp_mobile = p.getProperty("emp_mobile");
            return emp_mobile;
        }
        
        public String getEmp_Designation (){
            String emp_designation = p.getProperty("emp_designation");
            return emp_designation ;
        }
        
        public String getEmp_Branch(){
            String emp_branch = p.getProperty("emp_branch");
            return emp_branch;
        }
        
        public String getEmp_Salary(){
            String emp_salary = p.getProperty("emp_salary");
            return emp_salary;
        }
        
        public String getSql_Customer_Table(){
            String sql_customer_table = p.getProperty("sql_customer_table");
            return sql_customer_table ;
        } 
     
        public String getMaster_Username(){
            String master_username = p.getProperty("master_username");
            return master_username ;
        } 
     
       public String getMaster_Password(){
            String master_password = p.getProperty("master_password");
            return master_password ;
        } 
             
        public String getSql_Insert_Transaction(){
            String Sql_insert_Transaction  = p.getProperty("Sql_insert_Transaction");
            return Sql_insert_Transaction ;
        } 
        
        public String getsql_accounts_Customer_Update(){
            String sql_accounts_customer_update = p.getProperty("sql_accounts_customer_update");
            return sql_accounts_customer_update;
        }
        
        public String getsql_Accounts_Customer(){
            String sql_accounts_customer  = p.getProperty("sql_accounts_customer");
            return sql_accounts_customer ;
        } 
        
        
     
     
  
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
}