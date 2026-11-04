package r2;

import j$.util.Objects;
public final class v {
    public final d2.v f54228a;
    public final String f54229b;
    public final String f54230c;

    public v(d2.v vVar, String str, String str2) {
        d2.u a10 = vVar.a();
        a10.f8416a = null;
        a10.f8424k = null;
        this.f54228a = new d2.v(a10);
        this.f54229b = str;
        this.f54230c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (Objects.equals(this.f54228a, vVar.f54228a) && Objects.equals(this.f54229b, vVar.f54229b) && Objects.equals(this.f54230c, vVar.f54230c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f54228a, this.f54229b, this.f54230c);
    }
}
