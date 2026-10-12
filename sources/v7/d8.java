package v7;

import java.io.Serializable;
public final class d8 {
    public String f46606a;
    public String f46607b;
    public String f46608c;
    public String d;
    public String e;
    public Object f46609f;
    public Object f46610g;
    public Object h;
    public Integer f46611i;
    public Object f46612j;
    public Serializable f46613k;

    public z9.a0 a() {
        String str;
        if (this.f46606a == null) {
            str = " sdkVersion";
        } else {
            str = "";
        }
        if (this.f46607b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.f46611i == null) {
            str = t8.b.u(str, " platform");
        }
        if (this.f46608c == null) {
            str = t8.b.u(str, " installationUuid");
        }
        if (((String) this.f46613k) == null) {
            str = t8.b.u(str, " buildVersion");
        }
        if (((String) this.f46609f) == null) {
            str = t8.b.u(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new z9.a0(this.f46606a, this.f46607b, this.f46611i.intValue(), this.f46608c, this.d, this.e, (String) this.f46613k, (String) this.f46609f, (z9.d2) this.f46610g, (z9.j1) this.h, (z9.g1) this.f46612j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
