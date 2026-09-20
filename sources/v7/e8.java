package v7;

import java.io.Serializable;
public final class e8 {
    public String f44251a;
    public String f44252b;
    public String f44253c;
    public String d;
    public String e;
    public Object f44254f;
    public Object f44255g;
    public Object h;
    public Integer f44256i;
    public Object f44257j;
    public Serializable f44258k;

    public y9.a0 a() {
        String str;
        if (this.f44251a == null) {
            str = " sdkVersion";
        } else {
            str = "";
        }
        if (this.f44252b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.f44256i == null) {
            str = j0.s(str, " platform");
        }
        if (this.f44253c == null) {
            str = j0.s(str, " installationUuid");
        }
        if (((String) this.f44258k) == null) {
            str = j0.s(str, " buildVersion");
        }
        if (((String) this.f44254f) == null) {
            str = j0.s(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new y9.a0(this.f44251a, this.f44252b, this.f44256i.intValue(), this.f44253c, this.d, this.e, (String) this.f44258k, (String) this.f44254f, (y9.d2) this.f44255g, (y9.j1) this.h, (y9.g1) this.f44257j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
