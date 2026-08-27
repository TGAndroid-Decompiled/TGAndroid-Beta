package y0;

import kotlin.jvm.internal.j;
import w0.d;

public final class a extends d {

    public static final int f49442b = 0;

    public static final int f49443c = 0;

    public a(x0.a aVar, String str) {
        String type = "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/".concat(aVar.f49323a);
        j.e(type, "type");
        super(str, type);
        if (type.length() <= 0) {
            throw new IllegalArgumentException("type must not be empty");
        }
    }
}
