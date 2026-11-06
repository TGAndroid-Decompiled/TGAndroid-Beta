package p2;

import j$.util.Objects;
public final class f {
    public final String f53026a;
    public final String f53027b;
    public final String f53028c;

    public f(String str, String str2, String str3) {
        this.f53026a = str;
        this.f53027b = str2;
        this.f53028c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f53026a, fVar.f53026a) && Objects.equals(this.f53027b, fVar.f53027b) && Objects.equals(this.f53028c, fVar.f53028c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = this.f53026a.hashCode() * 31;
        int i10 = 0;
        String str = this.f53027b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i11 = (hashCode + i7) * 31;
        String str2 = this.f53028c;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 + i10;
    }
}
