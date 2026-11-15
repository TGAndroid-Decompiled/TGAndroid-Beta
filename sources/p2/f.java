package p2;

import j$.util.Objects;
public final class f {
    public final String f54537a;
    public final String f54538b;
    public final String f54539c;

    public f(String str, String str2, String str3) {
        this.f54537a = str;
        this.f54538b = str2;
        this.f54539c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f54537a, fVar.f54537a) && Objects.equals(this.f54538b, fVar.f54538b) && Objects.equals(this.f54539c, fVar.f54539c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = this.f54537a.hashCode() * 31;
        int i10 = 0;
        String str = this.f54538b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i11 = (hashCode + i7) * 31;
        String str2 = this.f54539c;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 + i10;
    }
}
