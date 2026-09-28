package v7;

import java.io.Serializable;
public final class e8 {
    public String f44236a;
    public String f44237b;
    public String f44238c;
    public String d;
    public String e;
    public Object f44239f;
    public Object f44240g;
    public Object h;
    public Integer f44241i;
    public Object f44242j;
    public Serializable f44243k;

    public y9.a0 a() {
        String str;
        if (this.f44236a == null) {
            str = " sdkVersion";
        } else {
            str = "";
        }
        if (this.f44237b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.f44241i == null) {
            str = j.t(str, " platform");
        }
        if (this.f44238c == null) {
            str = j.t(str, " installationUuid");
        }
        if (((String) this.f44243k) == null) {
            str = j.t(str, " buildVersion");
        }
        if (((String) this.f44239f) == null) {
            str = j.t(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new y9.a0(this.f44236a, this.f44237b, this.f44241i.intValue(), this.f44238c, this.d, this.e, (String) this.f44243k, (String) this.f44239f, (y9.d2) this.f44240g, (y9.j1) this.h, (y9.g1) this.f44242j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
