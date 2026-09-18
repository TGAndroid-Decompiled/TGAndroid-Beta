package v7;

import java.io.Serializable;
public final class d8 {
    public String f44199a;
    public String f44200b;
    public String f44201c;
    public String d;
    public String e;
    public Object f44202f;
    public Object f44203g;
    public Object h;
    public Integer f44204i;
    public Object f44205j;
    public Serializable f44206k;

    public y9.a0 a() {
        String str;
        if (this.f44199a == null) {
            str = " sdkVersion";
        } else {
            str = "";
        }
        if (this.f44200b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.f44204i == null) {
            str = t8.b.v(str, " platform");
        }
        if (this.f44201c == null) {
            str = t8.b.v(str, " installationUuid");
        }
        if (((String) this.f44206k) == null) {
            str = t8.b.v(str, " buildVersion");
        }
        if (((String) this.f44202f) == null) {
            str = t8.b.v(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new y9.a0(this.f44199a, this.f44200b, this.f44204i.intValue(), this.f44201c, this.d, this.e, (String) this.f44206k, (String) this.f44202f, (y9.d2) this.f44203g, (y9.j1) this.h, (y9.g1) this.f44205j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
