package y9;

import java.util.List;
import org.telegram.ui.Cells.p6;
public final class g0 {
    public String f46519a;
    public String f46520b;
    public String f46521c;
    public Long d;
    public Long e;
    public Boolean f46522f;
    public l1 f46523g;
    public c2 h;
    public b2 f46524i;
    public m1 f46525j;
    public List f46526k;
    public Integer f46527l;

    public final h0 a() {
        String str;
        if (this.f46519a == null) {
            str = " generator";
        } else {
            str = "";
        }
        if (this.f46520b == null) {
            str = str.concat(" identifier");
        }
        if (this.d == null) {
            str = p6.t(str, " startedAt");
        }
        if (this.f46522f == null) {
            str = p6.t(str, " crashed");
        }
        if (this.f46523g == null) {
            str = p6.t(str, " app");
        }
        if (this.f46527l == null) {
            str = p6.t(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new h0(this.f46519a, this.f46520b, this.f46521c, this.d.longValue(), this.e, this.f46522f.booleanValue(), this.f46523g, this.h, this.f46524i, this.f46525j, this.f46526k, this.f46527l.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
