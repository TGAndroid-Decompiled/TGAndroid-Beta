package y9;

import java.util.List;
public final class g0 {
    public String f46797a;
    public String f46798b;
    public String f46799c;
    public Long d;
    public Long e;
    public Boolean f46800f;
    public l1 f46801g;
    public c2 h;
    public b2 f46802i;
    public m1 f46803j;
    public List f46804k;
    public Integer f46805l;

    public final h0 a() {
        String str;
        if (this.f46797a == null) {
            str = " generator";
        } else {
            str = "";
        }
        if (this.f46798b == null) {
            str = str.concat(" identifier");
        }
        if (this.d == null) {
            str = v7.j.t(str, " startedAt");
        }
        if (this.f46800f == null) {
            str = v7.j.t(str, " crashed");
        }
        if (this.f46801g == null) {
            str = v7.j.t(str, " app");
        }
        if (this.f46805l == null) {
            str = v7.j.t(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new h0(this.f46797a, this.f46798b, this.f46799c, this.d.longValue(), this.e, this.f46800f.booleanValue(), this.f46801g, this.h, this.f46802i, this.f46803j, this.f46804k, this.f46805l.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
