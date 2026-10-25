package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class w0 extends p6.a implements y8.l {
    public static final Parcelable.Creator<w0> CREATOR = new o0(8);
    public final byte f52790a;
    public final byte f52791b;
    public final String f52792c;

    public w0(byte b10, byte b11, String str) {
        this.f52790a = b10;
        this.f52791b = b11;
        this.f52792c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w0.class != obj.getClass()) {
            return false;
        }
        w0 w0Var = (w0) obj;
        if (this.f52790a == w0Var.f52790a && this.f52791b == w0Var.f52791b && this.f52792c.equals(w0Var.f52792c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f52792c.hashCode() + ((((this.f52790a + 31) * 31) + this.f52791b) * 31);
    }

    public final String toString() {
        return a1.g.s(c3.h0.n("AmsEntityUpdateParcelable{, mEntityId=", this.f52790a, ", mAttributeId=", this.f52791b, ", mValue='"), this.f52792c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f52790a);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.f52791b);
        df.l(parcel, 4, this.f52792c);
        df.r(parcel, q5);
    }
}
