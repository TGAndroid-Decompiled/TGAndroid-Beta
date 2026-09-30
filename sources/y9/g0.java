package y9;

import java.util.List;
public final class g0 {
    public String f46906a;
    public String f46907b;
    public String f46908c;
    public Long d;
    public Long e;
    public Boolean f46909f;
    public l1 f46910g;
    public c2 h;
    public b2 f46911i;
    public m1 f46912j;
    public List f46913k;
    public Integer f46914l;

    public final h0 a() {
        String str;
        if (this.f46906a == null) {
            str = " generator";
        } else {
            str = "";
        }
        if (this.f46907b == null) {
            str = str.concat(" identifier");
        }
        if (this.d == null) {
            str = v7.j.t(str, " startedAt");
        }
        if (this.f46909f == null) {
            str = v7.j.t(str, " crashed");
        }
        if (this.f46910g == null) {
            str = v7.j.t(str, " app");
        }
        if (this.f46914l == null) {
            str = v7.j.t(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new h0(this.f46906a, this.f46907b, this.f46908c, this.d.longValue(), this.e, this.f46909f.booleanValue(), this.f46910g, this.h, this.f46911i, this.f46912j, this.f46913k, this.f46914l.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
