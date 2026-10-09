package y9;

import java.util.List;
public final class g0 {
    public String f51933a;
    public String f51934b;
    public String f51935c;
    public Long d;
    public Long f51936e;
    public Boolean f51937f;
    public l1 f51938g;
    public c2 h;
    public b2 f51939i;
    public m1 f51940j;
    public List f51941k;
    public Integer f51942l;

    public final h0 a() {
        String str;
        if (this.f51933a == null) {
            str = " generator";
        } else {
            str = "";
        }
        if (this.f51934b == null) {
            str = str.concat(" identifier");
        }
        if (this.d == null) {
            str = sc.v.v(str, " startedAt");
        }
        if (this.f51937f == null) {
            str = sc.v.v(str, " crashed");
        }
        if (this.f51938g == null) {
            str = sc.v.v(str, " app");
        }
        if (this.f51942l == null) {
            str = sc.v.v(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new h0(this.f51933a, this.f51934b, this.f51935c, this.d.longValue(), this.f51936e, this.f51937f.booleanValue(), this.f51938g, this.h, this.f51939i, this.f51940j, this.f51941k, this.f51942l.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
