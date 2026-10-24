package z9;

import java.util.List;
public final class g0 {
    public String f51834a;
    public String f51835b;
    public String f51836c;
    public Long d;
    public Long e;
    public Boolean f51837f;
    public l1 f51838g;
    public c2 h;
    public b2 f51839i;
    public m1 f51840j;
    public List f51841k;
    public Integer f51842l;

    public final h0 a() {
        String str;
        if (this.f51834a == null) {
            str = " generator";
        } else {
            str = "";
        }
        if (this.f51835b == null) {
            str = str.concat(" identifier");
        }
        if (this.d == null) {
            str = si.o0.u(str, " startedAt");
        }
        if (this.f51837f == null) {
            str = si.o0.u(str, " crashed");
        }
        if (this.f51838g == null) {
            str = si.o0.u(str, " app");
        }
        if (this.f51842l == null) {
            str = si.o0.u(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new h0(this.f51834a, this.f51835b, this.f51836c, this.d.longValue(), this.e, this.f51837f.booleanValue(), this.f51838g, this.h, this.f51839i, this.f51840j, this.f51841k, this.f51842l.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
