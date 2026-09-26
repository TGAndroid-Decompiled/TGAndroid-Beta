package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class v0 extends o6.a implements x8.l {
    public static final Parcelable.Creator<v0> CREATOR = new n0(8);
    public final byte f46707a;
    public final byte f46708b;
    public final String f46709c;

    public v0(byte b10, byte b11, String str) {
        this.f46707a = b10;
        this.f46708b = b11;
        this.f46709c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v0.class != obj.getClass()) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f46707a == v0Var.f46707a && this.f46708b == v0Var.f46708b && this.f46709c.equals(v0Var.f46709c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f46709c.hashCode() + ((((this.f46707a + 31) * 31) + this.f46708b) * 31);
    }

    public final String toString() {
        return a4.a.t(hg.c.k("AmsEntityUpdateParcelable{, mEntityId=", this.f46707a, ", mAttributeId=", this.f46708b, ", mValue='"), this.f46709c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f46707a);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f46708b);
        w7.f0.l(parcel, 4, this.f46709c);
        w7.f0.r(parcel, q6);
    }
}
