package p2;

import j$.util.Objects;
public final class f {
    public final String f55147a;
    public final String f55148b;
    public final String f55149c;

    public f(String str, String str2, String str3) {
        this.f55147a = str;
        this.f55148b = str2;
        this.f55149c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f55147a, fVar.f55147a) && Objects.equals(this.f55148b, fVar.f55148b) && Objects.equals(this.f55149c, fVar.f55149c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = this.f55147a.hashCode() * 31;
        int i10 = 0;
        String str = this.f55148b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i11 = (hashCode + i7) * 31;
        String str2 = this.f55149c;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 + i10;
    }
}
