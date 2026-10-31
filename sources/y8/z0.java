package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class z0 extends o6.a {
    public static final Parcelable.Creator<z0> CREATOR = new l0(9);
    public final int f54310a;
    public final String f54311b;
    public final String f54312c;
    public final String d;
    public final String e;
    public final String f54313f;
    public final String h;
    public final byte f54314n;
    public final byte f54315r;
    public final byte f54316s;
    public final byte f54317w;
    public final String f54318x;

    public z0(int i10, String str, String str2, String str3, String str4, String str5, String str6, byte b10, byte b11, byte b12, byte b13, String str7) {
        this.f54310a = i10;
        this.f54311b = str;
        this.f54312c = str2;
        this.d = str3;
        this.e = str4;
        this.f54313f = str5;
        this.h = str6;
        this.f54314n = b10;
        this.f54315r = b11;
        this.f54316s = b12;
        this.f54317w = b13;
        this.f54318x = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z0.class != obj.getClass()) {
            return false;
        }
        z0 z0Var = (z0) obj;
        String str = z0Var.f54318x;
        String str2 = z0Var.h;
        String str3 = z0Var.f54312c;
        if (this.f54310a != z0Var.f54310a || this.f54314n != z0Var.f54314n || this.f54315r != z0Var.f54315r || this.f54316s != z0Var.f54316s || this.f54317w != z0Var.f54317w || !this.f54311b.equals(z0Var.f54311b)) {
            return false;
        }
        String str4 = this.f54312c;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        if (!this.d.equals(z0Var.d) || !this.e.equals(z0Var.e) || !this.f54313f.equals(z0Var.f54313f)) {
            return false;
        }
        String str5 = this.h;
        if (str5 == null ? str2 != null : !str5.equals(str2)) {
            return false;
        }
        String str6 = this.f54318x;
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
        int f7 = a1.g.f((this.f54310a + 31) * 31, 31, this.f54311b);
        int i12 = 0;
        String str = this.f54312c;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int f10 = a1.g.f(a1.g.f(a1.g.f((f7 + i10) * 31, 31, this.d), 31, this.e), 31, this.f54313f);
        String str2 = this.h;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i13 = (((((((((f10 + i11) * 31) + this.f54314n) * 31) + this.f54315r) * 31) + this.f54316s) * 31) + this.f54317w) * 31;
        String str3 = this.f54318x;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i13 + i12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AncsNotificationParcelable{, id=");
        sb2.append(this.f54310a);
        sb2.append(", appId='");
        sb2.append(this.f54311b);
        sb2.append("', dateTime='");
        sb2.append(this.f54312c);
        sb2.append("', eventId=");
        sb2.append((int) this.f54314n);
        sb2.append(", eventFlags=");
        i0.a.t(sb2, this.f54315r, ", categoryId=", this.f54316s, ", categoryCount=");
        sb2.append((int) this.f54317w);
        sb2.append(", packageName='");
        sb2.append(this.f54318x);
        sb2.append("'}");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 2, 4);
        parcel.writeInt(this.f54310a);
        String str = this.f54311b;
        w7.h0.l(parcel, 3, str);
        w7.h0.l(parcel, 4, this.f54312c);
        w7.h0.l(parcel, 5, this.d);
        w7.h0.l(parcel, 6, this.e);
        w7.h0.l(parcel, 7, this.f54313f);
        String str2 = this.h;
        if (str2 != null) {
            str = str2;
        }
        w7.h0.l(parcel, 8, str);
        w7.h0.s(parcel, 9, 4);
        parcel.writeInt(this.f54314n);
        w7.h0.s(parcel, 10, 4);
        parcel.writeInt(this.f54315r);
        w7.h0.s(parcel, 11, 4);
        parcel.writeInt(this.f54316s);
        w7.h0.s(parcel, 12, 4);
        parcel.writeInt(this.f54317w);
        w7.h0.l(parcel, 13, this.f54318x);
        w7.h0.r(parcel, q6);
    }
}
