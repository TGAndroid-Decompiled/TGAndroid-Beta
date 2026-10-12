package z9;

import java.util.List;
public final class g0 {
    public String f49979a;
    public String f49980b;
    public String f49981c;
    public Long d;
    public Long e;
    public Boolean f49982f;
    public l1 f49983g;
    public c2 h;
    public b2 f49984i;
    public m1 f49985j;
    public List f49986k;
    public Integer f49987l;

    public final h0 a() {
        String str;
        if (this.f49979a == null) {
            str = " generator";
        } else {
            str = "";
        }
        if (this.f49980b == null) {
            str = str.concat(" identifier");
        }
        if (this.d == null) {
            str = t8.b.u(str, " startedAt");
        }
        if (this.f49982f == null) {
            str = t8.b.u(str, " crashed");
        }
        if (this.f49983g == null) {
            str = t8.b.u(str, " app");
        }
        if (this.f49987l == null) {
            str = t8.b.u(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new h0(this.f49979a, this.f49980b, this.f49981c, this.d.longValue(), this.e, this.f49982f.booleanValue(), this.f49983g, this.h, this.f49984i, this.f49985j, this.f49986k, this.f49987l.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
