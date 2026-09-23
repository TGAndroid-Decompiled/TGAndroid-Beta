package v7;

import java.io.Serializable;
public final class d8 {
    public String f43895a;
    public String f43896b;
    public String f43897c;
    public String d;
    public String e;
    public Object f43898f;
    public Object f43899g;
    public Object h;
    public Integer f43900i;
    public Object f43901j;
    public Serializable f43902k;

    public y9.a0 a() {
        String str;
        if (this.f43895a == null) {
            str = " sdkVersion";
        } else {
            str = "";
        }
        if (this.f43896b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.f43900i == null) {
            str = w.c.g(str, " platform");
        }
        if (this.f43897c == null) {
            str = w.c.g(str, " installationUuid");
        }
        if (((String) this.f43902k) == null) {
            str = w.c.g(str, " buildVersion");
        }
        if (((String) this.f43898f) == null) {
            str = w.c.g(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new y9.a0(this.f43895a, this.f43896b, this.f43900i.intValue(), this.f43897c, this.d, this.e, (String) this.f43902k, (String) this.f43898f, (y9.d2) this.f43899g, (y9.j1) this.h, (y9.g1) this.f43901j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
