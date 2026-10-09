package p7;

import java.util.HashMap;
public abstract class k {
    public static final String[] f45495a = {"text1", "text2", "icon", "intent_action", "intent_data", "intent_data_id", "intent_extra_data", "suggest_large_icon", "intent_activity", "thing_proto"};
    public static final HashMap f45496b = new HashMap(10);

    static {
        int i10 = 0;
        while (true) {
            String[] strArr = f45495a;
            if (i10 < 10) {
                f45496b.put(strArr[i10], Integer.valueOf(i10));
                i10++;
            } else {
                return;
            }
        }
    }
}
