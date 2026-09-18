package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class v0 extends o6.a implements x8.l {
    public static final Parcelable.Creator<v0> CREATOR = new n0(8);
    public final byte f46456a;
    public final byte f46457b;
    public final String f46458c;

    public v0(byte b10, byte b11, String str) {
        this.f46456a = b10;
        this.f46457b = b11;
        this.f46458c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v0.class != obj.getClass()) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f46456a == v0Var.f46456a && this.f46457b == v0Var.f46457b && this.f46458c.equals(v0Var.f46458c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f46458c.hashCode() + ((((this.f46456a + 31) * 31) + this.f46457b) * 31);
    }

    public final String toString() {
        return a4.a.s(hg.k0.m("AmsEntityUpdateParcelable{, mEntityId=", this.f46456a, ", mAttributeId=", this.f46457b, ", mValue='"), this.f46458c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f46456a);
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(this.f46457b);
        w7.e0.l(parcel, 4, this.f46458c);
        w7.e0.r(parcel, q6);
    }
}
