package v7;

import java.io.Serializable;
public final class d8 {
    public String f42967a;
    public String f42968b;
    public String f42969c;
    public String d;
    public String e;
    public Object f42970f;
    public Object f42971g;
    public Object h;
    public Integer f42972i;
    public Object f42973j;
    public Serializable f42974k;

    public y9.a0 a() {
        String str;
        if (this.f42967a == null) {
            str = " sdkVersion";
        } else {
            str = "";
        }
        if (this.f42968b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.f42972i == null) {
            str = org.telegram.ui.Cells.r6.t(str, " platform");
        }
        if (this.f42969c == null) {
            str = org.telegram.ui.Cells.r6.t(str, " installationUuid");
        }
        if (((String) this.f42974k) == null) {
            str = org.telegram.ui.Cells.r6.t(str, " buildVersion");
        }
        if (((String) this.f42970f) == null) {
            str = org.telegram.ui.Cells.r6.t(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new y9.a0(this.f42967a, this.f42968b, this.f42972i.intValue(), this.f42969c, this.d, this.e, (String) this.f42974k, (String) this.f42970f, (y9.d2) this.f42971g, (y9.j1) this.h, (y9.g1) this.f42973j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
