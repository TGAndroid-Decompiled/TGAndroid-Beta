package za;

import java.util.Locale;
import java.util.UUID;
public final class k0 {
    public final r0 f48749a;
    public final rd.a f48750b;
    public final String f48751c;
    public int d;
    public b0 e;

    public k0() {
        j0 j0Var = j0.f48747a;
        this.f48749a = r0.f48775a;
        this.f48750b = j0Var;
        this.f48751c = a();
        this.d = -1;
    }

    public final String a() {
        String uuid = ((UUID) this.f48750b.invoke()).toString();
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
