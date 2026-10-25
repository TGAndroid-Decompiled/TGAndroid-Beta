package p2;

import b2.x;
import j$.util.Objects;
public final class v {
    public final x f46631a;
    public final String f46632b;
    public final String f46633c;

    public v(x xVar, String str, String str2) {
        b2.w a2 = xVar.a();
        a2.f3519a = null;
        a2.f3526k = null;
        this.f46631a = new x(a2);
        this.f46632b = str;
        this.f46633c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (Objects.equals(this.f46631a, vVar.f46631a) && Objects.equals(this.f46632b, vVar.f46632b) && Objects.equals(this.f46633c, vVar.f46633c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f46631a, this.f46632b, this.f46633c);
    }
}
