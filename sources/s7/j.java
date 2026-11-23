package s7;

import java.util.HashMap;
public abstract class j {
    public static final String[] f57138a = {"text1", "text2", "icon", "intent_action", "intent_data", "intent_data_id", "intent_extra_data", "suggest_large_icon", "intent_activity", "thing_proto"};
    public static final HashMap f57139b = new HashMap(10);

    static {
        int i7 = 0;
        while (true) {
            String[] strArr = f57138a;
            if (i7 < 10) {
                f57139b.put(strArr[i7], Integer.valueOf(i7));
                i7++;
            } else {
                return;
            }
        }
    }
}
