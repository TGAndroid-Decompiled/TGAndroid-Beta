package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class b1 extends o6.a implements x8.n {
    public static final Parcelable.Creator<b1> CREATOR = new n0(9);
    public final int f50466a;
    public final String f50467b;
    public final String f50468c;
    public final String d;
    public final String f50469e;
    public final String f50470f;
    public final String h;
    public final byte f50471n;
    public final byte f50472r;
    public final byte f50473s;
    public final byte v;
    public final String f50474w;

    public b1(int i10, String str, String str2, String str3, String str4, String str5, String str6, byte b10, byte b11, byte b12, byte b13, String str7) {
        this.f50466a = i10;
        this.f50467b = str;
        this.f50468c = str2;
        this.d = str3;
        this.f50469e = str4;
        this.f50470f = str5;
        this.h = str6;
        this.f50471n = b10;
        this.f50472r = b11;
        this.f50473s = b12;
        this.v = b13;
        this.f50474w = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b1.class != obj.getClass()) {
            return false;
        }
        b1 b1Var = (b1) obj;
        String str = b1Var.f50474w;
        String str2 = b1Var.h;
        String str3 = b1Var.f50468c;
        if (this.f50466a != b1Var.f50466a || this.f50471n != b1Var.f50471n || this.f50472r != b1Var.f50472r || this.f50473s != b1Var.f50473s || this.v != b1Var.v || !this.f50467b.equals(b1Var.f50467b)) {
            return false;
        }
        String str4 = this.f50468c;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        if (!this.d.equals(b1Var.d) || !this.f50469e.equals(b1Var.f50469e) || !this.f50470f.equals(b1Var.f50470f)) {
            return false;
        }
        String str5 = this.h;
        if (str5 == null ? str2 != null : !str5.equals(str2)) {
            return false;
        }
        String str6 = this.f50474w;
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
        int h = a4.a.h((this.f50466a + 31) * 31, 31, this.f50467b);
        int i12 = 0;
        String str = this.f50468c;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int h10 = a4.a.h(a4.a.h(a4.a.h((h + i10) * 31, 31, this.d), 31, this.f50469e), 31, this.f50470f);
        String str2 = this.h;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i13 = (((((((((h10 + i11) * 31) + this.f50471n) * 31) + this.f50472r) * 31) + this.f50473s) * 31) + this.v) * 31;
        String str3 = this.f50474w;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i13 + i12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AncsNotificationParcelable{, id=");
        sb2.append(this.f50466a);
        sb2.append(", appId='");
        sb2.append(this.f50467b);
        sb2.append("', dateTime='");
        sb2.append(this.f50468c);
        sb2.append("', eventId=");
        sb2.append((int) this.f50471n);
        sb2.append(", eventFlags=");
        hg.c.t(sb2, this.f50472r, ", categoryId=", this.f50473s, ", categoryCount=");
        sb2.append((int) this.v);
        sb2.append(", packageName='");
        sb2.append(this.f50474w);
        sb2.append("'}");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f50466a);
        String str = this.f50467b;
        w7.g0.l(parcel, 3, str);
        w7.g0.l(parcel, 4, this.f50468c);
        w7.g0.l(parcel, 5, this.d);
        w7.g0.l(parcel, 6, this.f50469e);
        w7.g0.l(parcel, 7, this.f50470f);
        String str2 = this.h;
        if (str2 != null) {
            str = str2;
        }
        w7.g0.l(parcel, 8, str);
        w7.g0.s(parcel, 9, 4);
        parcel.writeInt(this.f50471n);
        w7.g0.s(parcel, 10, 4);
        parcel.writeInt(this.f50472r);
        w7.g0.s(parcel, 11, 4);
        parcel.writeInt(this.f50473s);
        w7.g0.s(parcel, 12, 4);
        parcel.writeInt(this.v);
        w7.g0.l(parcel, 13, this.f50474w);
        w7.g0.r(parcel, q6);
    }
}
