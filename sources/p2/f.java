package p2;

import j$.util.Objects;
public final class f {
    public final String f53120a;
    public final String f53121b;
    public final String f53122c;

    public f(String str, String str2, String str3) {
        this.f53120a = str;
        this.f53121b = str2;
        this.f53122c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f53120a, fVar.f53120a) && Objects.equals(this.f53121b, fVar.f53121b) && Objects.equals(this.f53122c, fVar.f53122c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = this.f53120a.hashCode() * 31;
        int i10 = 0;
        String str = this.f53121b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i11 = (hashCode + i7) * 31;
        String str2 = this.f53122c;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 + i10;
    }
}
