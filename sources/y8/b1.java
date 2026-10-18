package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class b1 extends o6.a implements x8.n {
    public static final Parcelable.Creator<b1> CREATOR = new n0(9);
    public final int f50019a;
    public final String f50020b;
    public final String f50021c;
    public final String d;
    public final String e;
    public final String f50022f;
    public final String h;
    public final byte f50023n;
    public final byte f50024r;
    public final byte f50025s;
    public final byte v;
    public final String f50026w;

    public b1(int i10, String str, String str2, String str3, String str4, String str5, String str6, byte b10, byte b11, byte b12, byte b13, String str7) {
        this.f50019a = i10;
        this.f50020b = str;
        this.f50021c = str2;
        this.d = str3;
        this.e = str4;
        this.f50022f = str5;
        this.h = str6;
        this.f50023n = b10;
        this.f50024r = b11;
        this.f50025s = b12;
        this.v = b13;
        this.f50026w = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b1.class != obj.getClass()) {
            return false;
        }
        b1 b1Var = (b1) obj;
        String str = b1Var.f50026w;
        String str2 = b1Var.h;
        String str3 = b1Var.f50021c;
        if (this.f50019a != b1Var.f50019a || this.f50023n != b1Var.f50023n || this.f50024r != b1Var.f50024r || this.f50025s != b1Var.f50025s || this.v != b1Var.v || !this.f50020b.equals(b1Var.f50020b)) {
            return false;
        }
        String str4 = this.f50021c;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        if (!this.d.equals(b1Var.d) || !this.e.equals(b1Var.e) || !this.f50022f.equals(b1Var.f50022f)) {
            return false;
        }
        String str5 = this.h;
        if (str5 == null ? str2 != null : !str5.equals(str2)) {
            return false;
        }
        String str6 = this.f50026w;
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
        int g10 = a1.g.g((this.f50019a + 31) * 31, 31, this.f50020b);
        int i12 = 0;
        String str = this.f50021c;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int g11 = a1.g.g(a1.g.g(a1.g.g((g10 + i10) * 31, 31, this.d), 31, this.e), 31, this.f50022f);
        String str2 = this.h;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i13 = (((((((((g11 + i11) * 31) + this.f50023n) * 31) + this.f50024r) * 31) + this.f50025s) * 31) + this.v) * 31;
        String str3 = this.f50026w;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i13 + i12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AncsNotificationParcelable{, id=");
        sb2.append(this.f50019a);
        sb2.append(", appId='");
        sb2.append(this.f50020b);
        sb2.append("', dateTime='");
        sb2.append(this.f50021c);
        sb2.append("', eventId=");
        sb2.append((int) this.f50023n);
        sb2.append(", eventFlags=");
        i2.d.w(sb2, this.f50024r, ", categoryId=", this.f50025s, ", categoryCount=");
        sb2.append((int) this.v);
        sb2.append(", packageName='");
        sb2.append(this.f50026w);
        sb2.append("'}");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f50019a);
        String str = this.f50020b;
        w7.f0.l(parcel, 3, str);
        w7.f0.l(parcel, 4, this.f50021c);
        w7.f0.l(parcel, 5, this.d);
        w7.f0.l(parcel, 6, this.e);
        w7.f0.l(parcel, 7, this.f50022f);
        String str2 = this.h;
        if (str2 != null) {
            str = str2;
        }
        w7.f0.l(parcel, 8, str);
        w7.f0.s(parcel, 9, 4);
        parcel.writeInt(this.f50023n);
        w7.f0.s(parcel, 10, 4);
        parcel.writeInt(this.f50024r);
        w7.f0.s(parcel, 11, 4);
        parcel.writeInt(this.f50025s);
        w7.f0.s(parcel, 12, 4);
        parcel.writeInt(this.v);
        w7.f0.l(parcel, 13, this.f50026w);
        w7.f0.r(parcel, q6);
    }
}
