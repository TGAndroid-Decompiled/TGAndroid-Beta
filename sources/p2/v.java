package p2;

import b2.x;
import j$.util.Objects;
public final class v {
    public final x f44694a;
    public final String f44695b;
    public final String f44696c;

    public v(x xVar, String str, String str2) {
        b2.w a2 = xVar.a();
        a2.f2356a = null;
        a2.f2363k = null;
        this.f44694a = new x(a2);
        this.f44695b = str;
        this.f44696c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (Objects.equals(this.f44694a, vVar.f44694a) && Objects.equals(this.f44695b, vVar.f44695b) && Objects.equals(this.f44696c, vVar.f44696c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f44694a, this.f44695b, this.f44696c);
    }
}
