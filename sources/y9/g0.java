package y9;

import java.util.List;
import org.telegram.ui.Cells.p6;
public final class g0 {
    public String f46542a;
    public String f46543b;
    public String f46544c;
    public Long d;
    public Long e;
    public Boolean f46545f;
    public l1 f46546g;
    public c2 h;
    public b2 f46547i;
    public m1 f46548j;
    public List f46549k;
    public Integer f46550l;

    public final h0 a() {
        String str;
        if (this.f46542a == null) {
            str = " generator";
        } else {
            str = "";
        }
        if (this.f46543b == null) {
            str = str.concat(" identifier");
        }
        if (this.d == null) {
            str = p6.t(str, " startedAt");
        }
        if (this.f46545f == null) {
            str = p6.t(str, " crashed");
        }
        if (this.f46546g == null) {
            str = p6.t(str, " app");
        }
        if (this.f46550l == null) {
            str = p6.t(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new h0(this.f46542a, this.f46543b, this.f46544c, this.d.longValue(), this.e, this.f46545f.booleanValue(), this.f46546g, this.h, this.f46547i, this.f46548j, this.f46549k, this.f46550l.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
