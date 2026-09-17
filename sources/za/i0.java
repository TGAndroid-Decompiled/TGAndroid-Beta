package za;

import java.util.Locale;
import java.util.UUID;
public final class i0 {
    public final p0 f51473a;
    public final rd.a f51474b;
    public final String f51475c;
    public int d;
    public z f51476e;

    public i0() {
        h0 h0Var = h0.f51468a;
        this.f51473a = p0.f51504a;
        this.f51474b = h0Var;
        this.f51475c = a();
        this.d = -1;
    }

    public final String a() {
        String uuid = ((UUID) this.f51474b.invoke()).toString();
        kotlin.jvm.internal.i.d(uuid, "uuidGenerator().toString()");
        String lowerCase = xd.j.g(uuid, "-", "").toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.i.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public final z b() {
        z zVar = this.f51476e;
        if (zVar != null) {
            return zVar;
        }
        kotlin.jvm.internal.i.h("currentSession");
        throw null;
    }
}
