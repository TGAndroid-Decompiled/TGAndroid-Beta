package za;

import java.util.Locale;
import java.util.UUID;
public final class i0 {
    public final p0 f51442a;
    public final rd.a f51443b;
    public final String f51444c;
    public int d;
    public z f51445e;

    public i0() {
        h0 h0Var = h0.f51437a;
        this.f51442a = p0.f51473a;
        this.f51443b = h0Var;
        this.f51444c = a();
        this.d = -1;
    }

    public final String a() {
        String uuid = ((UUID) this.f51443b.invoke()).toString();
        kotlin.jvm.internal.i.d(uuid, "uuidGenerator().toString()");
        String lowerCase = xd.j.g(uuid, "-", "").toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.i.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public final z b() {
        z zVar = this.f51445e;
        if (zVar != null) {
            return zVar;
        }
        kotlin.jvm.internal.i.h("currentSession");
        throw null;
    }
}
