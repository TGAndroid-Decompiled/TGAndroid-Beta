package p2;

import j$.util.Objects;
public final class f {
    public final String f53002a;
    public final String f53003b;
    public final String f53004c;

    public f(String str, String str2, String str3) {
        this.f53002a = str;
        this.f53003b = str2;
        this.f53004c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f53002a, fVar.f53002a) && Objects.equals(this.f53003b, fVar.f53003b) && Objects.equals(this.f53004c, fVar.f53004c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = this.f53002a.hashCode() * 31;
        int i10 = 0;
        String str = this.f53003b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i11 = (hashCode + i7) * 31;
        String str2 = this.f53004c;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 + i10;
    }
}
