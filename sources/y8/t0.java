package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class t0 extends o6.a {
    public static final Parcelable.Creator<t0> CREATOR = new l0(8);
    public final byte f54282a;
    public final byte f54283b;
    public final String f54284c;

    public t0(byte b10, byte b11, String str) {
        this.f54282a = b10;
        this.f54283b = b11;
        this.f54284c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t0.class != obj.getClass()) {
            return false;
        }
        t0 t0Var = (t0) obj;
        if (this.f54282a == t0Var.f54282a && this.f54283b == t0Var.f54283b && this.f54284c.equals(t0Var.f54284c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f54284c.hashCode() + ((((this.f54282a + 31) * 31) + this.f54283b) * 31);
    }

    public final String toString() {
        return a1.g.r(i0.a.m("AmsEntityUpdateParcelable{, mEntityId=", this.f54282a, ", mAttributeId=", this.f54283b, ", mValue='"), this.f54284c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 2, 4);
        parcel.writeInt(this.f54282a);
        w7.h0.s(parcel, 3, 4);
        parcel.writeInt(this.f54283b);
        w7.h0.l(parcel, 4, this.f54284c);
        w7.h0.r(parcel, q6);
    }
}
