package z9;

import java.util.List;
public final class g0 {
    public String f51374a;
    public String f51375b;
    public String f51376c;
    public Long d;
    public Long e;
    public Boolean f51377f;
    public l1 f51378g;
    public c2 h;
    public b2 f51379i;
    public m1 f51380j;
    public List f51381k;
    public Integer f51382l;

    public final h0 a() {
        String str;
        if (this.f51374a == null) {
            str = " generator";
        } else {
            str = "";
        }
        if (this.f51375b == null) {
            str = str.concat(" identifier");
        }
        if (this.d == null) {
            str = r4.c.u(str, " startedAt");
        }
        if (this.f51377f == null) {
            str = r4.c.u(str, " crashed");
        }
        if (this.f51378g == null) {
            str = r4.c.u(str, " app");
        }
        if (this.f51382l == null) {
            str = r4.c.u(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new h0(this.f51374a, this.f51375b, this.f51376c, this.d.longValue(), this.e, this.f51377f.booleanValue(), this.f51378g, this.h, this.f51379i, this.f51380j, this.f51381k, this.f51382l.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
