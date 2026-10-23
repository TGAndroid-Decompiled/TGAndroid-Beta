package z9;

import java.util.List;
public final class g0 {
    public String f51835a;
    public String f51836b;
    public String f51837c;
    public Long d;
    public Long e;
    public Boolean f51838f;
    public l1 f51839g;
    public c2 h;
    public b2 f51840i;
    public m1 f51841j;
    public List f51842k;
    public Integer f51843l;

    public final h0 a() {
        String str;
        if (this.f51835a == null) {
            str = " generator";
        } else {
            str = "";
        }
        if (this.f51836b == null) {
            str = str.concat(" identifier");
        }
        if (this.d == null) {
            str = si.o0.u(str, " startedAt");
        }
        if (this.f51838f == null) {
            str = si.o0.u(str, " crashed");
        }
        if (this.f51839g == null) {
            str = si.o0.u(str, " app");
        }
        if (this.f51843l == null) {
            str = si.o0.u(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new h0(this.f51835a, this.f51836b, this.f51837c, this.d.longValue(), this.e, this.f51838f.booleanValue(), this.f51839g, this.h, this.f51840i, this.f51841j, this.f51842k, this.f51843l.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
