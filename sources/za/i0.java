package za;

import java.util.Locale;
import java.util.UUID;
public final class i0 {
    public final p0 f51441a;
    public final rd.a f51442b;
    public final String f51443c;
    public int d;
    public z f51444e;

    public i0() {
        h0 h0Var = h0.f51436a;
        this.f51441a = p0.f51472a;
        this.f51442b = h0Var;
        this.f51443c = a();
        this.d = -1;
    }

    public final String a() {
        String uuid = ((UUID) this.f51442b.invoke()).toString();
        kotlin.jvm.internal.i.d(uuid, "uuidGenerator().toString()");
        String lowerCase = xd.j.g(uuid, "-", "").toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.i.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public final z b() {
        z zVar = this.f51444e;
        if (zVar != null) {
            return zVar;
        }
        kotlin.jvm.internal.i.h("currentSession");
        throw null;
    }
}
