package z9;

import java.util.List;
public final class g0 {
    public String f51373a;
    public String f51374b;
    public String f51375c;
    public Long d;
    public Long e;
    public Boolean f51376f;
    public l1 f51377g;
    public c2 h;
    public b2 f51378i;
    public m1 f51379j;
    public List f51380k;
    public Integer f51381l;

    public final h0 a() {
        String str;
        if (this.f51373a == null) {
            str = " generator";
        } else {
            str = "";
        }
        if (this.f51374b == null) {
            str = str.concat(" identifier");
        }
        if (this.d == null) {
            str = r4.c.u(str, " startedAt");
        }
        if (this.f51376f == null) {
            str = r4.c.u(str, " crashed");
        }
        if (this.f51377g == null) {
            str = r4.c.u(str, " app");
        }
        if (this.f51381l == null) {
            str = r4.c.u(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new h0(this.f51373a, this.f51374b, this.f51375c, this.d.longValue(), this.e, this.f51376f.booleanValue(), this.f51377g, this.h, this.f51378i, this.f51379j, this.f51380k, this.f51381l.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
