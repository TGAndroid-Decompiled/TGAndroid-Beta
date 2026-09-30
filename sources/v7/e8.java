package v7;

import java.io.Serializable;
public final class e8 {
    public String f44343a;
    public String f44344b;
    public String f44345c;
    public String d;
    public String e;
    public Object f44346f;
    public Object f44347g;
    public Object h;
    public Integer f44348i;
    public Object f44349j;
    public Serializable f44350k;

    public y9.a0 a() {
        String str;
        if (this.f44343a == null) {
            str = " sdkVersion";
        } else {
            str = "";
        }
        if (this.f44344b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.f44348i == null) {
            str = j.t(str, " platform");
        }
        if (this.f44345c == null) {
            str = j.t(str, " installationUuid");
        }
        if (((String) this.f44350k) == null) {
            str = j.t(str, " buildVersion");
        }
        if (((String) this.f44346f) == null) {
            str = j.t(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new y9.a0(this.f44343a, this.f44344b, this.f44348i.intValue(), this.f44345c, this.d, this.e, (String) this.f44350k, (String) this.f44346f, (y9.d2) this.f44347g, (y9.j1) this.h, (y9.g1) this.f44349j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
