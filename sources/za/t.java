package za;

import android.util.Base64;
public abstract class t {
    public static final String f49107a;
    public static final String f49108b;

    static {
        byte[] bytes = s.c().getBytes(xd.a.f46022a);
        kotlin.jvm.internal.i.d(bytes, "getBytes(...)");
        String encodeToString = Base64.encodeToString(bytes, 10);
        f49107a = a4.a.q("firebase_session_", encodeToString, "_data");
        f49108b = a4.a.q("firebase_session_", encodeToString, "_settings");
    }
}
