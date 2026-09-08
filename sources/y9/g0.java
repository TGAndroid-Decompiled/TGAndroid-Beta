package y9;

import java.util.List;
import org.telegram.ui.Cells.p6;
public final class g0 {
    public String f49786a;
    public String f49787b;
    public String f49788c;
    public Long d;
    public Long f49789e;
    public Boolean f49790f;
    public l1 f49791g;
    public c2 h;
    public b2 f49792i;
    public m1 f49793j;
    public List f49794k;
    public Integer f49795l;

    public final h0 a() {
        String str;
        if (this.f49786a == null) {
            str = " generator";
        } else {
            str = "";
        }
        if (this.f49787b == null) {
            str = str.concat(" identifier");
        }
        if (this.d == null) {
            str = p6.t(str, " startedAt");
        }
        if (this.f49790f == null) {
            str = p6.t(str, " crashed");
        }
        if (this.f49791g == null) {
            str = p6.t(str, " app");
        }
        if (this.f49795l == null) {
            str = p6.t(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new h0(this.f49786a, this.f49787b, this.f49788c, this.d.longValue(), this.f49789e, this.f49790f.booleanValue(), this.f49791g, this.h, this.f49792i, this.f49793j, this.f49794k, this.f49795l.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
