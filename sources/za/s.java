package za;

import android.util.Base64;
public abstract class s {
    public static final String f54284a;
    public static final String f54285b;

    static {
        byte[] bytes = r.c().getBytes(yd.a.f52100a);
        kotlin.jvm.internal.i.d(bytes, "getBytes(...)");
        String encodeToString = Base64.encodeToString(bytes, 10);
        f54284a = a1.g.q("firebase_session_", encodeToString, "_data");
        f54285b = a1.g.q("firebase_session_", encodeToString, "_settings");
    }
}
