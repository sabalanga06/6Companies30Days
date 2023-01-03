class Solution {
    List<List<Integer>> result = new ArrayList();
    void tryCombinations(List<Integer> combination, int k, int n, int start){
        if(k==combination.size()){
            if(n==0) result.add(new ArrayList<Integer>(combination));
            return;
        }
        for(int i= start; i<=9; i++)
        {
            combination.add(i);
            tryCombinations(combination,k,n-i,i+1);
            combination.remove(combination.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> combination=new ArrayList();
        tryCombinations(combination,k,n,1);
        return result;
    }
}
