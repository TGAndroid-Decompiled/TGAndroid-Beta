package za;

import java.util.Locale;
import java.util.UUID;
public final class k0 {
    public final r0 f49066a;
    public final rd.a f49067b;
    public final String f49068c;
    public int d;
    public b0 e;

    public k0() {
        j0 j0Var = j0.f49064a;
        this.f49066a = r0.f49093a;
        this.f49067b = j0Var;
        this.f49068c = a();
        this.d = -1;
    }

    public final String a() {
        String uuid = ((UUID) this.f49067b.invoke()).toString();
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
