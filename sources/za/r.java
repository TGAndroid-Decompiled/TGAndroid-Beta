package za;

import android.util.Base64;
public abstract class r {
    public static final String f53151a;
    public static final String f53152b;

    static {
        byte[] bytes = q.c().getBytes(xd.a.f49826a);
        kotlin.jvm.internal.i.d(bytes, "getBytes(...)");
        String encodeToString = Base64.encodeToString(bytes, 10);
        f53151a = a4.a.q("firebase_session_", encodeToString, "_data");
        f53152b = a4.a.q("firebase_session_", encodeToString, "_settings");
    }
}
