package y9;

import java.util.List;
public final class g0 {
    public String f52022a;
    public String f52023b;
    public String f52024c;
    public Long d;
    public Long f52025e;
    public Boolean f52026f;
    public l1 f52027g;
    public c2 h;
    public b2 f52028i;
    public m1 f52029j;
    public List f52030k;
    public Integer f52031l;

    public final h0 a() {
        String str;
        if (this.f52022a == null) {
            str = " generator";
        } else {
            str = "";
        }
        if (this.f52023b == null) {
            str = str.concat(" identifier");
        }
        if (this.d == null) {
            str = sc.v.v(str, " startedAt");
        }
        if (this.f52026f == null) {
            str = sc.v.v(str, " crashed");
        }
        if (this.f52027g == null) {
            str = sc.v.v(str, " app");
        }
        if (this.f52031l == null) {
            str = sc.v.v(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new h0(this.f52022a, this.f52023b, this.f52024c, this.d.longValue(), this.f52025e, this.f52026f.booleanValue(), this.f52027g, this.h, this.f52028i, this.f52029j, this.f52030k, this.f52031l.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
