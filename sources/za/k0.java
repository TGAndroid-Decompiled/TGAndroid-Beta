package za;

import java.util.Locale;
import java.util.UUID;
public final class k0 {
    public final r0 f49079a;
    public final rd.a f49080b;
    public final String f49081c;
    public int d;
    public b0 e;

    public k0() {
        j0 j0Var = j0.f49077a;
        this.f49079a = r0.f49106a;
        this.f49080b = j0Var;
        this.f49081c = a();
        this.d = -1;
    }

    public final String a() {
        String uuid = ((UUID) this.f49080b.invoke()).toString();
        kotlin.jvm.internal.i.d(uuid, "uuidGenerator().toString()");
        String lowerCase = xd.j.g(uuid, "-", "").toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.i.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public final b0 b() {
        b0 b0Var = this.e;
        if (b0Var != null) {
            return b0Var;
        }
        kotlin.jvm.internal.i.h("currentSession");
        throw null;
    }
}
