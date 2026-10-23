package v7;

import java.io.Serializable;
public final class d8 {
    public String f48002a;
    public String f48003b;
    public String f48004c;
    public String d;
    public String e;
    public Object f48005f;
    public Object f48006g;
    public Object h;
    public Integer f48007i;
    public Object f48008j;
    public Serializable f48009k;

    public z9.a0 a() {
        String str;
        if (this.f48002a == null) {
            str = " sdkVersion";
        } else {
            str = "";
        }
        if (this.f48003b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.f48007i == null) {
            str = r4.c.u(str, " platform");
        }
        if (this.f48004c == null) {
            str = r4.c.u(str, " installationUuid");
        }
        if (((String) this.f48009k) == null) {
            str = r4.c.u(str, " buildVersion");
        }
        if (((String) this.f48005f) == null) {
            str = r4.c.u(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new z9.a0(this.f48002a, this.f48003b, this.f48007i.intValue(), this.f48004c, this.d, this.e, (String) this.f48009k, (String) this.f48005f, (z9.d2) this.f48006g, (z9.j1) this.h, (z9.g1) this.f48008j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
