package za;

import java.util.Locale;
import java.util.UUID;
public final class j0 {
    public final q0 f54340a;
    public final sd.a f54341b;
    public final String f54342c;
    public int d;
    public a0 f54343e;

    public j0() {
        i0 i0Var = i0.f54336a;
        this.f54340a = q0.f54369a;
        this.f54341b = i0Var;
        this.f54342c = a();
        this.d = -1;
    }

    public final String a() {
        String uuid = ((UUID) this.f54341b.invoke()).toString();
        kotlin.jvm.internal.i.d(uuid, "uuidGenerator().toString()");
        String lowerCase = yd.j.g(uuid, "-", "").toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.i.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public final a0 b() {
        a0 a0Var = this.f54343e;
        if (a0Var != null) {
            return a0Var;
        }
        kotlin.jvm.internal.i.h("currentSession");
        throw null;
    }
}
