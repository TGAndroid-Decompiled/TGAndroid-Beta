package v7;

import java.io.Serializable;
public final class e8 {
    public String f44221a;
    public String f44222b;
    public String f44223c;
    public String d;
    public String e;
    public Object f44224f;
    public Object f44225g;
    public Object h;
    public Integer f44226i;
    public Object f44227j;
    public Serializable f44228k;

    public y9.a0 a() {
        String str;
        if (this.f44221a == null) {
            str = " sdkVersion";
        } else {
            str = "";
        }
        if (this.f44222b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.f44226i == null) {
            str = j.t(str, " platform");
        }
        if (this.f44223c == null) {
            str = j.t(str, " installationUuid");
        }
        if (((String) this.f44228k) == null) {
            str = j.t(str, " buildVersion");
        }
        if (((String) this.f44224f) == null) {
            str = j.t(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new y9.a0(this.f44221a, this.f44222b, this.f44226i.intValue(), this.f44223c, this.d, this.e, (String) this.f44228k, (String) this.f44224f, (y9.d2) this.f44225g, (y9.j1) this.h, (y9.g1) this.f44227j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
