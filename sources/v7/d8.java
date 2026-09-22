package v7;

import java.io.Serializable;
public final class d8 {
    public String f43941a;
    public String f43942b;
    public String f43943c;
    public String d;
    public String e;
    public Object f43944f;
    public Object f43945g;
    public Object h;
    public Integer f43946i;
    public Object f43947j;
    public Serializable f43948k;

    public y9.a0 a() {
        String str;
        if (this.f43941a == null) {
            str = " sdkVersion";
        } else {
            str = "";
        }
        if (this.f43942b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.f43946i == null) {
            str = w.c.g(str, " platform");
        }
        if (this.f43943c == null) {
            str = w.c.g(str, " installationUuid");
        }
        if (((String) this.f43948k) == null) {
            str = w.c.g(str, " buildVersion");
        }
        if (((String) this.f43944f) == null) {
            str = w.c.g(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new y9.a0(this.f43941a, this.f43942b, this.f43946i.intValue(), this.f43943c, this.d, this.e, (String) this.f43948k, (String) this.f43944f, (y9.d2) this.f43945g, (y9.j1) this.h, (y9.g1) this.f43947j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
