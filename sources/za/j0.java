package za;

import java.util.Locale;
import java.util.UUID;
public final class j0 {
    public final q0 f54485a;
    public final sd.a f54486b;
    public final String f54487c;
    public int d;
    public a0 f54488e;

    public j0() {
        i0 i0Var = i0.f54481a;
        this.f54485a = q0.f54514a;
        this.f54486b = i0Var;
        this.f54487c = a();
        this.d = -1;
    }

    public final String a() {
        String uuid = ((UUID) this.f54486b.invoke()).toString();
        kotlin.jvm.internal.i.d(uuid, "uuidGenerator().toString()");
        String lowerCase = yd.j.g(uuid, "-", "").toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.i.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public final a0 b() {
        a0 a0Var = this.f54488e;
        if (a0Var != null) {
            return a0Var;
        }
        kotlin.jvm.internal.i.h("currentSession");
        throw null;
    }
}
