package r7;

import java.util.HashMap;
public abstract class j {
    public static final String[] f54419a = {"text1", "text2", "icon", "intent_action", "intent_data", "intent_data_id", "intent_extra_data", "suggest_large_icon", "intent_activity", "thing_proto"};
    public static final HashMap f54420b = new HashMap(10);

    static {
        int i3 = 0;
        while (true) {
            String[] strArr = f54419a;
            if (i3 < 10) {
                f54420b.put(strArr[i3], Integer.valueOf(i3));
                i3++;
            } else {
                return;
            }
        }
    }
}
