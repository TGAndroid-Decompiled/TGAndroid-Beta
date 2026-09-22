package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class v0 extends o6.a implements x8.l {
    public static final Parcelable.Creator<v0> CREATOR = new n0(8);
    public final byte f46751a;
    public final byte f46752b;
    public final String f46753c;

    public v0(byte b10, byte b11, String str) {
        this.f46751a = b10;
        this.f46752b = b11;
        this.f46753c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v0.class != obj.getClass()) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f46751a == v0Var.f46751a && this.f46752b == v0Var.f46752b && this.f46753c.equals(v0Var.f46753c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f46753c.hashCode() + ((((this.f46751a + 31) * 31) + this.f46752b) * 31);
    }

    public final String toString() {
        return a4.a.s(hg.k0.l("AmsEntityUpdateParcelable{, mEntityId=", this.f46751a, ", mAttributeId=", this.f46752b, ", mValue='"), this.f46753c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f46751a);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f46752b);
        w7.f0.l(parcel, 4, this.f46753c);
        w7.f0.r(parcel, q6);
    }
}
