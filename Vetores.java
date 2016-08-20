/**
 * @author Yuri
 * Utilizando o formato padrão do vetor neste exemplo foi utilizado o método sort
 * da classe Arrays para retornar o vetor ordenado.
 */
import java.util.*;

public class Vetores 
{
    
    public static int[] merge(int v1[],int v2[])
    {
        int [] vet3=new int[v1.length+v2.length];
        
         /*Este for intercala os valores dos dois vetores como pedido pelo 
         * Exercício
        */        
        int aux=0;
        for (int i = 0; i < v1.length; i++) 
        {  
            
                int num1 = v1[i];  
                int num2 = v2[i];  
                vet3[aux]=num1;  
                aux+=1;
                vet3[aux]=num2;  
                aux+=1;    
              
        }   
        
        Arrays.sort(vet3);  
        
        return vet3;       
        
    } 
    
    
    public static void main(String[] args)
    {
    
        int[] vet={1,3,4,5,8,9,10,11,2};
        int[]vet2={15,17,14,18,19,20,21,22,23};
    
        Arrays.sort(vet);
        Arrays.sort(vet2);
        
        int [] resultado = merge(vet,vet2);
        
        System.out.println(Arrays.toString(resultado));   
    
    }    
    
}
