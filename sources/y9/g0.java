package y9;

import java.util.List;
public final class g0 {
    public String f46774a;
    public String f46775b;
    public String f46776c;
    public Long d;
    public Long e;
    public Boolean f46777f;
    public l1 f46778g;
    public c2 h;
    public b2 f46779i;
    public m1 f46780j;
    public List f46781k;
    public Integer f46782l;

    public final h0 a() {
        String str;
        if (this.f46774a == null) {
            str = " generator";
        } else {
            str = "";
        }
        if (this.f46775b == null) {
            str = str.concat(" identifier");
        }
        if (this.d == null) {
            str = t8.b.v(str, " startedAt");
        }
        if (this.f46777f == null) {
            str = t8.b.v(str, " crashed");
        }
        if (this.f46778g == null) {
            str = t8.b.v(str, " app");
        }
        if (this.f46782l == null) {
            str = t8.b.v(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new h0(this.f46774a, this.f46775b, this.f46776c, this.d.longValue(), this.e, this.f46777f.booleanValue(), this.f46778g, this.h, this.f46779i, this.f46780j, this.f46781k, this.f46782l.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
