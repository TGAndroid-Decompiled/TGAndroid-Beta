package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class b1 extends o6.a implements x8.n {
    public static final Parcelable.Creator<b1> CREATOR = new n0(9);
    public final int f49972a;
    public final String f49973b;
    public final String f49974c;
    public final String d;
    public final String e;
    public final String f49975f;
    public final String h;
    public final byte f49976n;
    public final byte f49977r;
    public final byte f49978s;
    public final byte v;
    public final String f49979w;

    public b1(int i10, String str, String str2, String str3, String str4, String str5, String str6, byte b10, byte b11, byte b12, byte b13, String str7) {
        this.f49972a = i10;
        this.f49973b = str;
        this.f49974c = str2;
        this.d = str3;
        this.e = str4;
        this.f49975f = str5;
        this.h = str6;
        this.f49976n = b10;
        this.f49977r = b11;
        this.f49978s = b12;
        this.v = b13;
        this.f49979w = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b1.class != obj.getClass()) {
            return false;
        }
        b1 b1Var = (b1) obj;
        String str = b1Var.f49979w;
        String str2 = b1Var.h;
        String str3 = b1Var.f49974c;
        if (this.f49972a != b1Var.f49972a || this.f49976n != b1Var.f49976n || this.f49977r != b1Var.f49977r || this.f49978s != b1Var.f49978s || this.v != b1Var.v || !this.f49973b.equals(b1Var.f49973b)) {
            return false;
        }
        String str4 = this.f49974c;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        if (!this.d.equals(b1Var.d) || !this.e.equals(b1Var.e) || !this.f49975f.equals(b1Var.f49975f)) {
            return false;
        }
        String str5 = this.h;
        if (str5 == null ? str2 != null : !str5.equals(str2)) {
            return false;
        }
        String str6 = this.f49979w;
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
        int g10 = a1.g.g((this.f49972a + 31) * 31, 31, this.f49973b);
        int i12 = 0;
        String str = this.f49974c;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int g11 = a1.g.g(a1.g.g(a1.g.g((g10 + i10) * 31, 31, this.d), 31, this.e), 31, this.f49975f);
        String str2 = this.h;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i13 = (((((((((g11 + i11) * 31) + this.f49976n) * 31) + this.f49977r) * 31) + this.f49978s) * 31) + this.v) * 31;
        String str3 = this.f49979w;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i13 + i12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AncsNotificationParcelable{, id=");
        sb2.append(this.f49972a);
        sb2.append(", appId='");
        sb2.append(this.f49973b);
        sb2.append("', dateTime='");
        sb2.append(this.f49974c);
        sb2.append("', eventId=");
        sb2.append((int) this.f49976n);
        sb2.append(", eventFlags=");
        i2.d.w(sb2, this.f49977r, ", categoryId=", this.f49978s, ", categoryCount=");
        sb2.append((int) this.v);
        sb2.append(", packageName='");
        sb2.append(this.f49979w);
        sb2.append("'}");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f49972a);
        String str = this.f49973b;
        w7.f0.l(parcel, 3, str);
        w7.f0.l(parcel, 4, this.f49974c);
        w7.f0.l(parcel, 5, this.d);
        w7.f0.l(parcel, 6, this.e);
        w7.f0.l(parcel, 7, this.f49975f);
        String str2 = this.h;
        if (str2 != null) {
            str = str2;
        }
        w7.f0.l(parcel, 8, str);
        w7.f0.s(parcel, 9, 4);
        parcel.writeInt(this.f49976n);
        w7.f0.s(parcel, 10, 4);
        parcel.writeInt(this.f49977r);
        w7.f0.s(parcel, 11, 4);
        parcel.writeInt(this.f49978s);
        w7.f0.s(parcel, 12, 4);
        parcel.writeInt(this.v);
        w7.f0.l(parcel, 13, this.f49979w);
        w7.f0.r(parcel, q6);
    }
}
