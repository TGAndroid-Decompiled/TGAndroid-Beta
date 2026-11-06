package p2;

import j$.util.Objects;
public final class f {
    public final String f53028a;
    public final String f53029b;
    public final String f53030c;

    public f(String str, String str2, String str3) {
        this.f53028a = str;
        this.f53029b = str2;
        this.f53030c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f53028a, fVar.f53028a) && Objects.equals(this.f53029b, fVar.f53029b) && Objects.equals(this.f53030c, fVar.f53030c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = this.f53028a.hashCode() * 31;
        int i10 = 0;
        String str = this.f53029b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i11 = (hashCode + i7) * 31;
        String str2 = this.f53030c;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 + i10;
    }
}
