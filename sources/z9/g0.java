package z9;

import java.util.List;
public final class g0 {
    public String f51385a;
    public String f51386b;
    public String f51387c;
    public Long d;
    public Long e;
    public Boolean f51388f;
    public l1 f51389g;
    public c2 h;
    public b2 f51390i;
    public m1 f51391j;
    public List f51392k;
    public Integer f51393l;

    public final h0 a() {
        String str;
        if (this.f51385a == null) {
            str = " generator";
        } else {
            str = "";
        }
        if (this.f51386b == null) {
            str = str.concat(" identifier");
        }
        if (this.d == null) {
            str = r.c.u(str, " startedAt");
        }
        if (this.f51388f == null) {
            str = r.c.u(str, " crashed");
        }
        if (this.f51389g == null) {
            str = r.c.u(str, " app");
        }
        if (this.f51393l == null) {
            str = r.c.u(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new h0(this.f51385a, this.f51386b, this.f51387c, this.d.longValue(), this.e, this.f51388f.booleanValue(), this.f51389g, this.h, this.f51390i, this.f51391j, this.f51392k, this.f51393l.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
