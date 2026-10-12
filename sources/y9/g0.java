package y9;

import java.util.List;
public final class g0 {
    public String f52159a;
    public String f52160b;
    public String f52161c;
    public Long d;
    public Long f52162e;
    public Boolean f52163f;
    public l1 f52164g;
    public c2 h;
    public b2 f52165i;
    public m1 f52166j;
    public List f52167k;
    public Integer f52168l;

    public final h0 a() {
        String str;
        if (this.f52159a == null) {
            str = " generator";
        } else {
            str = "";
        }
        if (this.f52160b == null) {
            str = str.concat(" identifier");
        }
        if (this.d == null) {
            str = sc.v.v(str, " startedAt");
        }
        if (this.f52163f == null) {
            str = sc.v.v(str, " crashed");
        }
        if (this.f52164g == null) {
            str = sc.v.v(str, " app");
        }
        if (this.f52168l == null) {
            str = sc.v.v(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new h0(this.f52159a, this.f52160b, this.f52161c, this.d.longValue(), this.f52162e, this.f52163f.booleanValue(), this.f52164g, this.h, this.f52165i, this.f52166j, this.f52167k, this.f52168l.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
