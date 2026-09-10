package za;

import java.util.Locale;
import java.util.UUID;
public final class j0 {
    public final q0 f47918a;
    public final rd.a f47919b;
    public final String f47920c;
    public int d;
    public a0 e;

    public j0() {
        i0 i0Var = i0.f47914a;
        this.f47918a = q0.f47944a;
        this.f47919b = i0Var;
        this.f47920c = a();
        this.d = -1;
    }

    public final String a() {
        String uuid = ((UUID) this.f47919b.invoke()).toString();
        kotlin.jvm.internal.i.d(uuid, "uuidGenerator().toString()");
        String lowerCase = xd.j.g(uuid, "-", "").toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.i.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public final a0 b() {
        a0 a0Var = this.e;
        if (a0Var != null) {
            return a0Var;
        }
        kotlin.jvm.internal.i.h("currentSession");
        throw null;
    }
}
