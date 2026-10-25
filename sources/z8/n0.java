package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class n0 extends p6.a {
    public static final Parcelable.Creator<n0> CREATOR = new o0(0);
    public final int f52752a;
    public final g f52753b;

    public n0(int i10, g gVar) {
        this.f52752a = i10;
        this.f52753b = gVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f52752a);
        df.k(parcel, 3, this.f52753b, i10);
        df.r(parcel, q5);
    }
}
