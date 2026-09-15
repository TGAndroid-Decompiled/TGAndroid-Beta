package v7;

import java.io.Serializable;
public final class d8 {
    public String f43945a;
    public String f43946b;
    public String f43947c;
    public String d;
    public String e;
    public Object f43948f;
    public Object f43949g;
    public Object h;
    public Integer f43950i;
    public Object f43951j;
    public Serializable f43952k;

    public y9.a0 a() {
        String str;
        if (this.f43945a == null) {
            str = " sdkVersion";
        } else {
            str = "";
        }
        if (this.f43946b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.f43950i == null) {
            str = org.telegram.ui.Cells.p6.t(str, " platform");
        }
        if (this.f43947c == null) {
            str = org.telegram.ui.Cells.p6.t(str, " installationUuid");
        }
        if (((String) this.f43952k) == null) {
            str = org.telegram.ui.Cells.p6.t(str, " buildVersion");
        }
        if (((String) this.f43948f) == null) {
            str = org.telegram.ui.Cells.p6.t(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new y9.a0(this.f43945a, this.f43946b, this.f43950i.intValue(), this.f43947c, this.d, this.e, (String) this.f43952k, (String) this.f43948f, (y9.d2) this.f43949g, (y9.j1) this.h, (y9.g1) this.f43951j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
