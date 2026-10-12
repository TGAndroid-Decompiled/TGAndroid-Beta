package p2;

import b2.x;
import j$.util.Objects;
public final class v {
    public final x f42981a;
    public final String f42982b;
    public final String f42983c;

    public v(x xVar, String str, String str2) {
        b2.w a2 = xVar.a();
        a2.f2452a = null;
        a2.f2459k = null;
        this.f42981a = new x(a2);
        this.f42982b = str;
        this.f42983c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (Objects.equals(this.f42981a, vVar.f42981a) && Objects.equals(this.f42982b, vVar.f42982b) && Objects.equals(this.f42983c, vVar.f42983c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f42981a, this.f42982b, this.f42983c);
    }
}
