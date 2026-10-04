package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class b1 extends o6.a implements x8.n {
    public static final Parcelable.Creator<b1> CREATOR = new n0(9);
    public final int f50451a;
    public final String f50452b;
    public final String f50453c;
    public final String d;
    public final String f50454e;
    public final String f50455f;
    public final String h;
    public final byte f50456n;
    public final byte f50457r;
    public final byte f50458s;
    public final byte v;
    public final String f50459w;

    public b1(int i10, String str, String str2, String str3, String str4, String str5, String str6, byte b10, byte b11, byte b12, byte b13, String str7) {
        this.f50451a = i10;
        this.f50452b = str;
        this.f50453c = str2;
        this.d = str3;
        this.f50454e = str4;
        this.f50455f = str5;
        this.h = str6;
        this.f50456n = b10;
        this.f50457r = b11;
        this.f50458s = b12;
        this.v = b13;
        this.f50459w = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b1.class != obj.getClass()) {
            return false;
        }
        b1 b1Var = (b1) obj;
        String str = b1Var.f50459w;
        String str2 = b1Var.h;
        String str3 = b1Var.f50453c;
        if (this.f50451a != b1Var.f50451a || this.f50456n != b1Var.f50456n || this.f50457r != b1Var.f50457r || this.f50458s != b1Var.f50458s || this.v != b1Var.v || !this.f50452b.equals(b1Var.f50452b)) {
            return false;
        }
        String str4 = this.f50453c;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        if (!this.d.equals(b1Var.d) || !this.f50454e.equals(b1Var.f50454e) || !this.f50455f.equals(b1Var.f50455f)) {
            return false;
        }
        String str5 = this.h;
        if (str5 == null ? str2 != null : !str5.equals(str2)) {
            return false;
        }
        String str6 = this.f50459w;
        if (str6 != null) {
            return str6.equals(str);
        }
        if (str == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int h = a4.a.h((this.f50451a + 31) * 31, 31, this.f50452b);
        int i12 = 0;
        String str = this.f50453c;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int h10 = a4.a.h(a4.a.h(a4.a.h((h + i10) * 31, 31, this.d), 31, this.f50454e), 31, this.f50455f);
        String str2 = this.h;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i13 = (((((((((h10 + i11) * 31) + this.f50456n) * 31) + this.f50457r) * 31) + this.f50458s) * 31) + this.v) * 31;
        String str3 = this.f50459w;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i13 + i12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AncsNotificationParcelable{, id=");
        sb2.append(this.f50451a);
        sb2.append(", appId='");
        sb2.append(this.f50452b);
        sb2.append("', dateTime='");
        sb2.append(this.f50453c);
        sb2.append("', eventId=");
        sb2.append((int) this.f50456n);
        sb2.append(", eventFlags=");
        hg.k0.s(sb2, this.f50457r, ", categoryId=", this.f50458s, ", categoryCount=");
        sb2.append((int) this.v);
        sb2.append(", packageName='");
        sb2.append(this.f50459w);
        sb2.append("'}");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f50451a);
        String str = this.f50452b;
        w7.g0.l(parcel, 3, str);
        w7.g0.l(parcel, 4, this.f50453c);
        w7.g0.l(parcel, 5, this.d);
        w7.g0.l(parcel, 6, this.f50454e);
        w7.g0.l(parcel, 7, this.f50455f);
        String str2 = this.h;
        if (str2 != null) {
            str = str2;
        }
        w7.g0.l(parcel, 8, str);
        w7.g0.s(parcel, 9, 4);
        parcel.writeInt(this.f50456n);
        w7.g0.s(parcel, 10, 4);
        parcel.writeInt(this.f50457r);
        w7.g0.s(parcel, 11, 4);
        parcel.writeInt(this.f50458s);
        w7.g0.s(parcel, 12, 4);
        parcel.writeInt(this.v);
        w7.g0.l(parcel, 13, this.f50459w);
        w7.g0.r(parcel, q6);
    }
}
