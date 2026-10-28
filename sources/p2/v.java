package p2;

import b2.x;
import j$.util.Objects;
public final class v {
    public final x f46669a;
    public final String f46670b;
    public final String f46671c;

    public v(x xVar, String str, String str2) {
        b2.w a2 = xVar.a();
        a2.f3519a = null;
        a2.f3526k = null;
        this.f46669a = new x(a2);
        this.f46670b = str;
        this.f46671c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (Objects.equals(this.f46669a, vVar.f46669a) && Objects.equals(this.f46670b, vVar.f46670b) && Objects.equals(this.f46671c, vVar.f46671c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f46669a, this.f46670b, this.f46671c);
    }
}
