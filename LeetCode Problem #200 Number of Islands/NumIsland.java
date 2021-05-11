public class NumIsland{
	public int numsIslands(char[][] grid){
		int count = 0;
		for(int i = 0; i<grid.length; i++){
			for(int j = 0; j<grid[i].length;j++){
				if(grid[i][j] == '1'){
					count++;
					callBFS(grid,i,j); //Breadth First Search
				}
			}
		}
		return count;
	}

	public void BFS(char[][] grid, int i, int j){
		if(i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j] == '0')
		{
			return;
		}
		grid[i][j] = '0';
		callBFS(grid,i+1,j);//up
		callBFS(grid,i-1,j);//down
		callBFS(grid,i,j+1);//right
		callBFS(grid,i,j-1);//left
}
}