package y0;

import kotlin.jvm.internal.j;
import w0.i;

public final class b extends i {

    public static final int f49444b = 0;

    public static final int f49445c = 0;

    public b(x0.a aVar, String str) {
        String type = "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/".concat(aVar.f49323a);
        j.e(type, "type");
        super(str, type);
        if (type.length() <= 0) {
            throw new IllegalArgumentException("type must not be empty");
        }
    }
}
