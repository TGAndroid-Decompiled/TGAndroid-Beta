package v7;

import java.io.Serializable;
public final class e8 {
    public String f44235a;
    public String f44236b;
    public String f44237c;
    public String d;
    public String e;
    public Object f44238f;
    public Object f44239g;
    public Object h;
    public Integer f44240i;
    public Object f44241j;
    public Serializable f44242k;

    public y9.a0 a() {
        String str;
        if (this.f44235a == null) {
            str = " sdkVersion";
        } else {
            str = "";
        }
        if (this.f44236b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.f44240i == null) {
            str = j.t(str, " platform");
        }
        if (this.f44237c == null) {
            str = j.t(str, " installationUuid");
        }
        if (((String) this.f44242k) == null) {
            str = j.t(str, " buildVersion");
        }
        if (((String) this.f44238f) == null) {
            str = j.t(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new y9.a0(this.f44235a, this.f44236b, this.f44240i.intValue(), this.f44237c, this.d, this.e, (String) this.f44242k, (String) this.f44238f, (y9.d2) this.f44239g, (y9.j1) this.h, (y9.g1) this.f44241j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
