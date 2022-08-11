//Q44
public class wildcardmatching {
    public boolean isMatch(String s, String p) {
        if (s == null || p == null) return false;
        if (p.equals("*")) return true;
        if (s.equals(p)) return true;
        int N = p.length();
        int M = s.length();
        int dp[][] =new int[N][M];
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                dp[i][j]= -1;
            }
        }
        return findMatch(N-1,M-1,s,p,dp);
    }

    Boolean findMatch(int i, int j ,String s , String p, int[][]dp){
        if(i<0 && j<0){
            return true;
        }//base case
        if(i < 0 && j>=0){
            return false;
        }//base case
        if(i >= 0 && j<0){
            for(int i1=0;i1<=i;i1++){
                if(p.charAt(i1) != '*'){
                    return false;
                }
            }
            return true;
        }//base case
        if(dp[i][j] != -1){
            return dp[i][j] == 1?true:false;
        }
        
        if(p.charAt(i) == s.charAt(j) || p.charAt(i) == '?'){
            dp[i][j] = findMatch(i-1,j-1,s,p,dp) ?1:0;
            return dp[i][j]==1?true:false;
        }//IF MATCH
        if(p.charAt(i) == '*'){
            Boolean considerEmpty = findMatch(i-1, j ,s,p,dp);
            Boolean partOfSequence= findMatch(i,j-1,s,p,dp);
            dp[i][j] =  (considerEmpty || partOfSequence)?1:0 ;
            return dp[i][j] ==1 ?true:false;
        }//a sequences
        return false;
    }
        
}
