package za;

import java.util.Locale;
import java.util.UUID;
public final class i0 {
    public final p0 f53140a;
    public final rd.a f53141b;
    public final String f53142c;
    public int d;
    public z f53143e;

    public i0() {
        h0 h0Var = h0.f53135a;
        this.f53140a = p0.f53171a;
        this.f53141b = h0Var;
        this.f53142c = a();
        this.d = -1;
    }

    public final String a() {
        String uuid = ((UUID) this.f53141b.invoke()).toString();
        kotlin.jvm.internal.i.d(uuid, "uuidGenerator().toString()");
        String lowerCase = xd.j.g(uuid, "-", "").toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.i.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public final z b() {
        z zVar = this.f53143e;
        if (zVar != null) {
            return zVar;
        }
        kotlin.jvm.internal.i.h("currentSession");
        throw null;
    }
}
