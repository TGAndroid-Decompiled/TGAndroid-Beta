package za;

import android.util.Base64;
public abstract class r {
    public static final String f48853a;
    public static final String f48854b;

    static {
        byte[] bytes = q.c().getBytes(xd.a.f45770a);
        kotlin.jvm.internal.i.d(bytes, "getBytes(...)");
        String encodeToString = Base64.encodeToString(bytes, 10);
        f48853a = a4.a.p("firebase_session_", encodeToString, "_data");
        f48854b = a4.a.p("firebase_session_", encodeToString, "_settings");
    }
}
