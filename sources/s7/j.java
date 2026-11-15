package s7;

import java.util.HashMap;
public abstract class j {
    public static final String[] f56519a = {"text1", "text2", "icon", "intent_action", "intent_data", "intent_data_id", "intent_extra_data", "suggest_large_icon", "intent_activity", "thing_proto"};
    public static final HashMap f56520b = new HashMap(10);

    static {
        int i7 = 0;
        while (true) {
            String[] strArr = f56519a;
            if (i7 < 10) {
                f56520b.put(strArr[i7], Integer.valueOf(i7));
                i7++;
            } else {
                return;
            }
        }
    }
}
