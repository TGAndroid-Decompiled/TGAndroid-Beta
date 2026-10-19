package z9;

import java.util.List;
public final class g0 {
    public String f51365a;
    public String f51366b;
    public String f51367c;
    public Long d;
    public Long e;
    public Boolean f51368f;
    public l1 f51369g;
    public c2 h;
    public b2 f51370i;
    public m1 f51371j;
    public List f51372k;
    public Integer f51373l;

    public final h0 a() {
        String str;
        if (this.f51365a == null) {
            str = " generator";
        } else {
            str = "";
        }
        if (this.f51366b == null) {
            str = str.concat(" identifier");
        }
        if (this.d == null) {
            str = r4.c.u(str, " startedAt");
        }
        if (this.f51368f == null) {
            str = r4.c.u(str, " crashed");
        }
        if (this.f51369g == null) {
            str = r4.c.u(str, " app");
        }
        if (this.f51373l == null) {
            str = r4.c.u(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new h0(this.f51365a, this.f51366b, this.f51367c, this.d.longValue(), this.e, this.f51368f.booleanValue(), this.f51369g, this.h, this.f51370i, this.f51371j, this.f51372k, this.f51373l.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
