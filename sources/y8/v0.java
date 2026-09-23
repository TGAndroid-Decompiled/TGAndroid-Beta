package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class v0 extends o6.a implements x8.l {
    public static final Parcelable.Creator<v0> CREATOR = new n0(8);
    public final byte f46382a;
    public final byte f46383b;
    public final String f46384c;

    public v0(byte b10, byte b11, String str) {
        this.f46382a = b10;
        this.f46383b = b11;
        this.f46384c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v0.class != obj.getClass()) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f46382a == v0Var.f46382a && this.f46383b == v0Var.f46383b && this.f46384c.equals(v0Var.f46384c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f46384c.hashCode() + ((((this.f46382a + 31) * 31) + this.f46383b) * 31);
    }

    public final String toString() {
        return a4.a.t(hg.c.m("AmsEntityUpdateParcelable{, mEntityId=", this.f46382a, ", mAttributeId=", this.f46383b, ", mValue='"), this.f46384c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f46382a);
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(this.f46383b);
        w7.e0.l(parcel, 4, this.f46384c);
        w7.e0.r(parcel, q6);
    }
}
