package za;

import java.util.Locale;
import java.util.UUID;
public final class k0 {
    public final r0 f54301a;
    public final sd.a f54302b;
    public final String f54303c;
    public int d;
    public b0 f54304e;

    public k0() {
        j0 j0Var = j0.f54299a;
        this.f54301a = r0.f54329a;
        this.f54302b = j0Var;
        this.f54303c = a();
        this.d = -1;
    }

    public final String a() {
        String uuid = ((UUID) this.f54302b.invoke()).toString();
        kotlin.jvm.internal.i.d(uuid, "uuidGenerator().toString()");
        String lowerCase = yd.j.g(uuid, "-", "").toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.i.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public final b0 b() {
        b0 b0Var = this.f54304e;
        if (b0Var != null) {
            return b0Var;
        }
        kotlin.jvm.internal.i.h("currentSession");
        throw null;
    }
}
