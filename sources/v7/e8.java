package v7;

import java.io.Serializable;
public final class e8 {
    public String f49254a;
    public String f49255b;
    public String f49256c;
    public String d;
    public String f49257e;
    public Object f49258f;
    public Object f49259g;
    public Object h;
    public Integer f49260i;
    public Object f49261j;
    public Serializable f49262k;

    public y9.a0 a() {
        String str;
        if (this.f49254a == null) {
            str = " sdkVersion";
        } else {
            str = "";
        }
        if (this.f49255b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.f49260i == null) {
            str = sc.v.v(str, " platform");
        }
        if (this.f49256c == null) {
            str = sc.v.v(str, " installationUuid");
        }
        if (((String) this.f49262k) == null) {
            str = sc.v.v(str, " buildVersion");
        }
        if (((String) this.f49258f) == null) {
            str = sc.v.v(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new y9.a0(this.f49254a, this.f49255b, this.f49260i.intValue(), this.f49256c, this.d, this.f49257e, (String) this.f49262k, (String) this.f49258f, (y9.d2) this.f49259g, (y9.j1) this.h, (y9.g1) this.f49261j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
