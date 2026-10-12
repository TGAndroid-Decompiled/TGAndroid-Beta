package v7;

import java.io.Serializable;
public final class e8 {
    public String f49395a;
    public String f49396b;
    public String f49397c;
    public String d;
    public String f49398e;
    public Object f49399f;
    public Object f49400g;
    public Object h;
    public Integer f49401i;
    public Object f49402j;
    public Serializable f49403k;

    public y9.a0 a() {
        String str;
        if (this.f49395a == null) {
            str = " sdkVersion";
        } else {
            str = "";
        }
        if (this.f49396b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.f49401i == null) {
            str = sc.v.v(str, " platform");
        }
        if (this.f49397c == null) {
            str = sc.v.v(str, " installationUuid");
        }
        if (((String) this.f49403k) == null) {
            str = sc.v.v(str, " buildVersion");
        }
        if (((String) this.f49399f) == null) {
            str = sc.v.v(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new y9.a0(this.f49395a, this.f49396b, this.f49401i.intValue(), this.f49397c, this.d, this.f49398e, (String) this.f49403k, (String) this.f49399f, (y9.d2) this.f49400g, (y9.j1) this.h, (y9.g1) this.f49402j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
