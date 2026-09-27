package y9;

import java.util.List;
public final class g0 {
    public String f46843a;
    public String f46844b;
    public String f46845c;
    public Long d;
    public Long e;
    public Boolean f46846f;
    public l1 f46847g;
    public c2 h;
    public b2 f46848i;
    public m1 f46849j;
    public List f46850k;
    public Integer f46851l;

    public final h0 a() {
        String str;
        if (this.f46843a == null) {
            str = " generator";
        } else {
            str = "";
        }
        if (this.f46844b == null) {
            str = str.concat(" identifier");
        }
        if (this.d == null) {
            str = v7.k0.s(str, " startedAt");
        }
        if (this.f46846f == null) {
            str = v7.k0.s(str, " crashed");
        }
        if (this.f46847g == null) {
            str = v7.k0.s(str, " app");
        }
        if (this.f46851l == null) {
            str = v7.k0.s(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new h0(this.f46843a, this.f46844b, this.f46845c, this.d.longValue(), this.e, this.f46846f.booleanValue(), this.f46847g, this.h, this.f46848i, this.f46849j, this.f46850k, this.f46851l.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
