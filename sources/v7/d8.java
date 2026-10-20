package v7;

import java.io.Serializable;
public final class d8 {
    public String f47998a;
    public String f47999b;
    public String f48000c;
    public String d;
    public String e;
    public Object f48001f;
    public Object f48002g;
    public Object h;
    public Integer f48003i;
    public Object f48004j;
    public Serializable f48005k;

    public z9.a0 a() {
        String str;
        if (this.f47998a == null) {
            str = " sdkVersion";
        } else {
            str = "";
        }
        if (this.f47999b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.f48003i == null) {
            str = r4.c.u(str, " platform");
        }
        if (this.f48000c == null) {
            str = r4.c.u(str, " installationUuid");
        }
        if (((String) this.f48005k) == null) {
            str = r4.c.u(str, " buildVersion");
        }
        if (((String) this.f48001f) == null) {
            str = r4.c.u(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new z9.a0(this.f47998a, this.f47999b, this.f48003i.intValue(), this.f48000c, this.d, this.e, (String) this.f48005k, (String) this.f48001f, (z9.d2) this.f48002g, (z9.j1) this.h, (z9.g1) this.f48004j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
