package p2;

import j$.util.Objects;
public final class f {
    public final String f55151a;
    public final String f55152b;
    public final String f55153c;

    public f(String str, String str2, String str3) {
        this.f55151a = str;
        this.f55152b = str2;
        this.f55153c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f55151a, fVar.f55151a) && Objects.equals(this.f55152b, fVar.f55152b) && Objects.equals(this.f55153c, fVar.f55153c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = this.f55151a.hashCode() * 31;
        int i10 = 0;
        String str = this.f55152b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i11 = (hashCode + i7) * 31;
        String str2 = this.f55153c;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 + i10;
    }
}
