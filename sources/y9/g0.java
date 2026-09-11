package y9;

import java.util.List;
import org.telegram.ui.Cells.p6;
public final class g0 {
    public String f49757a;
    public String f49758b;
    public String f49759c;
    public Long d;
    public Long f49760e;
    public Boolean f49761f;
    public l1 f49762g;
    public c2 h;
    public b2 f49763i;
    public m1 f49764j;
    public List f49765k;
    public Integer f49766l;

    public final h0 a() {
        String str;
        if (this.f49757a == null) {
            str = " generator";
        } else {
            str = "";
        }
        if (this.f49758b == null) {
            str = str.concat(" identifier");
        }
        if (this.d == null) {
            str = p6.t(str, " startedAt");
        }
        if (this.f49761f == null) {
            str = p6.t(str, " crashed");
        }
        if (this.f49762g == null) {
            str = p6.t(str, " app");
        }
        if (this.f49766l == null) {
            str = p6.t(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new h0(this.f49757a, this.f49758b, this.f49759c, this.d.longValue(), this.f49760e, this.f49761f.booleanValue(), this.f49762g, this.h, this.f49763i, this.f49764j, this.f49765k, this.f49766l.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
