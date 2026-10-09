package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class b1 extends o6.a implements x8.n {
    public static final Parcelable.Creator<b1> CREATOR = new n0(9);
    public final int f51747a;
    public final String f51748b;
    public final String f51749c;
    public final String d;
    public final String f51750e;
    public final String f51751f;
    public final String h;
    public final byte f51752n;
    public final byte f51753r;
    public final byte f51754s;
    public final byte v;
    public final String f51755w;

    public b1(int i10, String str, String str2, String str3, String str4, String str5, String str6, byte b10, byte b11, byte b12, byte b13, String str7) {
        this.f51747a = i10;
        this.f51748b = str;
        this.f51749c = str2;
        this.d = str3;
        this.f51750e = str4;
        this.f51751f = str5;
        this.h = str6;
        this.f51752n = b10;
        this.f51753r = b11;
        this.f51754s = b12;
        this.v = b13;
        this.f51755w = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b1.class != obj.getClass()) {
            return false;
        }
        b1 b1Var = (b1) obj;
        String str = b1Var.f51755w;
        String str2 = b1Var.h;
        String str3 = b1Var.f51749c;
        if (this.f51747a != b1Var.f51747a || this.f51752n != b1Var.f51752n || this.f51753r != b1Var.f51753r || this.f51754s != b1Var.f51754s || this.v != b1Var.v || !this.f51748b.equals(b1Var.f51748b)) {
            return false;
        }
        String str4 = this.f51749c;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        if (!this.d.equals(b1Var.d) || !this.f51750e.equals(b1Var.f51750e) || !this.f51751f.equals(b1Var.f51751f)) {
            return false;
        }
        String str5 = this.h;
        if (str5 == null ? str2 != null : !str5.equals(str2)) {
            return false;
        }
        String str6 = this.f51755w;
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
        int h = a1.g.h((this.f51747a + 31) * 31, 31, this.f51748b);
        int i12 = 0;
        String str = this.f51749c;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int h10 = a1.g.h(a1.g.h(a1.g.h((h + i10) * 31, 31, this.d), 31, this.f51750e), 31, this.f51751f);
        String str2 = this.h;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i13 = (((((((((h10 + i11) * 31) + this.f51752n) * 31) + this.f51753r) * 31) + this.f51754s) * 31) + this.v) * 31;
        String str3 = this.f51755w;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i13 + i12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AncsNotificationParcelable{, id=");
        sb2.append(this.f51747a);
        sb2.append(", appId='");
        sb2.append(this.f51748b);
        sb2.append("', dateTime='");
        sb2.append(this.f51749c);
        sb2.append("', eventId=");
        sb2.append((int) this.f51752n);
        sb2.append(", eventFlags=");
        hg.c.u(sb2, this.f51753r, ", categoryId=", this.f51754s, ", categoryCount=");
        sb2.append((int) this.v);
        sb2.append(", packageName='");
        sb2.append(this.f51755w);
        sb2.append("'}");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.s(parcel, 2, 4);
        parcel.writeInt(this.f51747a);
        String str = this.f51748b;
        w7.d0.l(parcel, 3, str);
        w7.d0.l(parcel, 4, this.f51749c);
        w7.d0.l(parcel, 5, this.d);
        w7.d0.l(parcel, 6, this.f51750e);
        w7.d0.l(parcel, 7, this.f51751f);
        String str2 = this.h;
        if (str2 != null) {
            str = str2;
        }
        w7.d0.l(parcel, 8, str);
        w7.d0.s(parcel, 9, 4);
        parcel.writeInt(this.f51752n);
        w7.d0.s(parcel, 10, 4);
        parcel.writeInt(this.f51753r);
        w7.d0.s(parcel, 11, 4);
        parcel.writeInt(this.f51754s);
        w7.d0.s(parcel, 12, 4);
        parcel.writeInt(this.v);
        w7.d0.l(parcel, 13, this.f51755w);
        w7.d0.r(parcel, q6);
    }
}
