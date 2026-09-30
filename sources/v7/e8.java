package v7;

import java.io.Serializable;
public final class e8 {
    public String f44237a;
    public String f44238b;
    public String f44239c;
    public String d;
    public String e;
    public Object f44240f;
    public Object f44241g;
    public Object h;
    public Integer f44242i;
    public Object f44243j;
    public Serializable f44244k;

    public y9.a0 a() {
        String str;
        if (this.f44237a == null) {
            str = " sdkVersion";
        } else {
            str = "";
        }
        if (this.f44238b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.f44242i == null) {
            str = j.t(str, " platform");
        }
        if (this.f44239c == null) {
            str = j.t(str, " installationUuid");
        }
        if (((String) this.f44244k) == null) {
            str = j.t(str, " buildVersion");
        }
        if (((String) this.f44240f) == null) {
            str = j.t(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new y9.a0(this.f44237a, this.f44238b, this.f44242i.intValue(), this.f44239c, this.d, this.e, (String) this.f44244k, (String) this.f44240f, (y9.d2) this.f44241g, (y9.j1) this.h, (y9.g1) this.f44243j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
