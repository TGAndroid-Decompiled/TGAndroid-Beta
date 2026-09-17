package v7;

import java.io.Serializable;
public final class c8 {
    public String f47407a;
    public String f47408b;
    public String f47409c;
    public String d;
    public String f47410e;
    public Object f47411f;
    public Object f47412g;
    public Object h;
    public Integer f47413i;
    public Object f47414j;
    public Serializable f47415k;

    public y9.a0 a() {
        String str;
        if (this.f47407a == null) {
            str = " sdkVersion";
        } else {
            str = "";
        }
        if (this.f47408b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.f47413i == null) {
            str = org.telegram.ui.Cells.p6.t(str, " platform");
        }
        if (this.f47409c == null) {
            str = org.telegram.ui.Cells.p6.t(str, " installationUuid");
        }
        if (((String) this.f47415k) == null) {
            str = org.telegram.ui.Cells.p6.t(str, " buildVersion");
        }
        if (((String) this.f47411f) == null) {
            str = org.telegram.ui.Cells.p6.t(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new y9.a0(this.f47407a, this.f47408b, this.f47413i.intValue(), this.f47409c, this.d, this.f47410e, (String) this.f47415k, (String) this.f47411f, (y9.d2) this.f47412g, (y9.j1) this.h, (y9.g1) this.f47414j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
