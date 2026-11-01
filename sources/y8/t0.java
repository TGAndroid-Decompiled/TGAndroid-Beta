package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class t0 extends o6.a {
    public static final Parcelable.Creator<t0> CREATOR = new l0(8);
    public final byte f54303a;
    public final byte f54304b;
    public final String f54305c;

    public t0(byte b10, byte b11, String str) {
        this.f54303a = b10;
        this.f54304b = b11;
        this.f54305c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t0.class != obj.getClass()) {
            return false;
        }
        t0 t0Var = (t0) obj;
        if (this.f54303a == t0Var.f54303a && this.f54304b == t0Var.f54304b && this.f54305c.equals(t0Var.f54305c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f54305c.hashCode() + ((((this.f54303a + 31) * 31) + this.f54304b) * 31);
    }

    public final String toString() {
        return a1.g.r(i0.a.m("AmsEntityUpdateParcelable{, mEntityId=", this.f54303a, ", mAttributeId=", this.f54304b, ", mValue='"), this.f54305c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 2, 4);
        parcel.writeInt(this.f54303a);
        w7.h0.s(parcel, 3, 4);
        parcel.writeInt(this.f54304b);
        w7.h0.l(parcel, 4, this.f54305c);
        w7.h0.r(parcel, q6);
    }
}
