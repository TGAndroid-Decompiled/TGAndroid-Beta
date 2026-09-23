package za;

import android.util.Base64;
public abstract class t {
    public static final String f48776a;
    public static final String f48777b;

    static {
        byte[] bytes = s.c().getBytes(xd.a.f45692a);
        kotlin.jvm.internal.i.d(bytes, "getBytes(...)");
        String encodeToString = Base64.encodeToString(bytes, 10);
        f48776a = a4.a.q("firebase_session_", encodeToString, "_data");
        f48777b = a4.a.q("firebase_session_", encodeToString, "_settings");
    }
}
