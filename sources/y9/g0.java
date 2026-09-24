package y9;

import java.util.List;
public final class g0 {
    public String f46787a;
    public String f46788b;
    public String f46789c;
    public Long d;
    public Long e;
    public Boolean f46790f;
    public l1 f46791g;
    public c2 h;
    public b2 f46792i;
    public m1 f46793j;
    public List f46794k;
    public Integer f46795l;

    public final h0 a() {
        String str;
        if (this.f46787a == null) {
            str = " generator";
        } else {
            str = "";
        }
        if (this.f46788b == null) {
            str = str.concat(" identifier");
        }
        if (this.d == null) {
            str = v7.j.t(str, " startedAt");
        }
        if (this.f46790f == null) {
            str = v7.j.t(str, " crashed");
        }
        if (this.f46791g == null) {
            str = v7.j.t(str, " app");
        }
        if (this.f46795l == null) {
            str = v7.j.t(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new h0(this.f46787a, this.f46788b, this.f46789c, this.d.longValue(), this.e, this.f46790f.booleanValue(), this.f46791g, this.h, this.f46792i, this.f46793j, this.f46794k, this.f46795l.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
