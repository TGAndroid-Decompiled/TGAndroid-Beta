package v7;

import java.io.Serializable;
public final class e8 {
    public String f49288a;
    public String f49289b;
    public String f49290c;
    public String d;
    public String f49291e;
    public Object f49292f;
    public Object f49293g;
    public Object h;
    public Integer f49294i;
    public Object f49295j;
    public Serializable f49296k;

    public y9.a0 a() {
        String str;
        if (this.f49288a == null) {
            str = " sdkVersion";
        } else {
            str = "";
        }
        if (this.f49289b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.f49294i == null) {
            str = sc.v.v(str, " platform");
        }
        if (this.f49290c == null) {
            str = sc.v.v(str, " installationUuid");
        }
        if (((String) this.f49296k) == null) {
            str = sc.v.v(str, " buildVersion");
        }
        if (((String) this.f49292f) == null) {
            str = sc.v.v(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new y9.a0(this.f49288a, this.f49289b, this.f49294i.intValue(), this.f49290c, this.d, this.f49291e, (String) this.f49296k, (String) this.f49292f, (y9.d2) this.f49293g, (y9.j1) this.h, (y9.g1) this.f49295j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
