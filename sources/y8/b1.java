package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class b1 extends o6.a implements x8.n {
    public static final Parcelable.Creator<b1> CREATOR = new n0(9);
    public final int f51868a;
    public final String f51869b;
    public final String f51870c;
    public final String d;
    public final String f51871e;
    public final String f51872f;
    public final String h;
    public final byte f51873n;
    public final byte f51874r;
    public final byte f51875s;
    public final byte v;
    public final String f51876w;

    public b1(int i10, String str, String str2, String str3, String str4, String str5, String str6, byte b10, byte b11, byte b12, byte b13, String str7) {
        this.f51868a = i10;
        this.f51869b = str;
        this.f51870c = str2;
        this.d = str3;
        this.f51871e = str4;
        this.f51872f = str5;
        this.h = str6;
        this.f51873n = b10;
        this.f51874r = b11;
        this.f51875s = b12;
        this.v = b13;
        this.f51876w = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b1.class != obj.getClass()) {
            return false;
        }
        b1 b1Var = (b1) obj;
        String str = b1Var.f51876w;
        String str2 = b1Var.h;
        String str3 = b1Var.f51870c;
        if (this.f51868a != b1Var.f51868a || this.f51873n != b1Var.f51873n || this.f51874r != b1Var.f51874r || this.f51875s != b1Var.f51875s || this.v != b1Var.v || !this.f51869b.equals(b1Var.f51869b)) {
            return false;
        }
        String str4 = this.f51870c;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        if (!this.d.equals(b1Var.d) || !this.f51871e.equals(b1Var.f51871e) || !this.f51872f.equals(b1Var.f51872f)) {
            return false;
        }
        String str5 = this.h;
        if (str5 == null ? str2 != null : !str5.equals(str2)) {
            return false;
        }
        String str6 = this.f51876w;
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
        int h = a1.g.h((this.f51868a + 31) * 31, 31, this.f51869b);
        int i12 = 0;
        String str = this.f51870c;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int h10 = a1.g.h(a1.g.h(a1.g.h((h + i10) * 31, 31, this.d), 31, this.f51871e), 31, this.f51872f);
        String str2 = this.h;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i13 = (((((((((h10 + i11) * 31) + this.f51873n) * 31) + this.f51874r) * 31) + this.f51875s) * 31) + this.v) * 31;
        String str3 = this.f51876w;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i13 + i12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AncsNotificationParcelable{, id=");
        sb2.append(this.f51868a);
        sb2.append(", appId='");
        sb2.append(this.f51869b);
        sb2.append("', dateTime='");
        sb2.append(this.f51870c);
        sb2.append("', eventId=");
        sb2.append((int) this.f51873n);
        sb2.append(", eventFlags=");
        hg.c.u(sb2, this.f51874r, ", categoryId=", this.f51875s, ", categoryCount=");
        sb2.append((int) this.v);
        sb2.append(", packageName='");
        sb2.append(this.f51876w);
        sb2.append("'}");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.s(parcel, 2, 4);
        parcel.writeInt(this.f51868a);
        String str = this.f51869b;
        w7.d0.l(parcel, 3, str);
        w7.d0.l(parcel, 4, this.f51870c);
        w7.d0.l(parcel, 5, this.d);
        w7.d0.l(parcel, 6, this.f51871e);
        w7.d0.l(parcel, 7, this.f51872f);
        String str2 = this.h;
        if (str2 != null) {
            str = str2;
        }
        w7.d0.l(parcel, 8, str);
        w7.d0.s(parcel, 9, 4);
        parcel.writeInt(this.f51873n);
        w7.d0.s(parcel, 10, 4);
        parcel.writeInt(this.f51874r);
        w7.d0.s(parcel, 11, 4);
        parcel.writeInt(this.f51875s);
        w7.d0.s(parcel, 12, 4);
        parcel.writeInt(this.v);
        w7.d0.l(parcel, 13, this.f51876w);
        w7.d0.r(parcel, q6);
    }
}
