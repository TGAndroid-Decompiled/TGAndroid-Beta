package s2;

import j$.util.Objects;
public final class w {
    public final e2.u f57028a;
    public final String f57029b;
    public final String f57030c;

    public w(e2.u uVar, String str, String str2) {
        e2.t a10 = uVar.a();
        a10.f10692a = null;
        a10.f10700k = null;
        this.f57028a = new e2.u(a10);
        this.f57029b = str;
        this.f57030c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (Objects.equals(this.f57028a, wVar.f57028a) && Objects.equals(this.f57029b, wVar.f57029b) && Objects.equals(this.f57030c, wVar.f57030c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f57028a, this.f57029b, this.f57030c);
    }
}
