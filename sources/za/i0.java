package za;

import java.util.Locale;
import java.util.UUID;
public final class i0 {
    public final p0 f48818a;
    public final rd.a f48819b;
    public final String f48820c;
    public int d;
    public z e;

    public i0() {
        h0 h0Var = h0.f48814a;
        this.f48818a = p0.f48847a;
        this.f48819b = h0Var;
        this.f48820c = a();
        this.d = -1;
    }

    public final String a() {
        String uuid = ((UUID) this.f48819b.invoke()).toString();
        kotlin.jvm.internal.i.d(uuid, "uuidGenerator().toString()");
        String lowerCase = xd.j.g(uuid, "-", "").toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.i.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public final z b() {
        z zVar = this.e;
        if (zVar != null) {
            return zVar;
        }
        kotlin.jvm.internal.i.h("currentSession");
        throw null;
    }
}
