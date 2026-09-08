package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class b1 extends o6.a implements x8.n {
    public static final Parcelable.Creator<b1> CREATOR = new n0(9);
    public final int f49598a;
    public final String f49599b;
    public final String f49600c;
    public final String d;
    public final String f49601e;
    public final String f49602f;
    public final String h;
    public final byte f49603n;
    public final byte f49604r;
    public final byte f49605s;
    public final byte v;
    public final String f49606w;

    public b1(int i10, String str, String str2, String str3, String str4, String str5, String str6, byte b10, byte b11, byte b12, byte b13, String str7) {
        this.f49598a = i10;
        this.f49599b = str;
        this.f49600c = str2;
        this.d = str3;
        this.f49601e = str4;
        this.f49602f = str5;
        this.h = str6;
        this.f49603n = b10;
        this.f49604r = b11;
        this.f49605s = b12;
        this.v = b13;
        this.f49606w = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b1.class != obj.getClass()) {
            return false;
        }
        b1 b1Var = (b1) obj;
        String str = b1Var.f49606w;
        String str2 = b1Var.h;
        String str3 = b1Var.f49600c;
        if (this.f49598a != b1Var.f49598a || this.f49603n != b1Var.f49603n || this.f49604r != b1Var.f49604r || this.f49605s != b1Var.f49605s || this.v != b1Var.v || !this.f49599b.equals(b1Var.f49599b)) {
            return false;
        }
        String str4 = this.f49600c;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        if (!this.d.equals(b1Var.d) || !this.f49601e.equals(b1Var.f49601e) || !this.f49602f.equals(b1Var.f49602f)) {
            return false;
        }
        String str5 = this.h;
        if (str5 == null ? str2 != null : !str5.equals(str2)) {
            return false;
        }
        String str6 = this.f49606w;
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
        int h = a4.a.h((this.f49598a + 31) * 31, 31, this.f49599b);
        int i12 = 0;
        String str = this.f49600c;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int h10 = a4.a.h(a4.a.h(a4.a.h((h + i10) * 31, 31, this.d), 31, this.f49601e), 31, this.f49602f);
        String str2 = this.h;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i13 = (((((((((h10 + i11) * 31) + this.f49603n) * 31) + this.f49604r) * 31) + this.f49605s) * 31) + this.v) * 31;
        String str3 = this.f49606w;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i13 + i12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AncsNotificationParcelable{, id=");
        sb2.append(this.f49598a);
        sb2.append(", appId='");
        sb2.append(this.f49599b);
        sb2.append("', dateTime='");
        sb2.append(this.f49600c);
        sb2.append("', eventId=");
        sb2.append((int) this.f49603n);
        sb2.append(", eventFlags=");
        i2.g.v(sb2, this.f49604r, ", categoryId=", this.f49605s, ", categoryCount=");
        sb2.append((int) this.v);
        sb2.append(", packageName='");
        sb2.append(this.f49606w);
        sb2.append("'}");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f49598a);
        String str = this.f49599b;
        w7.e0.l(parcel, 3, str);
        w7.e0.l(parcel, 4, this.f49600c);
        w7.e0.l(parcel, 5, this.d);
        w7.e0.l(parcel, 6, this.f49601e);
        w7.e0.l(parcel, 7, this.f49602f);
        String str2 = this.h;
        if (str2 != null) {
            str = str2;
        }
        w7.e0.l(parcel, 8, str);
        w7.e0.s(parcel, 9, 4);
        parcel.writeInt(this.f49603n);
        w7.e0.s(parcel, 10, 4);
        parcel.writeInt(this.f49604r);
        w7.e0.s(parcel, 11, 4);
        parcel.writeInt(this.f49605s);
        w7.e0.s(parcel, 12, 4);
        parcel.writeInt(this.v);
        w7.e0.l(parcel, 13, this.f49606w);
        w7.e0.r(parcel, q6);
    }
}
