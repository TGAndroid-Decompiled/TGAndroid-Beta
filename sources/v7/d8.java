package v7;

import java.io.Serializable;
public final class d8 {
    public String f48439a;
    public String f48440b;
    public String f48441c;
    public String d;
    public String e;
    public Object f48442f;
    public Object f48443g;
    public Object h;
    public Integer f48444i;
    public Object f48445j;
    public Serializable f48446k;

    public z9.a0 a() {
        String str;
        if (this.f48439a == null) {
            str = " sdkVersion";
        } else {
            str = "";
        }
        if (this.f48440b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.f48444i == null) {
            str = si.o0.u(str, " platform");
        }
        if (this.f48441c == null) {
            str = si.o0.u(str, " installationUuid");
        }
        if (((String) this.f48446k) == null) {
            str = si.o0.u(str, " buildVersion");
        }
        if (((String) this.f48442f) == null) {
            str = si.o0.u(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new z9.a0(this.f48439a, this.f48440b, this.f48444i.intValue(), this.f48441c, this.d, this.e, (String) this.f48446k, (String) this.f48442f, (z9.d2) this.f48443g, (z9.j1) this.h, (z9.g1) this.f48445j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
