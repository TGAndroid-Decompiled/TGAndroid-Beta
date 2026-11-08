package p2;

import j$.util.Objects;
public final class i {
    public final String f53128a;
    public final String f53129b;
    public final String f53130c;
    public final String d;
    public final String f53131e;

    public i(String str, String str2, String str3, String str4, String str5) {
        this.f53128a = str;
        this.f53129b = str2;
        this.f53130c = str3;
        this.d = str4;
        this.f53131e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (Objects.equals(this.f53128a, iVar.f53128a) && Objects.equals(this.f53129b, iVar.f53129b) && Objects.equals(this.f53130c, iVar.f53130c) && Objects.equals(this.d, iVar.d) && Objects.equals(this.f53131e, iVar.f53131e)) {
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
        String str = this.f53128a;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i14 = (527 + i7) * 31;
        String str2 = this.f53129b;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = (i14 + i10) * 31;
        String str3 = this.f53130c;
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
        String str5 = this.f53131e;
        if (str5 != null) {
            i13 = str5.hashCode();
        }
        return i17 + i13;
    }
}
