package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class b1 extends o6.a implements x8.n {
    public static final Parcelable.Creator<b1> CREATOR = new n0(9);
    public final int f50459a;
    public final String f50460b;
    public final String f50461c;
    public final String d;
    public final String f50462e;
    public final String f50463f;
    public final String h;
    public final byte f50464n;
    public final byte f50465r;
    public final byte f50466s;
    public final byte v;
    public final String f50467w;

    public b1(int i10, String str, String str2, String str3, String str4, String str5, String str6, byte b10, byte b11, byte b12, byte b13, String str7) {
        this.f50459a = i10;
        this.f50460b = str;
        this.f50461c = str2;
        this.d = str3;
        this.f50462e = str4;
        this.f50463f = str5;
        this.h = str6;
        this.f50464n = b10;
        this.f50465r = b11;
        this.f50466s = b12;
        this.v = b13;
        this.f50467w = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b1.class != obj.getClass()) {
            return false;
        }
        b1 b1Var = (b1) obj;
        String str = b1Var.f50467w;
        String str2 = b1Var.h;
        String str3 = b1Var.f50461c;
        if (this.f50459a != b1Var.f50459a || this.f50464n != b1Var.f50464n || this.f50465r != b1Var.f50465r || this.f50466s != b1Var.f50466s || this.v != b1Var.v || !this.f50460b.equals(b1Var.f50460b)) {
            return false;
        }
        String str4 = this.f50461c;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        if (!this.d.equals(b1Var.d) || !this.f50462e.equals(b1Var.f50462e) || !this.f50463f.equals(b1Var.f50463f)) {
            return false;
        }
        String str5 = this.h;
        if (str5 == null ? str2 != null : !str5.equals(str2)) {
            return false;
        }
        String str6 = this.f50467w;
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
        int h = a4.a.h((this.f50459a + 31) * 31, 31, this.f50460b);
        int i12 = 0;
        String str = this.f50461c;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int h10 = a4.a.h(a4.a.h(a4.a.h((h + i10) * 31, 31, this.d), 31, this.f50462e), 31, this.f50463f);
        String str2 = this.h;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i13 = (((((((((h10 + i11) * 31) + this.f50464n) * 31) + this.f50465r) * 31) + this.f50466s) * 31) + this.v) * 31;
        String str3 = this.f50467w;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i13 + i12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AncsNotificationParcelable{, id=");
        sb2.append(this.f50459a);
        sb2.append(", appId='");
        sb2.append(this.f50460b);
        sb2.append("', dateTime='");
        sb2.append(this.f50461c);
        sb2.append("', eventId=");
        sb2.append((int) this.f50464n);
        sb2.append(", eventFlags=");
        hg.c.t(sb2, this.f50465r, ", categoryId=", this.f50466s, ", categoryCount=");
        sb2.append((int) this.v);
        sb2.append(", packageName='");
        sb2.append(this.f50467w);
        sb2.append("'}");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f50459a);
        String str = this.f50460b;
        w7.g0.l(parcel, 3, str);
        w7.g0.l(parcel, 4, this.f50461c);
        w7.g0.l(parcel, 5, this.d);
        w7.g0.l(parcel, 6, this.f50462e);
        w7.g0.l(parcel, 7, this.f50463f);
        String str2 = this.h;
        if (str2 != null) {
            str = str2;
        }
        w7.g0.l(parcel, 8, str);
        w7.g0.s(parcel, 9, 4);
        parcel.writeInt(this.f50464n);
        w7.g0.s(parcel, 10, 4);
        parcel.writeInt(this.f50465r);
        w7.g0.s(parcel, 11, 4);
        parcel.writeInt(this.f50466s);
        w7.g0.s(parcel, 12, 4);
        parcel.writeInt(this.v);
        w7.g0.l(parcel, 13, this.f50467w);
        w7.g0.r(parcel, q6);
    }
}
