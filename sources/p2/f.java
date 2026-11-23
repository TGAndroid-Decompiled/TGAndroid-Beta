package p2;

import j$.util.Objects;
public final class f {
    public final String f55232a;
    public final String f55233b;
    public final String f55234c;

    public f(String str, String str2, String str3) {
        this.f55232a = str;
        this.f55233b = str2;
        this.f55234c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f55232a, fVar.f55232a) && Objects.equals(this.f55233b, fVar.f55233b) && Objects.equals(this.f55234c, fVar.f55234c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = this.f55232a.hashCode() * 31;
        int i10 = 0;
        String str = this.f55233b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i11 = (hashCode + i7) * 31;
        String str2 = this.f55234c;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 + i10;
    }
}
