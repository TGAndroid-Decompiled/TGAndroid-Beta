package v7;

import java.io.Serializable;
public final class d8 {
    public String f48440a;
    public String f48441b;
    public String f48442c;
    public String d;
    public String e;
    public Object f48443f;
    public Object f48444g;
    public Object h;
    public Integer f48445i;
    public Object f48446j;
    public Serializable f48447k;

    public z9.a0 a() {
        String str;
        if (this.f48440a == null) {
            str = " sdkVersion";
        } else {
            str = "";
        }
        if (this.f48441b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.f48445i == null) {
            str = si.o0.u(str, " platform");
        }
        if (this.f48442c == null) {
            str = si.o0.u(str, " installationUuid");
        }
        if (((String) this.f48447k) == null) {
            str = si.o0.u(str, " buildVersion");
        }
        if (((String) this.f48443f) == null) {
            str = si.o0.u(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new z9.a0(this.f48440a, this.f48441b, this.f48445i.intValue(), this.f48442c, this.d, this.e, (String) this.f48447k, (String) this.f48443f, (z9.d2) this.f48444g, (z9.j1) this.h, (z9.g1) this.f48446j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
