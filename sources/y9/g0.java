package y9;

import java.util.List;
public final class g0 {
    public String f46798a;
    public String f46799b;
    public String f46800c;
    public Long d;
    public Long e;
    public Boolean f46801f;
    public l1 f46802g;
    public c2 h;
    public b2 f46803i;
    public m1 f46804j;
    public List f46805k;
    public Integer f46806l;

    public final h0 a() {
        String str;
        if (this.f46798a == null) {
            str = " generator";
        } else {
            str = "";
        }
        if (this.f46799b == null) {
            str = str.concat(" identifier");
        }
        if (this.d == null) {
            str = v7.j.t(str, " startedAt");
        }
        if (this.f46801f == null) {
            str = v7.j.t(str, " crashed");
        }
        if (this.f46802g == null) {
            str = v7.j.t(str, " app");
        }
        if (this.f46806l == null) {
            str = v7.j.t(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new h0(this.f46798a, this.f46799b, this.f46800c, this.d.longValue(), this.e, this.f46801f.booleanValue(), this.f46802g, this.h, this.f46803i, this.f46804j, this.f46805k, this.f46806l.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
