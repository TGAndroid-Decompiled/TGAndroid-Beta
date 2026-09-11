package za;

import android.util.Base64;
public abstract class r {
    public static final String f51473a;
    public static final String f51474b;

    static {
        byte[] bytes = q.c().getBytes(xd.a.f49336a);
        kotlin.jvm.internal.i.d(bytes, "getBytes(...)");
        String encodeToString = Base64.encodeToString(bytes, 10);
        f51473a = a4.a.p("firebase_session_", encodeToString, "_data");
        f51474b = a4.a.p("firebase_session_", encodeToString, "_settings");
    }
}
