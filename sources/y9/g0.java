package y9;

import java.util.List;
public final class g0 {
    public String f46799a;
    public String f46800b;
    public String f46801c;
    public Long d;
    public Long e;
    public Boolean f46802f;
    public l1 f46803g;
    public c2 h;
    public b2 f46804i;
    public m1 f46805j;
    public List f46806k;
    public Integer f46807l;

    public final h0 a() {
        String str;
        if (this.f46799a == null) {
            str = " generator";
        } else {
            str = "";
        }
        if (this.f46800b == null) {
            str = str.concat(" identifier");
        }
        if (this.d == null) {
            str = v7.j.t(str, " startedAt");
        }
        if (this.f46802f == null) {
            str = v7.j.t(str, " crashed");
        }
        if (this.f46803g == null) {
            str = v7.j.t(str, " app");
        }
        if (this.f46807l == null) {
            str = v7.j.t(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new h0(this.f46799a, this.f46800b, this.f46801c, this.d.longValue(), this.e, this.f46802f.booleanValue(), this.f46803g, this.h, this.f46804i, this.f46805j, this.f46806k, this.f46807l.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
