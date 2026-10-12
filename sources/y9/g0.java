package y9;

import java.util.List;
public final class g0 {
    public String f52167a;
    public String f52168b;
    public String f52169c;
    public Long d;
    public Long f52170e;
    public Boolean f52171f;
    public l1 f52172g;
    public c2 h;
    public b2 f52173i;
    public m1 f52174j;
    public List f52175k;
    public Integer f52176l;

    public final h0 a() {
        String str;
        if (this.f52167a == null) {
            str = " generator";
        } else {
            str = "";
        }
        if (this.f52168b == null) {
            str = str.concat(" identifier");
        }
        if (this.d == null) {
            str = sc.v.v(str, " startedAt");
        }
        if (this.f52171f == null) {
            str = sc.v.v(str, " crashed");
        }
        if (this.f52172g == null) {
            str = sc.v.v(str, " app");
        }
        if (this.f52176l == null) {
            str = sc.v.v(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new h0(this.f52167a, this.f52168b, this.f52169c, this.d.longValue(), this.f52170e, this.f52171f.booleanValue(), this.f52172g, this.h, this.f52173i, this.f52174j, this.f52175k, this.f52176l.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
