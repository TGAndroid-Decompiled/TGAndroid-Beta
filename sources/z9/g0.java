package z9;

import java.util.List;
public final class g0 {
    public String f49980a;
    public String f49981b;
    public String f49982c;
    public Long d;
    public Long e;
    public Boolean f49983f;
    public l1 f49984g;
    public c2 h;
    public b2 f49985i;
    public m1 f49986j;
    public List f49987k;
    public Integer f49988l;

    public final h0 a() {
        String str;
        if (this.f49980a == null) {
            str = " generator";
        } else {
            str = "";
        }
        if (this.f49981b == null) {
            str = str.concat(" identifier");
        }
        if (this.d == null) {
            str = t8.b.u(str, " startedAt");
        }
        if (this.f49983f == null) {
            str = t8.b.u(str, " crashed");
        }
        if (this.f49984g == null) {
            str = t8.b.u(str, " app");
        }
        if (this.f49988l == null) {
            str = t8.b.u(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new h0(this.f49980a, this.f49981b, this.f49982c, this.d.longValue(), this.e, this.f49983f.booleanValue(), this.f49984g, this.h, this.f49985i, this.f49986j, this.f49987k, this.f49988l.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
