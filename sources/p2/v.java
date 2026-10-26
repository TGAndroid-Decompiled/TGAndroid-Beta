package p2;

import b2.x;
import j$.util.Objects;
public final class v {
    public final x f46634a;
    public final String f46635b;
    public final String f46636c;

    public v(x xVar, String str, String str2) {
        b2.w a2 = xVar.a();
        a2.f3519a = null;
        a2.f3526k = null;
        this.f46634a = new x(a2);
        this.f46635b = str;
        this.f46636c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (Objects.equals(this.f46634a, vVar.f46634a) && Objects.equals(this.f46635b, vVar.f46635b) && Objects.equals(this.f46636c, vVar.f46636c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f46634a, this.f46635b, this.f46636c);
    }
}
