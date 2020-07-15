class firstReccuringCharacter {

    String word = "kwkertyiy";
    char[] rec = new char[word.length()];
    char answer;

    public firstReccuringCharacter() {

    }

    public char getRec(String word) {
        boolean done = false;
        for(int i=0; i<word.length(); i++) {
            rec[i] = word.charAt(i);
        }
            for(int i=0;i<rec.length;i++) {
                while(done == false) {
                    for(int j=0;j<rec.length;j++) {
                        boolean ans = isEqual(rec[i], rec[j]);
                        if(ans == true) {
                            answer = rec[j];
                            done = true;
                        }
                    }
            }
        }

        return answer;
    }

    public String getWord() {
        return word;
    }

    public char getAnswer() {
        return answer;
    }

    public boolean isEqual(char rec, char rec2) {
        boolean bool = false;
        if(rec == rec2) {
            bool = true;
        }
        else {
            
        }
        return bool;
    }
    public static void main(String[] args) {
        firstReccuringCharacter test = new firstReccuringCharacter();
        test.getRec(test.getWord());
        System.out.println("Recurring Character is: " + test.getAnswer());
    }
}