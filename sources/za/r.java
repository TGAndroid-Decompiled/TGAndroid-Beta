package za;

import android.util.Base64;
public abstract class r {
    public static final String f48818a;
    public static final String f48819b;

    static {
        byte[] bytes = q.c().getBytes(xd.a.f45738a);
        kotlin.jvm.internal.i.d(bytes, "getBytes(...)");
        String encodeToString = Base64.encodeToString(bytes, 10);
        f48818a = a4.a.q("firebase_session_", encodeToString, "_data");
        f48819b = a4.a.q("firebase_session_", encodeToString, "_settings");
    }
}
