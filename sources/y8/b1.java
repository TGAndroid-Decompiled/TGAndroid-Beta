package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class b1 extends o6.a implements x8.n {
    public static final Parcelable.Creator<b1> CREATOR = new n0(9);
    public final int f50450a;
    public final String f50451b;
    public final String f50452c;
    public final String d;
    public final String f50453e;
    public final String f50454f;
    public final String h;
    public final byte f50455n;
    public final byte f50456r;
    public final byte f50457s;
    public final byte v;
    public final String f50458w;

    public b1(int i10, String str, String str2, String str3, String str4, String str5, String str6, byte b10, byte b11, byte b12, byte b13, String str7) {
        this.f50450a = i10;
        this.f50451b = str;
        this.f50452c = str2;
        this.d = str3;
        this.f50453e = str4;
        this.f50454f = str5;
        this.h = str6;
        this.f50455n = b10;
        this.f50456r = b11;
        this.f50457s = b12;
        this.v = b13;
        this.f50458w = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b1.class != obj.getClass()) {
            return false;
        }
        b1 b1Var = (b1) obj;
        String str = b1Var.f50458w;
        String str2 = b1Var.h;
        String str3 = b1Var.f50452c;
        if (this.f50450a != b1Var.f50450a || this.f50455n != b1Var.f50455n || this.f50456r != b1Var.f50456r || this.f50457s != b1Var.f50457s || this.v != b1Var.v || !this.f50451b.equals(b1Var.f50451b)) {
            return false;
        }
        String str4 = this.f50452c;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        if (!this.d.equals(b1Var.d) || !this.f50453e.equals(b1Var.f50453e) || !this.f50454f.equals(b1Var.f50454f)) {
            return false;
        }
        String str5 = this.h;
        if (str5 == null ? str2 != null : !str5.equals(str2)) {
            return false;
        }
        String str6 = this.f50458w;
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
        int h = a4.a.h((this.f50450a + 31) * 31, 31, this.f50451b);
        int i12 = 0;
        String str = this.f50452c;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int h10 = a4.a.h(a4.a.h(a4.a.h((h + i10) * 31, 31, this.d), 31, this.f50453e), 31, this.f50454f);
        String str2 = this.h;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i13 = (((((((((h10 + i11) * 31) + this.f50455n) * 31) + this.f50456r) * 31) + this.f50457s) * 31) + this.v) * 31;
        String str3 = this.f50458w;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i13 + i12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AncsNotificationParcelable{, id=");
        sb2.append(this.f50450a);
        sb2.append(", appId='");
        sb2.append(this.f50451b);
        sb2.append("', dateTime='");
        sb2.append(this.f50452c);
        sb2.append("', eventId=");
        sb2.append((int) this.f50455n);
        sb2.append(", eventFlags=");
        hg.k0.s(sb2, this.f50456r, ", categoryId=", this.f50457s, ", categoryCount=");
        sb2.append((int) this.v);
        sb2.append(", packageName='");
        sb2.append(this.f50458w);
        sb2.append("'}");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f50450a);
        String str = this.f50451b;
        w7.g0.l(parcel, 3, str);
        w7.g0.l(parcel, 4, this.f50452c);
        w7.g0.l(parcel, 5, this.d);
        w7.g0.l(parcel, 6, this.f50453e);
        w7.g0.l(parcel, 7, this.f50454f);
        String str2 = this.h;
        if (str2 != null) {
            str = str2;
        }
        w7.g0.l(parcel, 8, str);
        w7.g0.s(parcel, 9, 4);
        parcel.writeInt(this.f50455n);
        w7.g0.s(parcel, 10, 4);
        parcel.writeInt(this.f50456r);
        w7.g0.s(parcel, 11, 4);
        parcel.writeInt(this.f50457s);
        w7.g0.s(parcel, 12, 4);
        parcel.writeInt(this.v);
        w7.g0.l(parcel, 13, this.f50458w);
        w7.g0.r(parcel, q6);
    }
}
