package z9;

import java.util.List;
public final class g0 {
    public String f51363a;
    public String f51364b;
    public String f51365c;
    public Long d;
    public Long e;
    public Boolean f51366f;
    public l1 f51367g;
    public c2 h;
    public b2 f51368i;
    public m1 f51369j;
    public List f51370k;
    public Integer f51371l;

    public final h0 a() {
        String str;
        if (this.f51363a == null) {
            str = " generator";
        } else {
            str = "";
        }
        if (this.f51364b == null) {
            str = str.concat(" identifier");
        }
        if (this.d == null) {
            str = r4.c.u(str, " startedAt");
        }
        if (this.f51366f == null) {
            str = r4.c.u(str, " crashed");
        }
        if (this.f51367g == null) {
            str = r4.c.u(str, " app");
        }
        if (this.f51371l == null) {
            str = r4.c.u(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new h0(this.f51363a, this.f51364b, this.f51365c, this.d.longValue(), this.e, this.f51366f.booleanValue(), this.f51367g, this.h, this.f51368i, this.f51369j, this.f51370k, this.f51371l.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
