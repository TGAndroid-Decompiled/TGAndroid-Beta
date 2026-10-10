package y9;

import java.util.List;
public final class g0 {
    public String f51979a;
    public String f51980b;
    public String f51981c;
    public Long d;
    public Long f51982e;
    public Boolean f51983f;
    public l1 f51984g;
    public c2 h;
    public b2 f51985i;
    public m1 f51986j;
    public List f51987k;
    public Integer f51988l;

    public final h0 a() {
        String str;
        if (this.f51979a == null) {
            str = " generator";
        } else {
            str = "";
        }
        if (this.f51980b == null) {
            str = str.concat(" identifier");
        }
        if (this.d == null) {
            str = sc.v.v(str, " startedAt");
        }
        if (this.f51983f == null) {
            str = sc.v.v(str, " crashed");
        }
        if (this.f51984g == null) {
            str = sc.v.v(str, " app");
        }
        if (this.f51988l == null) {
            str = sc.v.v(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new h0(this.f51979a, this.f51980b, this.f51981c, this.d.longValue(), this.f51982e, this.f51983f.booleanValue(), this.f51984g, this.h, this.f51985i, this.f51986j, this.f51987k, this.f51988l.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
