package p4;

import f5.d0;
public final class i {
    public final String f45569a;
    public final String f45570b;
    public final String f45571c;
    public final String d;
    public final String f45572e;

    public i(String str, String str2, String str3, String str4, String str5) {
        this.f45569a = str;
        this.f45570b = str2;
        this.f45571c = str3;
        this.d = str4;
        this.f45572e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (d0.a(this.f45569a, iVar.f45569a) && d0.a(this.f45570b, iVar.f45570b) && d0.a(this.f45571c, iVar.f45571c) && d0.a(this.d, iVar.d) && d0.a(this.f45572e, iVar.f45572e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        String str = this.f45569a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = (527 + i10) * 31;
        String str2 = this.f45570b;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        String str3 = this.f45571c;
        if (str3 != null) {
            i12 = str3.hashCode();
        } else {
            i12 = 0;
        }
        int i17 = (i16 + i12) * 31;
        String str4 = this.d;
        if (str4 != null) {
            i13 = str4.hashCode();
        } else {
            i13 = 0;
        }
        int i18 = (i17 + i13) * 31;
        String str5 = this.f45572e;
        if (str5 != null) {
            i14 = str5.hashCode();
        }
        return i18 + i14;
    }
}
