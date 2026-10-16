package p2;

import b2.x;
import j$.util.Objects;
public final class v {
    public final x f42681a;
    public final String f42682b;
    public final String f42683c;

    public v(x xVar, String str, String str2) {
        b2.w a2 = xVar.a();
        a2.f2456a = null;
        a2.f2463k = null;
        this.f42681a = new x(a2);
        this.f42682b = str;
        this.f42683c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (Objects.equals(this.f42681a, vVar.f42681a) && Objects.equals(this.f42682b, vVar.f42682b) && Objects.equals(this.f42683c, vVar.f42683c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f42681a, this.f42682b, this.f42683c);
    }
}
