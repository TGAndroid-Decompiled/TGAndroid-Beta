package v7;

import java.io.Serializable;
public final class d8 {
    public String f48038a;
    public String f48039b;
    public String f48040c;
    public String d;
    public String e;
    public Object f48041f;
    public Object f48042g;
    public Object h;
    public Integer f48043i;
    public Object f48044j;
    public Serializable f48045k;

    public z9.a0 a() {
        String str;
        if (this.f48038a == null) {
            str = " sdkVersion";
        } else {
            str = "";
        }
        if (this.f48039b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.f48043i == null) {
            str = r4.c.u(str, " platform");
        }
        if (this.f48040c == null) {
            str = r4.c.u(str, " installationUuid");
        }
        if (((String) this.f48045k) == null) {
            str = r4.c.u(str, " buildVersion");
        }
        if (((String) this.f48041f) == null) {
            str = r4.c.u(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new z9.a0(this.f48038a, this.f48039b, this.f48043i.intValue(), this.f48040c, this.d, this.e, (String) this.f48045k, (String) this.f48041f, (z9.d2) this.f48042g, (z9.j1) this.h, (z9.g1) this.f48044j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
