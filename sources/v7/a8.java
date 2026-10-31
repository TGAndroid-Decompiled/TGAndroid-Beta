package v7;

import java.io.Serializable;
public final class a8 {
    public String f50384a;
    public String f50385b;
    public String f50386c;
    public String d;
    public String e;
    public Object f50387f;
    public Object f50388g;
    public Object h;
    public Integer f50389i;
    public Object f50390j;
    public Serializable f50391k;

    public z9.a0 a() {
        String str;
        if (this.f50384a == null) {
            str = " sdkVersion";
        } else {
            str = "";
        }
        if (this.f50385b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.f50389i == null) {
            str = sc.e.A(str, " platform");
        }
        if (this.f50386c == null) {
            str = sc.e.A(str, " installationUuid");
        }
        if (((String) this.f50391k) == null) {
            str = sc.e.A(str, " buildVersion");
        }
        if (((String) this.f50387f) == null) {
            str = sc.e.A(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new z9.a0(this.f50384a, this.f50385b, this.f50389i.intValue(), this.f50386c, this.d, this.e, (String) this.f50391k, (String) this.f50387f, (z9.d2) this.f50388g, (z9.j1) this.h, (z9.g1) this.f50390j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
