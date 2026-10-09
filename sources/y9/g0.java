package y9;

import java.util.List;
public final class g0 {
    public String f51935a;
    public String f51936b;
    public String f51937c;
    public Long d;
    public Long f51938e;
    public Boolean f51939f;
    public l1 f51940g;
    public c2 h;
    public b2 f51941i;
    public m1 f51942j;
    public List f51943k;
    public Integer f51944l;

    public final h0 a() {
        String str;
        if (this.f51935a == null) {
            str = " generator";
        } else {
            str = "";
        }
        if (this.f51936b == null) {
            str = str.concat(" identifier");
        }
        if (this.d == null) {
            str = sc.v.v(str, " startedAt");
        }
        if (this.f51939f == null) {
            str = sc.v.v(str, " crashed");
        }
        if (this.f51940g == null) {
            str = sc.v.v(str, " app");
        }
        if (this.f51944l == null) {
            str = sc.v.v(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new h0(this.f51935a, this.f51936b, this.f51937c, this.d.longValue(), this.f51938e, this.f51939f.booleanValue(), this.f51940g, this.h, this.f51941i, this.f51942j, this.f51943k, this.f51944l.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
