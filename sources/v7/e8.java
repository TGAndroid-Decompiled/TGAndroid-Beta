package v7;

import java.io.Serializable;
public final class e8 {
    public String f49211a;
    public String f49212b;
    public String f49213c;
    public String d;
    public String f49214e;
    public Object f49215f;
    public Object f49216g;
    public Object h;
    public Integer f49217i;
    public Object f49218j;
    public Serializable f49219k;

    public y9.a0 a() {
        String str;
        if (this.f49211a == null) {
            str = " sdkVersion";
        } else {
            str = "";
        }
        if (this.f49212b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.f49217i == null) {
            str = sc.v.v(str, " platform");
        }
        if (this.f49213c == null) {
            str = sc.v.v(str, " installationUuid");
        }
        if (((String) this.f49219k) == null) {
            str = sc.v.v(str, " buildVersion");
        }
        if (((String) this.f49215f) == null) {
            str = sc.v.v(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new y9.a0(this.f49211a, this.f49212b, this.f49217i.intValue(), this.f49213c, this.d, this.f49214e, (String) this.f49219k, (String) this.f49215f, (y9.d2) this.f49216g, (y9.j1) this.h, (y9.g1) this.f49218j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
