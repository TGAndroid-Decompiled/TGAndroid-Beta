package v7;

import java.io.Serializable;
public final class d8 {
    public String f47991a;
    public String f47992b;
    public String f47993c;
    public String d;
    public String e;
    public Object f47994f;
    public Object f47995g;
    public Object h;
    public Integer f47996i;
    public Object f47997j;
    public Serializable f47998k;

    public z9.a0 a() {
        String str;
        if (this.f47991a == null) {
            str = " sdkVersion";
        } else {
            str = "";
        }
        if (this.f47992b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.f47996i == null) {
            str = r4.c.u(str, " platform");
        }
        if (this.f47993c == null) {
            str = r4.c.u(str, " installationUuid");
        }
        if (((String) this.f47998k) == null) {
            str = r4.c.u(str, " buildVersion");
        }
        if (((String) this.f47994f) == null) {
            str = r4.c.u(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new z9.a0(this.f47991a, this.f47992b, this.f47996i.intValue(), this.f47993c, this.d, this.e, (String) this.f47998k, (String) this.f47994f, (z9.d2) this.f47995g, (z9.j1) this.h, (z9.g1) this.f47997j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
