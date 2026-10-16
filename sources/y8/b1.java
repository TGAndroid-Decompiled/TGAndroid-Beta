package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class b1 extends o6.a implements x8.n {
    public static final Parcelable.Creator<b1> CREATOR = new n0(9);
    public final int f48589a;
    public final String f48590b;
    public final String f48591c;
    public final String d;
    public final String e;
    public final String f48592f;
    public final String h;
    public final byte f48593n;
    public final byte f48594r;
    public final byte f48595s;
    public final byte v;
    public final String f48596w;

    public b1(int i10, String str, String str2, String str3, String str4, String str5, String str6, byte b10, byte b11, byte b12, byte b13, String str7) {
        this.f48589a = i10;
        this.f48590b = str;
        this.f48591c = str2;
        this.d = str3;
        this.e = str4;
        this.f48592f = str5;
        this.h = str6;
        this.f48593n = b10;
        this.f48594r = b11;
        this.f48595s = b12;
        this.v = b13;
        this.f48596w = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b1.class != obj.getClass()) {
            return false;
        }
        b1 b1Var = (b1) obj;
        String str = b1Var.f48596w;
        String str2 = b1Var.h;
        String str3 = b1Var.f48591c;
        if (this.f48589a != b1Var.f48589a || this.f48593n != b1Var.f48593n || this.f48594r != b1Var.f48594r || this.f48595s != b1Var.f48595s || this.v != b1Var.v || !this.f48590b.equals(b1Var.f48590b)) {
            return false;
        }
        String str4 = this.f48591c;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        if (!this.d.equals(b1Var.d) || !this.e.equals(b1Var.e) || !this.f48592f.equals(b1Var.f48592f)) {
            return false;
        }
        String str5 = this.h;
        if (str5 == null ? str2 != null : !str5.equals(str2)) {
            return false;
        }
        String str6 = this.f48596w;
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
        int g10 = a1.g.g((this.f48589a + 31) * 31, 31, this.f48590b);
        int i12 = 0;
        String str = this.f48591c;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int g11 = a1.g.g(a1.g.g(a1.g.g((g10 + i10) * 31, 31, this.d), 31, this.e), 31, this.f48592f);
        String str2 = this.h;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i13 = (((((((((g11 + i11) * 31) + this.f48593n) * 31) + this.f48594r) * 31) + this.f48595s) * 31) + this.v) * 31;
        String str3 = this.f48596w;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i13 + i12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AncsNotificationParcelable{, id=");
        sb2.append(this.f48589a);
        sb2.append(", appId='");
        sb2.append(this.f48590b);
        sb2.append("', dateTime='");
        sb2.append(this.f48591c);
        sb2.append("', eventId=");
        sb2.append((int) this.f48593n);
        sb2.append(", eventFlags=");
        i2.d.w(sb2, this.f48594r, ", categoryId=", this.f48595s, ", categoryCount=");
        sb2.append((int) this.v);
        sb2.append(", packageName='");
        sb2.append(this.f48596w);
        sb2.append("'}");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f48589a);
        String str = this.f48590b;
        w7.f0.l(parcel, 3, str);
        w7.f0.l(parcel, 4, this.f48591c);
        w7.f0.l(parcel, 5, this.d);
        w7.f0.l(parcel, 6, this.e);
        w7.f0.l(parcel, 7, this.f48592f);
        String str2 = this.h;
        if (str2 != null) {
            str = str2;
        }
        w7.f0.l(parcel, 8, str);
        w7.f0.s(parcel, 9, 4);
        parcel.writeInt(this.f48593n);
        w7.f0.s(parcel, 10, 4);
        parcel.writeInt(this.f48594r);
        w7.f0.s(parcel, 11, 4);
        parcel.writeInt(this.f48595s);
        w7.f0.s(parcel, 12, 4);
        parcel.writeInt(this.v);
        w7.f0.l(parcel, 13, this.f48596w);
        w7.f0.r(parcel, q6);
    }
}
