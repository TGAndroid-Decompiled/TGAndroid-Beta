package z9;

import java.util.List;
public final class g0 {
    public String f51410a;
    public String f51411b;
    public String f51412c;
    public Long d;
    public Long e;
    public Boolean f51413f;
    public l1 f51414g;
    public c2 h;
    public b2 f51415i;
    public m1 f51416j;
    public List f51417k;
    public Integer f51418l;

    public final h0 a() {
        String str;
        if (this.f51410a == null) {
            str = " generator";
        } else {
            str = "";
        }
        if (this.f51411b == null) {
            str = str.concat(" identifier");
        }
        if (this.d == null) {
            str = r4.c.u(str, " startedAt");
        }
        if (this.f51413f == null) {
            str = r4.c.u(str, " crashed");
        }
        if (this.f51414g == null) {
            str = r4.c.u(str, " app");
        }
        if (this.f51418l == null) {
            str = r4.c.u(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new h0(this.f51410a, this.f51411b, this.f51412c, this.d.longValue(), this.e, this.f51413f.booleanValue(), this.f51414g, this.h, this.f51415i, this.f51416j, this.f51417k, this.f51418l.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
