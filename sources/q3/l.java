package q3;

import j$.util.Objects;
public final class l extends j {
    public final String f41451b;
    public final String f41452c;
    public final String d;

    public l(String str, String str2, String str3) {
        super("----");
        this.f41451b = str;
        this.f41452c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (Objects.equals(this.f41452c, lVar.f41452c) && Objects.equals(this.f41451b, lVar.f41451b) && Objects.equals(this.d, lVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f41451b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (527 + i10) * 31;
        String str2 = this.f41452c;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.d;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i14 + i12;
    }

    @Override
    public final String toString() {
        return this.f41449a + ": domain=" + this.f41451b + ", description=" + this.f41452c;
    }
}
