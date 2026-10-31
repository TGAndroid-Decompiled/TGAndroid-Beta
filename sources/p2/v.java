package p2;

import b2.x;
import j$.util.Objects;
public final class v {
    public final x f44683a;
    public final String f44684b;
    public final String f44685c;

    public v(x xVar, String str, String str2) {
        b2.w a2 = xVar.a();
        a2.f2356a = null;
        a2.f2363k = null;
        this.f44683a = new x(a2);
        this.f44684b = str;
        this.f44685c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (Objects.equals(this.f44683a, vVar.f44683a) && Objects.equals(this.f44684b, vVar.f44684b) && Objects.equals(this.f44685c, vVar.f44685c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f44683a, this.f44684b, this.f44685c);
    }
}
