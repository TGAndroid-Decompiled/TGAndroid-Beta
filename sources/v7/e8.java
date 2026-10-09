package v7;

import java.io.Serializable;
public final class e8 {
    public String f49167a;
    public String f49168b;
    public String f49169c;
    public String d;
    public String f49170e;
    public Object f49171f;
    public Object f49172g;
    public Object h;
    public Integer f49173i;
    public Object f49174j;
    public Serializable f49175k;

    public y9.a0 a() {
        String str;
        if (this.f49167a == null) {
            str = " sdkVersion";
        } else {
            str = "";
        }
        if (this.f49168b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.f49173i == null) {
            str = sc.v.v(str, " platform");
        }
        if (this.f49169c == null) {
            str = sc.v.v(str, " installationUuid");
        }
        if (((String) this.f49175k) == null) {
            str = sc.v.v(str, " buildVersion");
        }
        if (((String) this.f49171f) == null) {
            str = sc.v.v(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new y9.a0(this.f49167a, this.f49168b, this.f49173i.intValue(), this.f49169c, this.d, this.f49170e, (String) this.f49175k, (String) this.f49171f, (y9.d2) this.f49172g, (y9.j1) this.h, (y9.g1) this.f49174j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
