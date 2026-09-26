package p7;

import java.util.HashMap;
public abstract class k {
    public static final String[] f40977a = {"text1", "text2", "icon", "intent_action", "intent_data", "intent_data_id", "intent_extra_data", "suggest_large_icon", "intent_activity", "thing_proto"};
    public static final HashMap f40978b = new HashMap(10);

    static {
        int i10 = 0;
        while (true) {
            String[] strArr = f40977a;
            if (i10 < 10) {
                f40978b.put(strArr[i10], Integer.valueOf(i10));
                i10++;
            } else {
                return;
            }
        }
    }
}
