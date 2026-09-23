package y9;

import java.util.List;
public final class g0 {
    public String f46473a;
    public String f46474b;
    public String f46475c;
    public Long d;
    public Long e;
    public Boolean f46476f;
    public l1 f46477g;
    public c2 h;
    public b2 f46478i;
    public m1 f46479j;
    public List f46480k;
    public Integer f46481l;

    public final h0 a() {
        String str;
        if (this.f46473a == null) {
            str = " generator";
        } else {
            str = "";
        }
        if (this.f46474b == null) {
            str = str.concat(" identifier");
        }
        if (this.d == null) {
            str = w.c.g(str, " startedAt");
        }
        if (this.f46476f == null) {
            str = w.c.g(str, " crashed");
        }
        if (this.f46477g == null) {
            str = w.c.g(str, " app");
        }
        if (this.f46481l == null) {
            str = w.c.g(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new h0(this.f46473a, this.f46474b, this.f46475c, this.d.longValue(), this.e, this.f46476f.booleanValue(), this.f46477g, this.h, this.f46478i, this.f46479j, this.f46480k, this.f46481l.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
