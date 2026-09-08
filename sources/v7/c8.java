package v7;

import java.io.Serializable;
public final class c8 {
    public String f47434a;
    public String f47435b;
    public String f47436c;
    public String d;
    public String f47437e;
    public Object f47438f;
    public Object f47439g;
    public Object h;
    public Integer f47440i;
    public Object f47441j;
    public Serializable f47442k;

    public y9.a0 a() {
        String str;
        if (this.f47434a == null) {
            str = " sdkVersion";
        } else {
            str = "";
        }
        if (this.f47435b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.f47440i == null) {
            str = org.telegram.ui.Cells.p6.t(str, " platform");
        }
        if (this.f47436c == null) {
            str = org.telegram.ui.Cells.p6.t(str, " installationUuid");
        }
        if (((String) this.f47442k) == null) {
            str = org.telegram.ui.Cells.p6.t(str, " buildVersion");
        }
        if (((String) this.f47438f) == null) {
            str = org.telegram.ui.Cells.p6.t(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new y9.a0(this.f47434a, this.f47435b, this.f47440i.intValue(), this.f47436c, this.d, this.f47437e, (String) this.f47442k, (String) this.f47438f, (y9.d2) this.f47439g, (y9.j1) this.h, (y9.g1) this.f47441j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
