package y9;

import java.util.List;
import org.telegram.ui.Cells.p6;
public final class g0 {
    public String f46547a;
    public String f46548b;
    public String f46549c;
    public Long d;
    public Long e;
    public Boolean f46550f;
    public l1 f46551g;
    public c2 h;
    public b2 f46552i;
    public m1 f46553j;
    public List f46554k;
    public Integer f46555l;

    public final h0 a() {
        String str;
        if (this.f46547a == null) {
            str = " generator";
        } else {
            str = "";
        }
        if (this.f46548b == null) {
            str = str.concat(" identifier");
        }
        if (this.d == null) {
            str = p6.t(str, " startedAt");
        }
        if (this.f46550f == null) {
            str = p6.t(str, " crashed");
        }
        if (this.f46551g == null) {
            str = p6.t(str, " app");
        }
        if (this.f46555l == null) {
            str = p6.t(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new h0(this.f46547a, this.f46548b, this.f46549c, this.d.longValue(), this.e, this.f46550f.booleanValue(), this.f46551g, this.h, this.f46552i, this.f46553j, this.f46554k, this.f46555l.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
