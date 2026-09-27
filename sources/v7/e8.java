package v7;

import java.io.Serializable;
public final class e8 {
    public String f44281a;
    public String f44282b;
    public String f44283c;
    public String d;
    public String e;
    public Object f44284f;
    public Object f44285g;
    public Object h;
    public Integer f44286i;
    public Object f44287j;
    public Serializable f44288k;

    public y9.a0 a() {
        String str;
        if (this.f44281a == null) {
            str = " sdkVersion";
        } else {
            str = "";
        }
        if (this.f44282b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.f44286i == null) {
            str = k0.s(str, " platform");
        }
        if (this.f44283c == null) {
            str = k0.s(str, " installationUuid");
        }
        if (((String) this.f44288k) == null) {
            str = k0.s(str, " buildVersion");
        }
        if (((String) this.f44284f) == null) {
            str = k0.s(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new y9.a0(this.f44281a, this.f44282b, this.f44286i.intValue(), this.f44283c, this.d, this.e, (String) this.f44288k, (String) this.f44284f, (y9.d2) this.f44285g, (y9.j1) this.h, (y9.g1) this.f44287j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
