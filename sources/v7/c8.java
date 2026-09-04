package v7;

import java.io.Serializable;
public final class c8 {
    public String f47406a;
    public String f47407b;
    public String f47408c;
    public String d;
    public String f47409e;
    public Object f47410f;
    public Object f47411g;
    public Object h;
    public Integer f47412i;
    public Object f47413j;
    public Serializable f47414k;

    public y9.a0 a() {
        String str;
        if (this.f47406a == null) {
            str = " sdkVersion";
        } else {
            str = "";
        }
        if (this.f47407b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.f47412i == null) {
            str = org.telegram.ui.Cells.p6.t(str, " platform");
        }
        if (this.f47408c == null) {
            str = org.telegram.ui.Cells.p6.t(str, " installationUuid");
        }
        if (((String) this.f47414k) == null) {
            str = org.telegram.ui.Cells.p6.t(str, " buildVersion");
        }
        if (((String) this.f47410f) == null) {
            str = org.telegram.ui.Cells.p6.t(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new y9.a0(this.f47406a, this.f47407b, this.f47412i.intValue(), this.f47408c, this.d, this.f47409e, (String) this.f47414k, (String) this.f47410f, (y9.d2) this.f47411g, (y9.j1) this.h, (y9.g1) this.f47413j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
