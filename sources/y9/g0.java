package y9;

import java.util.List;
public final class g0 {
    public String f50638a;
    public String f50639b;
    public String f50640c;
    public Long d;
    public Long f50641e;
    public Boolean f50642f;
    public l1 f50643g;
    public c2 h;
    public b2 f50644i;
    public m1 f50645j;
    public List f50646k;
    public Integer f50647l;

    public final h0 a() {
        String str;
        if (this.f50638a == null) {
            str = " generator";
        } else {
            str = "";
        }
        if (this.f50639b == null) {
            str = str.concat(" identifier");
        }
        if (this.d == null) {
            str = t8.b.v(str, " startedAt");
        }
        if (this.f50642f == null) {
            str = t8.b.v(str, " crashed");
        }
        if (this.f50643g == null) {
            str = t8.b.v(str, " app");
        }
        if (this.f50647l == null) {
            str = t8.b.v(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new h0(this.f50638a, this.f50639b, this.f50640c, this.d.longValue(), this.f50641e, this.f50642f.booleanValue(), this.f50643g, this.h, this.f50644i, this.f50645j, this.f50646k, this.f50647l.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
