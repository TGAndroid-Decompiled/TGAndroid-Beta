package za;

import android.util.Base64;
public abstract class r {
    public static final String f53145a;
    public static final String f53146b;

    static {
        byte[] bytes = q.c().getBytes(xd.a.f49817a);
        kotlin.jvm.internal.i.d(bytes, "getBytes(...)");
        String encodeToString = Base64.encodeToString(bytes, 10);
        f53145a = a4.a.p("firebase_session_", encodeToString, "_data");
        f53146b = a4.a.p("firebase_session_", encodeToString, "_settings");
    }
}
