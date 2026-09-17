package v7;

import java.io.Serializable;
public final class c8 {
    public String f47435a;
    public String f47436b;
    public String f47437c;
    public String d;
    public String f47438e;
    public Object f47439f;
    public Object f47440g;
    public Object h;
    public Integer f47441i;
    public Object f47442j;
    public Serializable f47443k;

    public y9.a0 a() {
        String str;
        if (this.f47435a == null) {
            str = " sdkVersion";
        } else {
            str = "";
        }
        if (this.f47436b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.f47441i == null) {
            str = org.telegram.ui.Cells.p6.t(str, " platform");
        }
        if (this.f47437c == null) {
            str = org.telegram.ui.Cells.p6.t(str, " installationUuid");
        }
        if (((String) this.f47443k) == null) {
            str = org.telegram.ui.Cells.p6.t(str, " buildVersion");
        }
        if (((String) this.f47439f) == null) {
            str = org.telegram.ui.Cells.p6.t(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new y9.a0(this.f47435a, this.f47436b, this.f47441i.intValue(), this.f47437c, this.d, this.f47438e, (String) this.f47443k, (String) this.f47439f, (y9.d2) this.f47440g, (y9.j1) this.h, (y9.g1) this.f47442j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
