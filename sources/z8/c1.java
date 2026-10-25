package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class c1 extends p6.a implements y8.n {
    public static final Parcelable.Creator<c1> CREATOR = new o0(9);
    public final int f52704a;
    public final String f52705b;
    public final String f52706c;
    public final String d;
    public final String e;
    public final String f52707f;
    public final String h;
    public final byte f52708n;
    public final byte f52709r;
    public final byte f52710s;
    public final byte v;
    public final String f52711w;

    public c1(int i10, String str, String str2, String str3, String str4, String str5, String str6, byte b10, byte b11, byte b12, byte b13, String str7) {
        this.f52704a = i10;
        this.f52705b = str;
        this.f52706c = str2;
        this.d = str3;
        this.e = str4;
        this.f52707f = str5;
        this.h = str6;
        this.f52708n = b10;
        this.f52709r = b11;
        this.f52710s = b12;
        this.v = b13;
        this.f52711w = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c1.class != obj.getClass()) {
            return false;
        }
        c1 c1Var = (c1) obj;
        String str = c1Var.f52711w;
        String str2 = c1Var.h;
        String str3 = c1Var.f52706c;
        if (this.f52704a != c1Var.f52704a || this.f52708n != c1Var.f52708n || this.f52709r != c1Var.f52709r || this.f52710s != c1Var.f52710s || this.v != c1Var.v || !this.f52705b.equals(c1Var.f52705b)) {
            return false;
        }
        String str4 = this.f52706c;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        if (!this.d.equals(c1Var.d) || !this.e.equals(c1Var.e) || !this.f52707f.equals(c1Var.f52707f)) {
            return false;
        }
        String str5 = this.h;
        if (str5 == null ? str2 != null : !str5.equals(str2)) {
            return false;
        }
        String str6 = this.f52711w;
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
        int f7 = a1.g.f((this.f52704a + 31) * 31, 31, this.f52705b);
        int i12 = 0;
        String str = this.f52706c;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int f10 = a1.g.f(a1.g.f(a1.g.f((f7 + i10) * 31, 31, this.d), 31, this.e), 31, this.f52707f);
        String str2 = this.h;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i13 = (((((((((f10 + i11) * 31) + this.f52708n) * 31) + this.f52709r) * 31) + this.f52710s) * 31) + this.v) * 31;
        String str3 = this.f52711w;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i13 + i12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AncsNotificationParcelable{, id=");
        sb2.append(this.f52704a);
        sb2.append(", appId='");
        sb2.append(this.f52705b);
        sb2.append("', dateTime='");
        sb2.append(this.f52706c);
        sb2.append("', eventId=");
        sb2.append((int) this.f52708n);
        sb2.append(", eventFlags=");
        c3.h0.q(sb2, this.f52709r, ", categoryId=", this.f52710s, ", categoryCount=");
        sb2.append((int) this.v);
        sb2.append(", packageName='");
        sb2.append(this.f52711w);
        sb2.append("'}");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f52704a);
        String str = this.f52705b;
        df.l(parcel, 3, str);
        df.l(parcel, 4, this.f52706c);
        df.l(parcel, 5, this.d);
        df.l(parcel, 6, this.e);
        df.l(parcel, 7, this.f52707f);
        String str2 = this.h;
        if (str2 != null) {
            str = str2;
        }
        df.l(parcel, 8, str);
        df.s(parcel, 9, 4);
        parcel.writeInt(this.f52708n);
        df.s(parcel, 10, 4);
        parcel.writeInt(this.f52709r);
        df.s(parcel, 11, 4);
        parcel.writeInt(this.f52710s);
        df.s(parcel, 12, 4);
        parcel.writeInt(this.v);
        df.l(parcel, 13, this.f52711w);
        df.r(parcel, q5);
    }
}
