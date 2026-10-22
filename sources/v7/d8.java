package v7;

import java.io.Serializable;
public final class d8 {
    public String f48001a;
    public String f48002b;
    public String f48003c;
    public String d;
    public String e;
    public Object f48004f;
    public Object f48005g;
    public Object h;
    public Integer f48006i;
    public Object f48007j;
    public Serializable f48008k;

    public z9.a0 a() {
        String str;
        if (this.f48001a == null) {
            str = " sdkVersion";
        } else {
            str = "";
        }
        if (this.f48002b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.f48006i == null) {
            str = r4.c.u(str, " platform");
        }
        if (this.f48003c == null) {
            str = r4.c.u(str, " installationUuid");
        }
        if (((String) this.f48008k) == null) {
            str = r4.c.u(str, " buildVersion");
        }
        if (((String) this.f48004f) == null) {
            str = r4.c.u(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new z9.a0(this.f48001a, this.f48002b, this.f48006i.intValue(), this.f48003c, this.d, this.e, (String) this.f48008k, (String) this.f48004f, (z9.d2) this.f48005g, (z9.j1) this.h, (z9.g1) this.f48007j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
