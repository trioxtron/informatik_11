public class Student extends Mensch{
    private int mat;
    
    public Student(int mat, String name){
        super(name);
        
        this.mat = mat;
    }
    
    public int getMat(){
        return mat;
    }
    
    public void setMat(int mat){
        this.mat = mat;
    }
}