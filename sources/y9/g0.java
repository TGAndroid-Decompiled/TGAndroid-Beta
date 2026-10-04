package y9;

import java.util.List;
public final class g0 {
    public String f50647a;
    public String f50648b;
    public String f50649c;
    public Long d;
    public Long f50650e;
    public Boolean f50651f;
    public l1 f50652g;
    public c2 h;
    public b2 f50653i;
    public m1 f50654j;
    public List f50655k;
    public Integer f50656l;

    public final h0 a() {
        String str;
        if (this.f50647a == null) {
            str = " generator";
        } else {
            str = "";
        }
        if (this.f50648b == null) {
            str = str.concat(" identifier");
        }
        if (this.d == null) {
            str = sa.e.v(str, " startedAt");
        }
        if (this.f50651f == null) {
            str = sa.e.v(str, " crashed");
        }
        if (this.f50652g == null) {
            str = sa.e.v(str, " app");
        }
        if (this.f50656l == null) {
            str = sa.e.v(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new h0(this.f50647a, this.f50648b, this.f50649c, this.d.longValue(), this.f50650e, this.f50651f.booleanValue(), this.f50652g, this.h, this.f50653i, this.f50654j, this.f50655k, this.f50656l.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
