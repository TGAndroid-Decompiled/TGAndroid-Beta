package v7;

import java.io.Serializable;
public final class d8 {
    public String f48013a;
    public String f48014b;
    public String f48015c;
    public String d;
    public String e;
    public Object f48016f;
    public Object f48017g;
    public Object h;
    public Integer f48018i;
    public Object f48019j;
    public Serializable f48020k;

    public z9.a0 a() {
        String str;
        if (this.f48013a == null) {
            str = " sdkVersion";
        } else {
            str = "";
        }
        if (this.f48014b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.f48018i == null) {
            str = r.c.u(str, " platform");
        }
        if (this.f48015c == null) {
            str = r.c.u(str, " installationUuid");
        }
        if (((String) this.f48020k) == null) {
            str = r.c.u(str, " buildVersion");
        }
        if (((String) this.f48016f) == null) {
            str = r.c.u(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new z9.a0(this.f48013a, this.f48014b, this.f48018i.intValue(), this.f48015c, this.d, this.e, (String) this.f48020k, (String) this.f48016f, (z9.d2) this.f48017g, (z9.j1) this.h, (z9.g1) this.f48019j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
