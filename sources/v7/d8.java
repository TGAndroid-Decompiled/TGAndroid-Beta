package v7;

import java.io.Serializable;
public final class d8 {
    public String f47993a;
    public String f47994b;
    public String f47995c;
    public String d;
    public String e;
    public Object f47996f;
    public Object f47997g;
    public Object h;
    public Integer f47998i;
    public Object f47999j;
    public Serializable f48000k;

    public z9.a0 a() {
        String str;
        if (this.f47993a == null) {
            str = " sdkVersion";
        } else {
            str = "";
        }
        if (this.f47994b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.f47998i == null) {
            str = r4.c.u(str, " platform");
        }
        if (this.f47995c == null) {
            str = r4.c.u(str, " installationUuid");
        }
        if (((String) this.f48000k) == null) {
            str = r4.c.u(str, " buildVersion");
        }
        if (((String) this.f47996f) == null) {
            str = r4.c.u(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new z9.a0(this.f47993a, this.f47994b, this.f47998i.intValue(), this.f47995c, this.d, this.e, (String) this.f48000k, (String) this.f47996f, (z9.d2) this.f47997g, (z9.j1) this.h, (z9.g1) this.f47999j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
