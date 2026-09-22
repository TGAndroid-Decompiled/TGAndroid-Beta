package v7;

import java.io.Serializable;
public final class e8 {
    public String f44273a;
    public String f44274b;
    public String f44275c;
    public String d;
    public String e;
    public Object f44276f;
    public Object f44277g;
    public Object h;
    public Integer f44278i;
    public Object f44279j;
    public Serializable f44280k;

    public y9.a0 a() {
        String str;
        if (this.f44273a == null) {
            str = " sdkVersion";
        } else {
            str = "";
        }
        if (this.f44274b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.f44278i == null) {
            str = j0.s(str, " platform");
        }
        if (this.f44275c == null) {
            str = j0.s(str, " installationUuid");
        }
        if (((String) this.f44280k) == null) {
            str = j0.s(str, " buildVersion");
        }
        if (((String) this.f44276f) == null) {
            str = j0.s(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new y9.a0(this.f44273a, this.f44274b, this.f44278i.intValue(), this.f44275c, this.d, this.e, (String) this.f44280k, (String) this.f44276f, (y9.d2) this.f44277g, (y9.j1) this.h, (y9.g1) this.f44279j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
