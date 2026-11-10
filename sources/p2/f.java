package p2;

import j$.util.Objects;
public final class f {
    public final String f53131a;
    public final String f53132b;
    public final String f53133c;

    public f(String str, String str2, String str3) {
        this.f53131a = str;
        this.f53132b = str2;
        this.f53133c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f53131a, fVar.f53131a) && Objects.equals(this.f53132b, fVar.f53132b) && Objects.equals(this.f53133c, fVar.f53133c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = this.f53131a.hashCode() * 31;
        int i10 = 0;
        String str = this.f53132b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i11 = (hashCode + i7) * 31;
        String str2 = this.f53133c;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 + i10;
    }
}
