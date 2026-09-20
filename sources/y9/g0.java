package y9;

import java.util.List;
public final class g0 {
    public String f46821a;
    public String f46822b;
    public String f46823c;
    public Long d;
    public Long e;
    public Boolean f46824f;
    public l1 f46825g;
    public c2 h;
    public b2 f46826i;
    public m1 f46827j;
    public List f46828k;
    public Integer f46829l;

    public final h0 a() {
        String str;
        if (this.f46821a == null) {
            str = " generator";
        } else {
            str = "";
        }
        if (this.f46822b == null) {
            str = str.concat(" identifier");
        }
        if (this.d == null) {
            str = v7.j0.s(str, " startedAt");
        }
        if (this.f46824f == null) {
            str = v7.j0.s(str, " crashed");
        }
        if (this.f46825g == null) {
            str = v7.j0.s(str, " app");
        }
        if (this.f46829l == null) {
            str = v7.j0.s(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new h0(this.f46821a, this.f46822b, this.f46823c, this.d.longValue(), this.e, this.f46824f.booleanValue(), this.f46825g, this.h, this.f46826i, this.f46827j, this.f46828k, this.f46829l.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
