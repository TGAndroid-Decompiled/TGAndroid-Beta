package v7;

import java.io.Serializable;
public final class d8 {
    public String f47891a;
    public String f47892b;
    public String f47893c;
    public String d;
    public String f47894e;
    public Object f47895f;
    public Object f47896g;
    public Object h;
    public Integer f47897i;
    public Object f47898j;
    public Serializable f47899k;

    public y9.a0 a() {
        String str;
        if (this.f47891a == null) {
            str = " sdkVersion";
        } else {
            str = "";
        }
        if (this.f47892b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.f47897i == null) {
            str = t8.b.v(str, " platform");
        }
        if (this.f47893c == null) {
            str = t8.b.v(str, " installationUuid");
        }
        if (((String) this.f47899k) == null) {
            str = t8.b.v(str, " buildVersion");
        }
        if (((String) this.f47895f) == null) {
            str = t8.b.v(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new y9.a0(this.f47891a, this.f47892b, this.f47897i.intValue(), this.f47893c, this.d, this.f47894e, (String) this.f47899k, (String) this.f47895f, (y9.d2) this.f47896g, (y9.j1) this.h, (y9.g1) this.f47898j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
