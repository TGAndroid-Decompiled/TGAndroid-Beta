package za;

import android.util.Base64;
public abstract class t {
    public static final String f49106a;
    public static final String f49107b;

    static {
        byte[] bytes = s.c().getBytes(xd.a.f46021a);
        kotlin.jvm.internal.i.d(bytes, "getBytes(...)");
        String encodeToString = Base64.encodeToString(bytes, 10);
        f49106a = a4.a.q("firebase_session_", encodeToString, "_data");
        f49107b = a4.a.q("firebase_session_", encodeToString, "_settings");
    }
}
