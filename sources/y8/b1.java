package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class b1 extends o6.a implements x8.n {
    public static final Parcelable.Creator<b1> CREATOR = new n0(9);
    public final int f46666a;
    public final String f46667b;
    public final String f46668c;
    public final String d;
    public final String e;
    public final String f46669f;
    public final String h;
    public final byte f46670n;
    public final byte f46671r;
    public final byte f46672s;
    public final byte v;
    public final String f46673w;

    public b1(int i10, String str, String str2, String str3, String str4, String str5, String str6, byte b10, byte b11, byte b12, byte b13, String str7) {
        this.f46666a = i10;
        this.f46667b = str;
        this.f46668c = str2;
        this.d = str3;
        this.e = str4;
        this.f46669f = str5;
        this.h = str6;
        this.f46670n = b10;
        this.f46671r = b11;
        this.f46672s = b12;
        this.v = b13;
        this.f46673w = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b1.class != obj.getClass()) {
            return false;
        }
        b1 b1Var = (b1) obj;
        String str = b1Var.f46673w;
        String str2 = b1Var.h;
        String str3 = b1Var.f46668c;
        if (this.f46666a != b1Var.f46666a || this.f46670n != b1Var.f46670n || this.f46671r != b1Var.f46671r || this.f46672s != b1Var.f46672s || this.v != b1Var.v || !this.f46667b.equals(b1Var.f46667b)) {
            return false;
        }
        String str4 = this.f46668c;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        if (!this.d.equals(b1Var.d) || !this.e.equals(b1Var.e) || !this.f46669f.equals(b1Var.f46669f)) {
            return false;
        }
        String str5 = this.h;
        if (str5 == null ? str2 != null : !str5.equals(str2)) {
            return false;
        }
        String str6 = this.f46673w;
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
        int h = a4.a.h((this.f46666a + 31) * 31, 31, this.f46667b);
        int i12 = 0;
        String str = this.f46668c;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int h10 = a4.a.h(a4.a.h(a4.a.h((h + i10) * 31, 31, this.d), 31, this.e), 31, this.f46669f);
        String str2 = this.h;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i13 = (((((((((h10 + i11) * 31) + this.f46670n) * 31) + this.f46671r) * 31) + this.f46672s) * 31) + this.v) * 31;
        String str3 = this.f46673w;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i13 + i12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AncsNotificationParcelable{, id=");
        sb2.append(this.f46666a);
        sb2.append(", appId='");
        sb2.append(this.f46667b);
        sb2.append("', dateTime='");
        sb2.append(this.f46668c);
        sb2.append("', eventId=");
        sb2.append((int) this.f46670n);
        sb2.append(", eventFlags=");
        hg.k0.t(sb2, this.f46671r, ", categoryId=", this.f46672s, ", categoryCount=");
        sb2.append((int) this.v);
        sb2.append(", packageName='");
        sb2.append(this.f46673w);
        sb2.append("'}");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f46666a);
        String str = this.f46667b;
        w7.f0.l(parcel, 3, str);
        w7.f0.l(parcel, 4, this.f46668c);
        w7.f0.l(parcel, 5, this.d);
        w7.f0.l(parcel, 6, this.e);
        w7.f0.l(parcel, 7, this.f46669f);
        String str2 = this.h;
        if (str2 != null) {
            str = str2;
        }
        w7.f0.l(parcel, 8, str);
        w7.f0.s(parcel, 9, 4);
        parcel.writeInt(this.f46670n);
        w7.f0.s(parcel, 10, 4);
        parcel.writeInt(this.f46671r);
        w7.f0.s(parcel, 11, 4);
        parcel.writeInt(this.f46672s);
        w7.f0.s(parcel, 12, 4);
        parcel.writeInt(this.v);
        w7.f0.l(parcel, 13, this.f46673w);
        w7.f0.r(parcel, q6);
    }
}
