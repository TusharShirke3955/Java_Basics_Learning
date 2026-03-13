package test;

    public class Encapsulation_Java {

        public static void main(String[] args) {

//                test.Account ac = new test.Account();
//                ac.setbalance(2550);
//                System.out.println(ac.getbalance());

//                test.BankStatement bc = new test.BankStatement();
//                bc.setbal(100);
//                System.out.println(bc.getbal());
//
//                State st = new State();
//                st.setstate("Maharashtra");
//                System.out.println(st.getStates());

            School s = new School();
            s.setfees(5500);
            System.out.println(s.getfees());
        }

        private int balance;

        //  ## Setting the balance in the Balance variable
        public void setbalance(int b) {
            balance = b;
        }

        //  ## Get the balance
        public int getbalance() {
            return balance;
        }
    }

    class BankStatement {
        private int bankbalance;

        public void setbal(int x) {
            bankbalance = x;
        }

        public int getbal() {
            return bankbalance;
        }
    }

    class State {
        private String States;

        public void setstate(String s) {
            States = s;
        }

        public String getStates() {
            return States;
        }
    }

    class School {
        private int fees;

        public void setfees(int s) {
            fees = s;
        }

        public int getfees() {
            return fees;
        }
    }



