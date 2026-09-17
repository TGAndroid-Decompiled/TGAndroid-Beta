package y9;

import java.util.List;
import org.telegram.ui.Cells.p6;
public final class g0 {
    public String f49787a;
    public String f49788b;
    public String f49789c;
    public Long d;
    public Long f49790e;
    public Boolean f49791f;
    public l1 f49792g;
    public c2 h;
    public b2 f49793i;
    public m1 f49794j;
    public List f49795k;
    public Integer f49796l;

    public final h0 a() {
        String str;
        if (this.f49787a == null) {
            str = " generator";
        } else {
            str = "";
        }
        if (this.f49788b == null) {
            str = str.concat(" identifier");
        }
        if (this.d == null) {
            str = p6.t(str, " startedAt");
        }
        if (this.f49791f == null) {
            str = p6.t(str, " crashed");
        }
        if (this.f49792g == null) {
            str = p6.t(str, " app");
        }
        if (this.f49796l == null) {
            str = p6.t(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new h0(this.f49787a, this.f49788b, this.f49789c, this.d.longValue(), this.f49790e, this.f49791f.booleanValue(), this.f49792g, this.h, this.f49793i, this.f49794j, this.f49795k, this.f49796l.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
