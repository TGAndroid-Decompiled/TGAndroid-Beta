package v7;

import java.io.Serializable;
public final class e8 {
    public String f49165a;
    public String f49166b;
    public String f49167c;
    public String d;
    public String f49168e;
    public Object f49169f;
    public Object f49170g;
    public Object h;
    public Integer f49171i;
    public Object f49172j;
    public Serializable f49173k;

    public y9.a0 a() {
        String str;
        if (this.f49165a == null) {
            str = " sdkVersion";
        } else {
            str = "";
        }
        if (this.f49166b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.f49171i == null) {
            str = sc.v.v(str, " platform");
        }
        if (this.f49167c == null) {
            str = sc.v.v(str, " installationUuid");
        }
        if (((String) this.f49173k) == null) {
            str = sc.v.v(str, " buildVersion");
        }
        if (((String) this.f49169f) == null) {
            str = sc.v.v(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new y9.a0(this.f49165a, this.f49166b, this.f49171i.intValue(), this.f49167c, this.d, this.f49168e, (String) this.f49173k, (String) this.f49169f, (y9.d2) this.f49170g, (y9.j1) this.h, (y9.g1) this.f49172j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
