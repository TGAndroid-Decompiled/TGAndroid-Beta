package v7;

import java.io.Serializable;
public final class e8 {
    public String f49403a;
    public String f49404b;
    public String f49405c;
    public String d;
    public String f49406e;
    public Object f49407f;
    public Object f49408g;
    public Object h;
    public Integer f49409i;
    public Object f49410j;
    public Serializable f49411k;

    public y9.a0 a() {
        String str;
        if (this.f49403a == null) {
            str = " sdkVersion";
        } else {
            str = "";
        }
        if (this.f49404b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.f49409i == null) {
            str = sc.v.v(str, " platform");
        }
        if (this.f49405c == null) {
            str = sc.v.v(str, " installationUuid");
        }
        if (((String) this.f49411k) == null) {
            str = sc.v.v(str, " buildVersion");
        }
        if (((String) this.f49407f) == null) {
            str = sc.v.v(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new y9.a0(this.f49403a, this.f49404b, this.f49409i.intValue(), this.f49405c, this.d, this.f49406e, (String) this.f49411k, (String) this.f49407f, (y9.d2) this.f49408g, (y9.j1) this.h, (y9.g1) this.f49410j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
