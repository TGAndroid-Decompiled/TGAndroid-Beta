package y9;

import java.util.List;
public final class g0 {
    public String f46800a;
    public String f46801b;
    public String f46802c;
    public Long d;
    public Long e;
    public Boolean f46803f;
    public l1 f46804g;
    public c2 h;
    public b2 f46805i;
    public m1 f46806j;
    public List f46807k;
    public Integer f46808l;

    public final h0 a() {
        String str;
        if (this.f46800a == null) {
            str = " generator";
        } else {
            str = "";
        }
        if (this.f46801b == null) {
            str = str.concat(" identifier");
        }
        if (this.d == null) {
            str = v7.j.t(str, " startedAt");
        }
        if (this.f46803f == null) {
            str = v7.j.t(str, " crashed");
        }
        if (this.f46804g == null) {
            str = v7.j.t(str, " app");
        }
        if (this.f46808l == null) {
            str = v7.j.t(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new h0(this.f46800a, this.f46801b, this.f46802c, this.d.longValue(), this.e, this.f46803f.booleanValue(), this.f46804g, this.h, this.f46805i, this.f46806j, this.f46807k, this.f46808l.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
