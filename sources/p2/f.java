package p2;

import j$.util.Objects;
public final class f {
    public final String f53119a;
    public final String f53120b;
    public final String f53121c;

    public f(String str, String str2, String str3) {
        this.f53119a = str;
        this.f53120b = str2;
        this.f53121c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f53119a, fVar.f53119a) && Objects.equals(this.f53120b, fVar.f53120b) && Objects.equals(this.f53121c, fVar.f53121c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = this.f53119a.hashCode() * 31;
        int i10 = 0;
        String str = this.f53120b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i11 = (hashCode + i7) * 31;
        String str2 = this.f53121c;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 + i10;
    }
}
