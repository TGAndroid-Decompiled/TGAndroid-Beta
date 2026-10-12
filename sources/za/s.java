package za;

import android.util.Base64;
public abstract class s {
    public static final String f54515a;
    public static final String f54516b;

    static {
        byte[] bytes = r.c().getBytes(yd.a.f52334a);
        kotlin.jvm.internal.i.d(bytes, "getBytes(...)");
        String encodeToString = Base64.encodeToString(bytes, 10);
        f54515a = a1.g.q("firebase_session_", encodeToString, "_data");
        f54516b = a1.g.q("firebase_session_", encodeToString, "_settings");
    }
}
