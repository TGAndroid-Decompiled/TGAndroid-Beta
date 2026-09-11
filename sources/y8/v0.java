package y8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.vision.e2;
public final class v0 extends o6.a implements x8.l {
    public static final Parcelable.Creator<v0> CREATOR = new n0(8);
    public final byte f49659a;
    public final byte f49660b;
    public final String f49661c;

    public v0(byte b10, byte b11, String str) {
        this.f49659a = b10;
        this.f49660b = b11;
        this.f49661c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v0.class != obj.getClass()) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f49659a == v0Var.f49659a && this.f49660b == v0Var.f49660b && this.f49661c.equals(v0Var.f49661c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f49661c.hashCode() + ((((this.f49659a + 31) * 31) + this.f49660b) * 31);
    }

    public final String toString() {
        return a4.a.s(e2.k("AmsEntityUpdateParcelable{, mEntityId=", this.f49659a, ", mAttributeId=", this.f49660b, ", mValue='"), this.f49661c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f49659a);
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(this.f49660b);
        w7.e0.l(parcel, 4, this.f49661c);
        w7.e0.r(parcel, q6);
    }
}
