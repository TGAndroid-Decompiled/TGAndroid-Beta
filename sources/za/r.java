package za;

import android.util.Base64;
public abstract class r {
    public static final String f49125a;
    public static final String f49126b;

    static {
        byte[] bytes = q.c().getBytes(xd.a.f46040a);
        kotlin.jvm.internal.i.d(bytes, "getBytes(...)");
        String encodeToString = Base64.encodeToString(bytes, 10);
        f49125a = a4.a.p("firebase_session_", encodeToString, "_data");
        f49126b = a4.a.p("firebase_session_", encodeToString, "_settings");
    }
}
