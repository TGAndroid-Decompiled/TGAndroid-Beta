package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class m0 extends p6.a implements y8.h {
    public static final Parcelable.Creator<m0> CREATOR = new d(29);
    public final String f52746a;
    public final String f52747b;
    public final int f52748c;
    public final boolean d;

    public m0(int i10, String str, String str2, boolean z10) {
        this.f52746a = str;
        this.f52747b = str2;
        this.f52748c = i10;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m0)) {
            return false;
        }
        return ((m0) obj).f52746a.equals(this.f52746a);
    }

    public final int hashCode() {
        return this.f52746a.hashCode();
    }

    public final String toString() {
        StringBuilder w10 = a1.g.w("Node{", this.f52747b, ", id=", this.f52746a, ", hops=");
        w10.append(this.f52748c);
        w10.append(", isNearby=");
        w10.append(this.d);
        w10.append("}");
        return w10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.f52746a);
        df.l(parcel, 3, this.f52747b);
        df.s(parcel, 4, 4);
        parcel.writeInt(this.f52748c);
        df.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        df.r(parcel, q5);
    }
}
