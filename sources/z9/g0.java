package z9;

import java.util.List;
public final class g0 {
    public String f55282a;
    public String f55283b;
    public String f55284c;
    public Long d;
    public Long e;
    public Boolean f55285f;
    public l1 f55286g;
    public c2 h;
    public b2 f55287i;
    public m1 f55288j;
    public List f55289k;
    public Integer f55290l;

    public final h0 a() {
        String str;
        if (this.f55282a == null) {
            str = " generator";
        } else {
            str = "";
        }
        if (this.f55283b == null) {
            str = str.concat(" identifier");
        }
        if (this.d == null) {
            str = sc.e.A(str, " startedAt");
        }
        if (this.f55285f == null) {
            str = sc.e.A(str, " crashed");
        }
        if (this.f55286g == null) {
            str = sc.e.A(str, " app");
        }
        if (this.f55290l == null) {
            str = sc.e.A(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new h0(this.f55282a, this.f55283b, this.f55284c, this.d.longValue(), this.e, this.f55285f.booleanValue(), this.f55286g, this.h, this.f55287i, this.f55288j, this.f55289k, this.f55290l.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
