package y9;

import java.util.List;
public final class g0 {
    public String f50639a;
    public String f50640b;
    public String f50641c;
    public Long d;
    public Long f50642e;
    public Boolean f50643f;
    public l1 f50644g;
    public c2 h;
    public b2 f50645i;
    public m1 f50646j;
    public List f50647k;
    public Integer f50648l;

    public final h0 a() {
        String str;
        if (this.f50639a == null) {
            str = " generator";
        } else {
            str = "";
        }
        if (this.f50640b == null) {
            str = str.concat(" identifier");
        }
        if (this.d == null) {
            str = t8.b.v(str, " startedAt");
        }
        if (this.f50643f == null) {
            str = t8.b.v(str, " crashed");
        }
        if (this.f50644g == null) {
            str = t8.b.v(str, " app");
        }
        if (this.f50648l == null) {
            str = t8.b.v(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new h0(this.f50639a, this.f50640b, this.f50641c, this.d.longValue(), this.f50642e, this.f50643f.booleanValue(), this.f50644g, this.h, this.f50645i, this.f50646j, this.f50647k, this.f50648l.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
