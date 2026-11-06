package p2;

import j$.util.Objects;
public final class i {
    public final String f53037a;
    public final String f53038b;
    public final String f53039c;
    public final String d;
    public final String f53040e;

    public i(String str, String str2, String str3, String str4, String str5) {
        this.f53037a = str;
        this.f53038b = str2;
        this.f53039c = str3;
        this.d = str4;
        this.f53040e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (Objects.equals(this.f53037a, iVar.f53037a) && Objects.equals(this.f53038b, iVar.f53038b) && Objects.equals(this.f53039c, iVar.f53039c) && Objects.equals(this.d, iVar.d) && Objects.equals(this.f53040e, iVar.f53040e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        String str = this.f53037a;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i14 = (527 + i7) * 31;
        String str2 = this.f53038b;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = (i14 + i10) * 31;
        String str3 = this.f53039c;
        if (str3 != null) {
            i11 = str3.hashCode();
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        String str4 = this.d;
        if (str4 != null) {
            i12 = str4.hashCode();
        } else {
            i12 = 0;
        }
        int i17 = (i16 + i12) * 31;
        String str5 = this.f53040e;
        if (str5 != null) {
            i13 = str5.hashCode();
        }
        return i17 + i13;
    }
}
