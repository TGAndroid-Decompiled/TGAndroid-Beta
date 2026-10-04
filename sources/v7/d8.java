package v7;

import java.io.Serializable;
public final class d8 {
    public String f47900a;
    public String f47901b;
    public String f47902c;
    public String d;
    public String f47903e;
    public Object f47904f;
    public Object f47905g;
    public Object h;
    public Integer f47906i;
    public Object f47907j;
    public Serializable f47908k;

    public y9.a0 a() {
        String str;
        if (this.f47900a == null) {
            str = " sdkVersion";
        } else {
            str = "";
        }
        if (this.f47901b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.f47906i == null) {
            str = sa.e.v(str, " platform");
        }
        if (this.f47902c == null) {
            str = sa.e.v(str, " installationUuid");
        }
        if (((String) this.f47908k) == null) {
            str = sa.e.v(str, " buildVersion");
        }
        if (((String) this.f47904f) == null) {
            str = sa.e.v(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new y9.a0(this.f47900a, this.f47901b, this.f47906i.intValue(), this.f47902c, this.d, this.f47903e, (String) this.f47908k, (String) this.f47904f, (y9.d2) this.f47905g, (y9.j1) this.h, (y9.g1) this.f47907j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
