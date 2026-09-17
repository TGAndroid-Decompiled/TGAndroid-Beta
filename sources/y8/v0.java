package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class v0 extends o6.a implements x8.l {
    public static final Parcelable.Creator<v0> CREATOR = new n0(8);
    public final byte f46451a;
    public final byte f46452b;
    public final String f46453c;

    public v0(byte b10, byte b11, String str) {
        this.f46451a = b10;
        this.f46452b = b11;
        this.f46453c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v0.class != obj.getClass()) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f46451a == v0Var.f46451a && this.f46452b == v0Var.f46452b && this.f46453c.equals(v0Var.f46453c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f46453c.hashCode() + ((((this.f46451a + 31) * 31) + this.f46452b) * 31);
    }

    public final String toString() {
        return a4.a.s(hg.k0.m("AmsEntityUpdateParcelable{, mEntityId=", this.f46451a, ", mAttributeId=", this.f46452b, ", mValue='"), this.f46453c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f46451a);
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(this.f46452b);
        w7.e0.l(parcel, 4, this.f46453c);
        w7.e0.r(parcel, q6);
    }
}
