package v7;

import java.io.Serializable;
public final class e8 {
    public String f44234a;
    public String f44235b;
    public String f44236c;
    public String d;
    public String e;
    public Object f44237f;
    public Object f44238g;
    public Object h;
    public Integer f44239i;
    public Object f44240j;
    public Serializable f44241k;

    public y9.a0 a() {
        String str;
        if (this.f44234a == null) {
            str = " sdkVersion";
        } else {
            str = "";
        }
        if (this.f44235b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.f44239i == null) {
            str = j.t(str, " platform");
        }
        if (this.f44236c == null) {
            str = j.t(str, " installationUuid");
        }
        if (((String) this.f44241k) == null) {
            str = j.t(str, " buildVersion");
        }
        if (((String) this.f44237f) == null) {
            str = j.t(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new y9.a0(this.f44234a, this.f44235b, this.f44239i.intValue(), this.f44236c, this.d, this.e, (String) this.f44241k, (String) this.f44237f, (y9.d2) this.f44238g, (y9.j1) this.h, (y9.g1) this.f44240j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
