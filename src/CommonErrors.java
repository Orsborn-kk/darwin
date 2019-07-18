import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CommonErrors {

    /**
     * Array转ArrayList
     *
     * @param arr String[]
     * @return List<String>
     */
    public List<String> arrayTurnArrayList(String[] arr) {
        /*该方法会返回java.util.Arrays.ArrayList类*/
        //List<String> list = Arrays.asList(arr);
        //list.add("李信");
        /*ArrayList类没有实现增加元素的add()方法，会抛出UnsupportedOperationException异常*/
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(arr));
        arrayList.add("李信");
        return arrayList;
    }

    /**
     * 判断一个数组是否包含某个值
     *
     * @param arr String[] arr
     * @return boolean
     */
    public boolean arrayContainValue(String[] arr, String targetValue) {
        if (arr == null) {
            return false;
        }
        //方法1
        //Set<String> set = new HashSet<>(Arrays.asList(arr));
        //return set.contains(targetValue);
        //方法2（可读性更强）
        //return Arrays.asList(arr).contains(targetValue);
        //方法3
        for (String s : arr
        ) {
            if (s.equals(targetValue))
                return true;
        }
        return false;
    }

    /**
     * 在循环内部删除List中的一个元素
     *
     * @param arr String[] arr
     */
    public void deleteListElementInLoop(String[] arr) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(arr));
        /*
         * 在循环中不能使用foreach循环操作元素，因为在foreach循环里先操作再调用next()方法
         */
//        for (int i = 0; i < arrayList.size(); i++) {
//            arrayList.remove(i);
//        }
        /*
         * 迭代器
         */

        for (Iterator<String> iter = arrayList.iterator(); iter.hasNext(); ) {
            String s = iter.next();
            if (s.equals("王翦")) {
                iter.remove();
            }
        }
        System.out.println(arrayList);
    }

}
