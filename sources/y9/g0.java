package y9;

import java.util.List;
public final class g0 {
    public String f46515a;
    public String f46516b;
    public String f46517c;
    public Long d;
    public Long e;
    public Boolean f46518f;
    public l1 f46519g;
    public c2 h;
    public b2 f46520i;
    public m1 f46521j;
    public List f46522k;
    public Integer f46523l;

    public final h0 a() {
        String str;
        if (this.f46515a == null) {
            str = " generator";
        } else {
            str = "";
        }
        if (this.f46516b == null) {
            str = str.concat(" identifier");
        }
        if (this.d == null) {
            str = w.c.g(str, " startedAt");
        }
        if (this.f46518f == null) {
            str = w.c.g(str, " crashed");
        }
        if (this.f46519g == null) {
            str = w.c.g(str, " app");
        }
        if (this.f46523l == null) {
            str = w.c.g(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new h0(this.f46515a, this.f46516b, this.f46517c, this.d.longValue(), this.e, this.f46518f.booleanValue(), this.f46519g, this.h, this.f46520i, this.f46521j, this.f46522k, this.f46523l.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
