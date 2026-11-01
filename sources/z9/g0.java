package z9;

import java.util.List;
public final class g0 {
    public String f55300a;
    public String f55301b;
    public String f55302c;
    public Long d;
    public Long e;
    public Boolean f55303f;
    public l1 f55304g;
    public c2 h;
    public b2 f55305i;
    public m1 f55306j;
    public List f55307k;
    public Integer f55308l;

    public final h0 a() {
        String str;
        if (this.f55300a == null) {
            str = " generator";
        } else {
            str = "";
        }
        if (this.f55301b == null) {
            str = str.concat(" identifier");
        }
        if (this.d == null) {
            str = sc.e.A(str, " startedAt");
        }
        if (this.f55303f == null) {
            str = sc.e.A(str, " crashed");
        }
        if (this.f55304g == null) {
            str = sc.e.A(str, " app");
        }
        if (this.f55308l == null) {
            str = sc.e.A(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new h0(this.f55300a, this.f55301b, this.f55302c, this.d.longValue(), this.e, this.f55303f.booleanValue(), this.f55304g, this.h, this.f55305i, this.f55306j, this.f55307k, this.f55308l.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
