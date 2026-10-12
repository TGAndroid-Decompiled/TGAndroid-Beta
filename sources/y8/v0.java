package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class v0 extends o6.a implements x8.l {
    public static final Parcelable.Creator<v0> CREATOR = new n0(8);
    public final byte f48676a;
    public final byte f48677b;
    public final String f48678c;

    public v0(byte b10, byte b11, String str) {
        this.f48676a = b10;
        this.f48677b = b11;
        this.f48678c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v0.class != obj.getClass()) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f48676a == v0Var.f48676a && this.f48677b == v0Var.f48677b && this.f48678c.equals(v0Var.f48678c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f48678c.hashCode() + ((((this.f48676a + 31) * 31) + this.f48677b) * 31);
    }

    public final String toString() {
        return a1.g.s(i2.d.l("AmsEntityUpdateParcelable{, mEntityId=", this.f48676a, ", mAttributeId=", this.f48677b, ", mValue='"), this.f48678c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f48676a);
        w7.g0.s(parcel, 3, 4);
        parcel.writeInt(this.f48677b);
        w7.g0.l(parcel, 4, this.f48678c);
        w7.g0.r(parcel, q6);
    }
}
