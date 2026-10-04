package v7;

import java.io.Serializable;
public final class d8 {
    public String f47892a;
    public String f47893b;
    public String f47894c;
    public String d;
    public String f47895e;
    public Object f47896f;
    public Object f47897g;
    public Object h;
    public Integer f47898i;
    public Object f47899j;
    public Serializable f47900k;

    public y9.a0 a() {
        String str;
        if (this.f47892a == null) {
            str = " sdkVersion";
        } else {
            str = "";
        }
        if (this.f47893b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.f47898i == null) {
            str = t8.b.v(str, " platform");
        }
        if (this.f47894c == null) {
            str = t8.b.v(str, " installationUuid");
        }
        if (((String) this.f47900k) == null) {
            str = t8.b.v(str, " buildVersion");
        }
        if (((String) this.f47896f) == null) {
            str = t8.b.v(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new y9.a0(this.f47892a, this.f47893b, this.f47898i.intValue(), this.f47894c, this.d, this.f47895e, (String) this.f47900k, (String) this.f47896f, (y9.d2) this.f47897g, (y9.j1) this.h, (y9.g1) this.f47899j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
