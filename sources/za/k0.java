package za;

import java.util.Locale;
import java.util.UUID;
public final class k0 {
    public final r0 f54257a;
    public final sd.a f54258b;
    public final String f54259c;
    public int d;
    public b0 f54260e;

    public k0() {
        j0 j0Var = j0.f54255a;
        this.f54257a = r0.f54285a;
        this.f54258b = j0Var;
        this.f54259c = a();
        this.d = -1;
    }

    public final String a() {
        String uuid = ((UUID) this.f54258b.invoke()).toString();
        kotlin.jvm.internal.i.d(uuid, "uuidGenerator().toString()");
        String lowerCase = yd.j.g(uuid, "-", "").toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.i.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public final b0 b() {
        b0 b0Var = this.f54260e;
        if (b0Var != null) {
            return b0Var;
        }
        kotlin.jvm.internal.i.h("currentSession");
        throw null;
    }
}
