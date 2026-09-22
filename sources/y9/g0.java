package y9;

import java.util.List;
public final class g0 {
    public String f46842a;
    public String f46843b;
    public String f46844c;
    public Long d;
    public Long e;
    public Boolean f46845f;
    public l1 f46846g;
    public c2 h;
    public b2 f46847i;
    public m1 f46848j;
    public List f46849k;
    public Integer f46850l;

    public final h0 a() {
        String str;
        if (this.f46842a == null) {
            str = " generator";
        } else {
            str = "";
        }
        if (this.f46843b == null) {
            str = str.concat(" identifier");
        }
        if (this.d == null) {
            str = v7.j0.s(str, " startedAt");
        }
        if (this.f46845f == null) {
            str = v7.j0.s(str, " crashed");
        }
        if (this.f46846g == null) {
            str = v7.j0.s(str, " app");
        }
        if (this.f46850l == null) {
            str = v7.j0.s(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new h0(this.f46842a, this.f46843b, this.f46844c, this.d.longValue(), this.e, this.f46845f.booleanValue(), this.f46846g, this.h, this.f46847i, this.f46848j, this.f46849k, this.f46850l.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
