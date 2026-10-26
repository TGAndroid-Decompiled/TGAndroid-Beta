package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class d0 extends p6.a {
    public static final Parcelable.Creator<d0> CREATOR = new d(24);
    public final int f52716a;
    public final m0 f52717b;

    public d0(int i10, m0 m0Var) {
        this.f52716a = i10;
        this.f52717b = m0Var;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f52716a);
        df.k(parcel, 3, this.f52717b, i10);
        df.r(parcel, q5);
    }
}
