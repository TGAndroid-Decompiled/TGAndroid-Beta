package v7;

import java.io.Serializable;
public final class d8 {
    public String f43968a;
    public String f43969b;
    public String f43970c;
    public String d;
    public String e;
    public Object f43971f;
    public Object f43972g;
    public Object h;
    public Integer f43973i;
    public Object f43974j;
    public Serializable f43975k;

    public y9.a0 a() {
        String str;
        if (this.f43968a == null) {
            str = " sdkVersion";
        } else {
            str = "";
        }
        if (this.f43969b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.f43973i == null) {
            str = org.telegram.ui.Cells.p6.t(str, " platform");
        }
        if (this.f43970c == null) {
            str = org.telegram.ui.Cells.p6.t(str, " installationUuid");
        }
        if (((String) this.f43975k) == null) {
            str = org.telegram.ui.Cells.p6.t(str, " buildVersion");
        }
        if (((String) this.f43971f) == null) {
            str = org.telegram.ui.Cells.p6.t(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new y9.a0(this.f43968a, this.f43969b, this.f43973i.intValue(), this.f43970c, this.d, this.e, (String) this.f43975k, (String) this.f43971f, (y9.d2) this.f43972g, (y9.j1) this.h, (y9.g1) this.f43974j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
