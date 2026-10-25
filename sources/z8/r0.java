package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class r0 extends p6.a {
    public static final Parcelable.Creator<r0> CREATOR = new o0(3);
    public final int f52768a;
    public final n f52769b;

    public r0(int i10, n nVar) {
        this.f52768a = i10;
        this.f52769b = nVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f52768a);
        df.k(parcel, 3, this.f52769b, i10);
        df.r(parcel, q5);
    }
}
