package za;

import java.util.Locale;
import java.util.UUID;
public final class i0 {
    public final p0 f49095a;
    public final rd.a f49096b;
    public final String f49097c;
    public int d;
    public z e;

    public i0() {
        h0 h0Var = h0.f49091a;
        this.f49095a = p0.f49124a;
        this.f49096b = h0Var;
        this.f49097c = a();
        this.d = -1;
    }

    public final String a() {
        String uuid = ((UUID) this.f49096b.invoke()).toString();
        kotlin.jvm.internal.i.d(uuid, "uuidGenerator().toString()");
        String lowerCase = xd.j.g(uuid, "-", "").toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.i.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public final z b() {
        z zVar = this.e;
        if (zVar != null) {
            return zVar;
        }
        kotlin.jvm.internal.i.h("currentSession");
        throw null;
    }
}
