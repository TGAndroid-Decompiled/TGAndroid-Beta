package q3;

import j$.util.Objects;
public final class l extends j {
    public final String f40505b;
    public final String f40506c;
    public final String d;

    public l(String str, String str2, String str3) {
        super("----");
        this.f40505b = str;
        this.f40506c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (Objects.equals(this.f40506c, lVar.f40506c) && Objects.equals(this.f40505b, lVar.f40505b) && Objects.equals(this.d, lVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f40505b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (527 + i10) * 31;
        String str2 = this.f40506c;
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
        return this.f40503a + ": domain=" + this.f40505b + ", description=" + this.f40506c;
    }
}
