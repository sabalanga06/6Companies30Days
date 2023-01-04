class Solution {
    public String getHint(String secret, String guess) {
        int bulls=0;
        int cows=0;
        int[] secretguess=new int[10];
        for(int i=0; i<secret.length(); i++)
        {
            if(secret.charAt(i)==guess.charAt(i))
                bulls++;
            else{
                if(secretguess[guess.charAt(i)-'0']-- >0) cows++;
                if(secretguess[secret.charAt(i)-'0']++ <0) cows++;
            }
        }return bulls +"A"+cows+"B";
    }
}
