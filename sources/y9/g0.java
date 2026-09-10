package y9;

import java.util.List;
import org.telegram.ui.Cells.r6;
public final class g0 {
    public String f46669a;
    public String f46670b;
    public String f46671c;
    public Long d;
    public Long e;
    public Boolean f46672f;
    public l1 f46673g;
    public c2 h;
    public b2 f46674i;
    public m1 f46675j;
    public List f46676k;
    public Integer f46677l;

    public final h0 a() {
        String str;
        if (this.f46669a == null) {
            str = " generator";
        } else {
            str = "";
        }
        if (this.f46670b == null) {
            str = str.concat(" identifier");
        }
        if (this.d == null) {
            str = r6.t(str, " startedAt");
        }
        if (this.f46672f == null) {
            str = r6.t(str, " crashed");
        }
        if (this.f46673g == null) {
            str = r6.t(str, " app");
        }
        if (this.f46677l == null) {
            str = r6.t(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new h0(this.f46669a, this.f46670b, this.f46671c, this.d.longValue(), this.e, this.f46672f.booleanValue(), this.f46673g, this.h, this.f46674i, this.f46675j, this.f46676k, this.f46677l.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
