package za;

import java.util.Locale;
import java.util.UUID;
public final class i0 {
    public final p0 f51472a;
    public final rd.a f51473b;
    public final String f51474c;
    public int d;
    public z f51475e;

    public i0() {
        h0 h0Var = h0.f51467a;
        this.f51472a = p0.f51503a;
        this.f51473b = h0Var;
        this.f51474c = a();
        this.d = -1;
    }

    public final String a() {
        String uuid = ((UUID) this.f51473b.invoke()).toString();
        kotlin.jvm.internal.i.d(uuid, "uuidGenerator().toString()");
        String lowerCase = xd.j.g(uuid, "-", "").toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.i.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public final z b() {
        z zVar = this.f51475e;
        if (zVar != null) {
            return zVar;
        }
        kotlin.jvm.internal.i.h("currentSession");
        throw null;
    }
}
