package p2;

import j$.util.Objects;
public final class f {
    public final String f55106a;
    public final String f55107b;
    public final String f55108c;

    public f(String str, String str2, String str3) {
        this.f55106a = str;
        this.f55107b = str2;
        this.f55108c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f55106a, fVar.f55106a) && Objects.equals(this.f55107b, fVar.f55107b) && Objects.equals(this.f55108c, fVar.f55108c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = this.f55106a.hashCode() * 31;
        int i10 = 0;
        String str = this.f55107b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i11 = (hashCode + i7) * 31;
        String str2 = this.f55108c;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 + i10;
    }
}
