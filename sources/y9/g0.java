package y9;

import java.util.List;
import org.telegram.ui.Cells.p6;
public final class g0 {
    public String f49758a;
    public String f49759b;
    public String f49760c;
    public Long d;
    public Long f49761e;
    public Boolean f49762f;
    public l1 f49763g;
    public c2 h;
    public b2 f49764i;
    public m1 f49765j;
    public List f49766k;
    public Integer f49767l;

    public final h0 a() {
        String str;
        if (this.f49758a == null) {
            str = " generator";
        } else {
            str = "";
        }
        if (this.f49759b == null) {
            str = str.concat(" identifier");
        }
        if (this.d == null) {
            str = p6.t(str, " startedAt");
        }
        if (this.f49762f == null) {
            str = p6.t(str, " crashed");
        }
        if (this.f49763g == null) {
            str = p6.t(str, " app");
        }
        if (this.f49767l == null) {
            str = p6.t(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new h0(this.f49758a, this.f49759b, this.f49760c, this.d.longValue(), this.f49761e, this.f49762f.booleanValue(), this.f49763g, this.h, this.f49764i, this.f49765j, this.f49766k, this.f49767l.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
