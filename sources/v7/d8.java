package v7;

import java.io.Serializable;
public final class d8 {
    public String f47907a;
    public String f47908b;
    public String f47909c;
    public String d;
    public String f47910e;
    public Object f47911f;
    public Object f47912g;
    public Object h;
    public Integer f47913i;
    public Object f47914j;
    public Serializable f47915k;

    public y9.a0 a() {
        String str;
        if (this.f47907a == null) {
            str = " sdkVersion";
        } else {
            str = "";
        }
        if (this.f47908b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.f47913i == null) {
            str = sa.e.v(str, " platform");
        }
        if (this.f47909c == null) {
            str = sa.e.v(str, " installationUuid");
        }
        if (((String) this.f47915k) == null) {
            str = sa.e.v(str, " buildVersion");
        }
        if (((String) this.f47911f) == null) {
            str = sa.e.v(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new y9.a0(this.f47907a, this.f47908b, this.f47913i.intValue(), this.f47909c, this.d, this.f47910e, (String) this.f47915k, (String) this.f47911f, (y9.d2) this.f47912g, (y9.j1) this.h, (y9.g1) this.f47914j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
