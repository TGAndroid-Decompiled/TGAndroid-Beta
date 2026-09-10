package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class b1 extends o6.a implements x8.n {
    public static final Parcelable.Creator<b1> CREATOR = new n0(9);
    public final int f46492a;
    public final String f46493b;
    public final String f46494c;
    public final String d;
    public final String e;
    public final String f46495f;
    public final String h;
    public final byte f46496n;
    public final byte f46497r;
    public final byte f46498s;
    public final byte v;
    public final String f46499w;

    public b1(int i10, String str, String str2, String str3, String str4, String str5, String str6, byte b10, byte b11, byte b12, byte b13, String str7) {
        this.f46492a = i10;
        this.f46493b = str;
        this.f46494c = str2;
        this.d = str3;
        this.e = str4;
        this.f46495f = str5;
        this.h = str6;
        this.f46496n = b10;
        this.f46497r = b11;
        this.f46498s = b12;
        this.v = b13;
        this.f46499w = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b1.class != obj.getClass()) {
            return false;
        }
        b1 b1Var = (b1) obj;
        String str = b1Var.f46499w;
        String str2 = b1Var.h;
        String str3 = b1Var.f46494c;
        if (this.f46492a != b1Var.f46492a || this.f46496n != b1Var.f46496n || this.f46497r != b1Var.f46497r || this.f46498s != b1Var.f46498s || this.v != b1Var.v || !this.f46493b.equals(b1Var.f46493b)) {
            return false;
        }
        String str4 = this.f46494c;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        if (!this.d.equals(b1Var.d) || !this.e.equals(b1Var.e) || !this.f46495f.equals(b1Var.f46495f)) {
            return false;
        }
        String str5 = this.h;
        if (str5 == null ? str2 != null : !str5.equals(str2)) {
            return false;
        }
        String str6 = this.f46499w;
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
        int h = a4.a.h((this.f46492a + 31) * 31, 31, this.f46493b);
        int i12 = 0;
        String str = this.f46494c;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int h10 = a4.a.h(a4.a.h(a4.a.h((h + i10) * 31, 31, this.d), 31, this.e), 31, this.f46495f);
        String str2 = this.h;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i13 = (((((((((h10 + i11) * 31) + this.f46496n) * 31) + this.f46497r) * 31) + this.f46498s) * 31) + this.v) * 31;
        String str3 = this.f46499w;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i13 + i12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AncsNotificationParcelable{, id=");
        sb2.append(this.f46492a);
        sb2.append(", appId='");
        sb2.append(this.f46493b);
        sb2.append("', dateTime='");
        sb2.append(this.f46494c);
        sb2.append("', eventId=");
        sb2.append((int) this.f46496n);
        sb2.append(", eventFlags=");
        hc.b.w(sb2, this.f46497r, ", categoryId=", this.f46498s, ", categoryCount=");
        sb2.append((int) this.v);
        sb2.append(", packageName='");
        sb2.append(this.f46499w);
        sb2.append("'}");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f46492a);
        String str = this.f46493b;
        w7.e0.l(parcel, 3, str);
        w7.e0.l(parcel, 4, this.f46494c);
        w7.e0.l(parcel, 5, this.d);
        w7.e0.l(parcel, 6, this.e);
        w7.e0.l(parcel, 7, this.f46495f);
        String str2 = this.h;
        if (str2 != null) {
            str = str2;
        }
        w7.e0.l(parcel, 8, str);
        w7.e0.s(parcel, 9, 4);
        parcel.writeInt(this.f46496n);
        w7.e0.s(parcel, 10, 4);
        parcel.writeInt(this.f46497r);
        w7.e0.s(parcel, 11, 4);
        parcel.writeInt(this.f46498s);
        w7.e0.s(parcel, 12, 4);
        parcel.writeInt(this.v);
        w7.e0.l(parcel, 13, this.f46499w);
        w7.e0.r(parcel, q6);
    }
}
