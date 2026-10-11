package za;

import android.util.Base64;
public abstract class s {
    public static final String f54404a;
    public static final String f54405b;

    static {
        byte[] bytes = r.c().getBytes(yd.a.f52223a);
        kotlin.jvm.internal.i.d(bytes, "getBytes(...)");
        String encodeToString = Base64.encodeToString(bytes, 10);
        f54404a = a1.g.q("firebase_session_", encodeToString, "_data");
        f54405b = a1.g.q("firebase_session_", encodeToString, "_settings");
    }
}
