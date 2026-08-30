package pa;

import java.io.IOException;
public abstract class t {
    public static final p f41090a;
    public static final q f41091b;
    public static final t[] f41092c;

    static {
        p pVar = new p();
        f41090a = pVar;
        q qVar = new q();
        f41091b = qVar;
        f41092c = new t[]{pVar, qVar, new t() {
            public static Double b(String str, xa.a aVar) {
                try {
                    Double valueOf = Double.valueOf(str);
                    if (!valueOf.isInfinite() && !valueOf.isNaN()) {
                        return valueOf;
                    }
                    throw new IOException("JSON forbids NaN and infinities: " + valueOf + "; at path " + aVar.j());
                } catch (NumberFormatException e) {
                    StringBuilder t6 = android.support.v4.media.a.t("Cannot parse ", str, "; at path ");
                    t6.append(aVar.j());
                    throw new RuntimeException(t6.toString(), e);
                }
            }

            @Override
            public final Number a(xa.a aVar) {
                String v = aVar.v();
                if (v.indexOf(46) >= 0) {
                    return b(v, aVar);
                }
                try {
                    return Long.valueOf(Long.parseLong(v));
                } catch (NumberFormatException unused) {
                    return b(v, aVar);
                }
            }
        }, new t() {
            @Override
            public final Number a(xa.a aVar) {
                String v = aVar.v();
                try {
                    return ra.d.i(v);
                } catch (NumberFormatException e) {
                    StringBuilder t6 = android.support.v4.media.a.t("Cannot parse ", v, "; at path ");
                    t6.append(aVar.j());
                    throw new RuntimeException(t6.toString(), e);
                }
            }
        }};
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f41092c.clone();
    }

    public abstract Number a(xa.a aVar);
}
