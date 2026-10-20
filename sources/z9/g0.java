package z9;

import java.util.List;
public final class g0 {
    public String f51370a;
    public String f51371b;
    public String f51372c;
    public Long d;
    public Long e;
    public Boolean f51373f;
    public l1 f51374g;
    public c2 h;
    public b2 f51375i;
    public m1 f51376j;
    public List f51377k;
    public Integer f51378l;

    public final h0 a() {
        String str;
        if (this.f51370a == null) {
            str = " generator";
        } else {
            str = "";
        }
        if (this.f51371b == null) {
            str = str.concat(" identifier");
        }
        if (this.d == null) {
            str = r4.c.u(str, " startedAt");
        }
        if (this.f51373f == null) {
            str = r4.c.u(str, " crashed");
        }
        if (this.f51374g == null) {
            str = r4.c.u(str, " app");
        }
        if (this.f51378l == null) {
            str = r4.c.u(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new h0(this.f51370a, this.f51371b, this.f51372c, this.d.longValue(), this.e, this.f51373f.booleanValue(), this.f51374g, this.h, this.f51375i, this.f51376j, this.f51377k, this.f51378l.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
