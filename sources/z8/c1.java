package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class c1 extends p6.a implements y8.n {
    public static final Parcelable.Creator<c1> CREATOR = new o0(9);
    public final int f52765a;
    public final String f52766b;
    public final String f52767c;
    public final String d;
    public final String e;
    public final String f52768f;
    public final String h;
    public final byte f52769n;
    public final byte f52770r;
    public final byte f52771s;
    public final byte v;
    public final String f52772w;

    public c1(int i10, String str, String str2, String str3, String str4, String str5, String str6, byte b10, byte b11, byte b12, byte b13, String str7) {
        this.f52765a = i10;
        this.f52766b = str;
        this.f52767c = str2;
        this.d = str3;
        this.e = str4;
        this.f52768f = str5;
        this.h = str6;
        this.f52769n = b10;
        this.f52770r = b11;
        this.f52771s = b12;
        this.v = b13;
        this.f52772w = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c1.class != obj.getClass()) {
            return false;
        }
        c1 c1Var = (c1) obj;
        String str = c1Var.f52772w;
        String str2 = c1Var.h;
        String str3 = c1Var.f52767c;
        if (this.f52765a != c1Var.f52765a || this.f52769n != c1Var.f52769n || this.f52770r != c1Var.f52770r || this.f52771s != c1Var.f52771s || this.v != c1Var.v || !this.f52766b.equals(c1Var.f52766b)) {
            return false;
        }
        String str4 = this.f52767c;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        if (!this.d.equals(c1Var.d) || !this.e.equals(c1Var.e) || !this.f52768f.equals(c1Var.f52768f)) {
            return false;
        }
        String str5 = this.h;
        if (str5 == null ? str2 != null : !str5.equals(str2)) {
            return false;
        }
        String str6 = this.f52772w;
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
        int f7 = a1.g.f((this.f52765a + 31) * 31, 31, this.f52766b);
        int i12 = 0;
        String str = this.f52767c;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int f10 = a1.g.f(a1.g.f(a1.g.f((f7 + i10) * 31, 31, this.d), 31, this.e), 31, this.f52768f);
        String str2 = this.h;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i13 = (((((((((f10 + i11) * 31) + this.f52769n) * 31) + this.f52770r) * 31) + this.f52771s) * 31) + this.v) * 31;
        String str3 = this.f52772w;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i13 + i12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AncsNotificationParcelable{, id=");
        sb2.append(this.f52765a);
        sb2.append(", appId='");
        sb2.append(this.f52766b);
        sb2.append("', dateTime='");
        sb2.append(this.f52767c);
        sb2.append("', eventId=");
        sb2.append((int) this.f52769n);
        sb2.append(", eventFlags=");
        c3.h0.q(sb2, this.f52770r, ", categoryId=", this.f52771s, ", categoryCount=");
        sb2.append((int) this.v);
        sb2.append(", packageName='");
        sb2.append(this.f52772w);
        sb2.append("'}");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f52765a);
        String str = this.f52766b;
        df.l(parcel, 3, str);
        df.l(parcel, 4, this.f52767c);
        df.l(parcel, 5, this.d);
        df.l(parcel, 6, this.e);
        df.l(parcel, 7, this.f52768f);
        String str2 = this.h;
        if (str2 != null) {
            str = str2;
        }
        df.l(parcel, 8, str);
        df.s(parcel, 9, 4);
        parcel.writeInt(this.f52769n);
        df.s(parcel, 10, 4);
        parcel.writeInt(this.f52770r);
        df.s(parcel, 11, 4);
        parcel.writeInt(this.f52771s);
        df.s(parcel, 12, 4);
        parcel.writeInt(this.v);
        df.l(parcel, 13, this.f52772w);
        df.r(parcel, q5);
    }
}
