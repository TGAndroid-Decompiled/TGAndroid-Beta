package p2;

import j$.util.Objects;
public final class i {
    public final String f55160a;
    public final String f55161b;
    public final String f55162c;
    public final String d;
    public final String f55163e;

    public i(String str, String str2, String str3, String str4, String str5) {
        this.f55160a = str;
        this.f55161b = str2;
        this.f55162c = str3;
        this.d = str4;
        this.f55163e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (Objects.equals(this.f55160a, iVar.f55160a) && Objects.equals(this.f55161b, iVar.f55161b) && Objects.equals(this.f55162c, iVar.f55162c) && Objects.equals(this.d, iVar.d) && Objects.equals(this.f55163e, iVar.f55163e)) {
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
        String str = this.f55160a;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i14 = (527 + i7) * 31;
        String str2 = this.f55161b;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = (i14 + i10) * 31;
        String str3 = this.f55162c;
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
        String str5 = this.f55163e;
        if (str5 != null) {
            i13 = str5.hashCode();
        }
        return i17 + i13;
    }
}
