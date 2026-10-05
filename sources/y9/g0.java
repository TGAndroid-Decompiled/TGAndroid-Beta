package y9;

import java.util.List;
public final class g0 {
    public String f50654a;
    public String f50655b;
    public String f50656c;
    public Long d;
    public Long f50657e;
    public Boolean f50658f;
    public l1 f50659g;
    public c2 h;
    public b2 f50660i;
    public m1 f50661j;
    public List f50662k;
    public Integer f50663l;

    public final h0 a() {
        String str;
        if (this.f50654a == null) {
            str = " generator";
        } else {
            str = "";
        }
        if (this.f50655b == null) {
            str = str.concat(" identifier");
        }
        if (this.d == null) {
            str = sa.e.v(str, " startedAt");
        }
        if (this.f50658f == null) {
            str = sa.e.v(str, " crashed");
        }
        if (this.f50659g == null) {
            str = sa.e.v(str, " app");
        }
        if (this.f50663l == null) {
            str = sa.e.v(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new h0(this.f50654a, this.f50655b, this.f50656c, this.d.longValue(), this.f50657e, this.f50658f.booleanValue(), this.f50659g, this.h, this.f50660i, this.f50661j, this.f50662k, this.f50663l.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
