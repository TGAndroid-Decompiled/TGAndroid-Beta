package za;

import android.util.Base64;
public abstract class r {
    public static final String f48848a;
    public static final String f48849b;

    static {
        byte[] bytes = q.c().getBytes(xd.a.f45765a);
        kotlin.jvm.internal.i.d(bytes, "getBytes(...)");
        String encodeToString = Base64.encodeToString(bytes, 10);
        f48848a = a4.a.p("firebase_session_", encodeToString, "_data");
        f48849b = a4.a.p("firebase_session_", encodeToString, "_settings");
    }
}
