package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class v0 extends o6.a implements x8.l {
    public static final Parcelable.Creator<v0> CREATOR = new n0(8);
    public final byte f52061a;
    public final byte f52062b;
    public final String f52063c;

    public v0(byte b10, byte b11, String str) {
        this.f52061a = b10;
        this.f52062b = b11;
        this.f52063c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v0.class != obj.getClass()) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f52061a == v0Var.f52061a && this.f52062b == v0Var.f52062b && this.f52063c.equals(v0Var.f52063c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f52063c.hashCode() + ((((this.f52061a + 31) * 31) + this.f52062b) * 31);
    }

    public final String toString() {
        return a1.g.t(hg.c.m("AmsEntityUpdateParcelable{, mEntityId=", this.f52061a, ", mAttributeId=", this.f52062b, ", mValue='"), this.f52063c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.c0.q(parcel, 20293);
        w7.c0.s(parcel, 2, 4);
        parcel.writeInt(this.f52061a);
        w7.c0.s(parcel, 3, 4);
        parcel.writeInt(this.f52062b);
        w7.c0.l(parcel, 4, this.f52063c);
        w7.c0.r(parcel, q6);
    }
}
