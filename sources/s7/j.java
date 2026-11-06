package s7;

import java.util.HashMap;
public abstract class j {
    public static final String[] f54835a = {"text1", "text2", "icon", "intent_action", "intent_data", "intent_data_id", "intent_extra_data", "suggest_large_icon", "intent_activity", "thing_proto"};
    public static final HashMap f54836b = new HashMap(10);

    static {
        int i7 = 0;
        while (true) {
            String[] strArr = f54835a;
            if (i7 < 10) {
                f54836b.put(strArr[i7], Integer.valueOf(i7));
                i7++;
            } else {
                return;
            }
        }
    }
}
