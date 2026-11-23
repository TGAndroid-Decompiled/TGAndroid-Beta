package p2;

import j$.util.Objects;
public final class f {
    public final String f55116a;
    public final String f55117b;
    public final String f55118c;

    public f(String str, String str2, String str3) {
        this.f55116a = str;
        this.f55117b = str2;
        this.f55118c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f55116a, fVar.f55116a) && Objects.equals(this.f55117b, fVar.f55117b) && Objects.equals(this.f55118c, fVar.f55118c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = this.f55116a.hashCode() * 31;
        int i10 = 0;
        String str = this.f55117b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i11 = (hashCode + i7) * 31;
        String str2 = this.f55118c;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 + i10;
    }
}
