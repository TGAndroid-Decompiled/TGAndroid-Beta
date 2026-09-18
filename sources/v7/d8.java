package v7;

import java.io.Serializable;
public final class d8 {
    public String f43973a;
    public String f43974b;
    public String f43975c;
    public String d;
    public String e;
    public Object f43976f;
    public Object f43977g;
    public Object h;
    public Integer f43978i;
    public Object f43979j;
    public Serializable f43980k;

    public y9.a0 a() {
        String str;
        if (this.f43973a == null) {
            str = " sdkVersion";
        } else {
            str = "";
        }
        if (this.f43974b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.f43978i == null) {
            str = org.telegram.ui.Cells.p6.t(str, " platform");
        }
        if (this.f43975c == null) {
            str = org.telegram.ui.Cells.p6.t(str, " installationUuid");
        }
        if (((String) this.f43980k) == null) {
            str = org.telegram.ui.Cells.p6.t(str, " buildVersion");
        }
        if (((String) this.f43976f) == null) {
            str = org.telegram.ui.Cells.p6.t(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new y9.a0(this.f43973a, this.f43974b, this.f43978i.intValue(), this.f43975c, this.d, this.e, (String) this.f43980k, (String) this.f43976f, (y9.d2) this.f43977g, (y9.j1) this.h, (y9.g1) this.f43979j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
