package za;

import java.util.Locale;
import java.util.UUID;
public final class i0 {
    public final p0 f53119a;
    public final rd.a f53120b;
    public final String f53121c;
    public int d;
    public z f53122e;

    public i0() {
        h0 h0Var = h0.f53114a;
        this.f53119a = p0.f53150a;
        this.f53120b = h0Var;
        this.f53121c = a();
        this.d = -1;
    }

    public final String a() {
        String uuid = ((UUID) this.f53120b.invoke()).toString();
        kotlin.jvm.internal.i.d(uuid, "uuidGenerator().toString()");
        String lowerCase = xd.j.g(uuid, "-", "").toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.i.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public final z b() {
        z zVar = this.f53122e;
        if (zVar != null) {
            return zVar;
        }
        kotlin.jvm.internal.i.h("currentSession");
        throw null;
    }
}
