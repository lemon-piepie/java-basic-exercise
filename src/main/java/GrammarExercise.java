import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GrammarExercise {
    public static void main(String[] args) {
    	//需要从命令行读入
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入两行表单：");
        String firstWordList = 	sc.next();
        String secondWordList = sc.next();

        List<String> result = findCommonWordsWithSpace(firstWordList,secondWordList);
        //按要求输出到命令行
        for(String s : result) {
        	//加空格
        	System.out.println(s.replace("", " ").trim());
        }
    }

    public static List<String> findCommonWordsWithSpace(String firstWordList, String secondWordList) {
    	//在这编写实现代码
    	String str1 = firstWordList;
    	String str2 = secondWordList;
    	
    	String strArr1[] = str1.split(",");
    	String strArr2[] = str2.split(",");
    	
    	List<String> result = new ArrayList<String>();
    	for(int i = 0; i < strArr1.length; i++) {
    		for(int j = 0; j < strArr2.length; j++) {
    			
    			if(strArr2[j].equalsIgnoreCase(strArr1[i])){    				
    				result.add(strArr2[j].toUpperCase());    				  				
    			}
    		}
    	}
    	//去重复
    	for (int k = 0; k <result.size()-1; k++) {
            for (int l = result.size()-1; l >k; l--) {
                if (result.get(l).equals(result.get(k))) {
                	result.remove(l);
                }
            }
        }
    	
        return result;
    }
}