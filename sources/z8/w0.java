package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class w0 extends p6.a implements y8.l {
    public static final Parcelable.Creator<w0> CREATOR = new o0(8);
    public final byte f52851a;
    public final byte f52852b;
    public final String f52853c;

    public w0(byte b10, byte b11, String str) {
        this.f52851a = b10;
        this.f52852b = b11;
        this.f52853c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w0.class != obj.getClass()) {
            return false;
        }
        w0 w0Var = (w0) obj;
        if (this.f52851a == w0Var.f52851a && this.f52852b == w0Var.f52852b && this.f52853c.equals(w0Var.f52853c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f52853c.hashCode() + ((((this.f52851a + 31) * 31) + this.f52852b) * 31);
    }

    public final String toString() {
        return a1.g.s(c3.h0.n("AmsEntityUpdateParcelable{, mEntityId=", this.f52851a, ", mAttributeId=", this.f52852b, ", mValue='"), this.f52853c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f52851a);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.f52852b);
        df.l(parcel, 4, this.f52853c);
        df.r(parcel, q5);
    }
}
