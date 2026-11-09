package p2;

import j$.util.Objects;
public final class f {
    public final String f53132a;
    public final String f53133b;
    public final String f53134c;

    public f(String str, String str2, String str3) {
        this.f53132a = str;
        this.f53133b = str2;
        this.f53134c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f53132a, fVar.f53132a) && Objects.equals(this.f53133b, fVar.f53133b) && Objects.equals(this.f53134c, fVar.f53134c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = this.f53132a.hashCode() * 31;
        int i10 = 0;
        String str = this.f53133b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i11 = (hashCode + i7) * 31;
        String str2 = this.f53134c;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 + i10;
    }
}
