package v7;

import java.io.Serializable;
public final class a8 {
    public String f50398a;
    public String f50399b;
    public String f50400c;
    public String d;
    public String e;
    public Object f50401f;
    public Object f50402g;
    public Object h;
    public Integer f50403i;
    public Object f50404j;
    public Serializable f50405k;

    public z9.a0 a() {
        String str;
        if (this.f50398a == null) {
            str = " sdkVersion";
        } else {
            str = "";
        }
        if (this.f50399b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.f50403i == null) {
            str = sc.e.A(str, " platform");
        }
        if (this.f50400c == null) {
            str = sc.e.A(str, " installationUuid");
        }
        if (((String) this.f50405k) == null) {
            str = sc.e.A(str, " buildVersion");
        }
        if (((String) this.f50401f) == null) {
            str = sc.e.A(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new z9.a0(this.f50398a, this.f50399b, this.f50403i.intValue(), this.f50400c, this.d, this.e, (String) this.f50405k, (String) this.f50401f, (z9.d2) this.f50402g, (z9.j1) this.h, (z9.g1) this.f50404j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
