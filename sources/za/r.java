package za;

import android.util.Base64;
public abstract class r {
    public static final String f47945a;
    public static final String f47946b;

    static {
        byte[] bytes = q.c().getBytes(xd.a.f45082a);
        kotlin.jvm.internal.i.d(bytes, "getBytes(...)");
        String encodeToString = Base64.encodeToString(bytes, 10);
        f47945a = a4.a.p("firebase_session_", encodeToString, "_data");
        f47946b = a4.a.p("firebase_session_", encodeToString, "_settings");
    }
}
