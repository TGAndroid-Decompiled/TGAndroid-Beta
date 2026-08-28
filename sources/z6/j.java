package z6;

import java.util.HashMap;
public abstract class j {
    public static final String[] f50326a = {"text1", "text2", "icon", "intent_action", "intent_data", "intent_data_id", "intent_extra_data", "suggest_large_icon", "intent_activity", "thing_proto"};
    public static final HashMap f50327b = new HashMap(10);

    static {
        int i9 = 0;
        while (true) {
            String[] strArr = f50326a;
            if (i9 < 10) {
                f50327b.put(strArr[i9], Integer.valueOf(i9));
                i9++;
            } else {
                return;
            }
        }
    }
}
