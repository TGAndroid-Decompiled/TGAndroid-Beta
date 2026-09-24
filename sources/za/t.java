package za;

import android.util.Base64;
public abstract class t {
    public static final String f49094a;
    public static final String f49095b;

    static {
        byte[] bytes = s.c().getBytes(xd.a.f46006a);
        kotlin.jvm.internal.i.d(bytes, "getBytes(...)");
        String encodeToString = Base64.encodeToString(bytes, 10);
        f49094a = a4.a.q("firebase_session_", encodeToString, "_data");
        f49095b = a4.a.q("firebase_session_", encodeToString, "_settings");
    }
}
