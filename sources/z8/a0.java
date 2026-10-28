package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class a0 extends p6.a {
    public static final Parcelable.Creator<a0> CREATOR = new d(21);
    public final int f52751a;
    public final n f52752b;

    public a0(int i10, n nVar) {
        this.f52751a = i10;
        this.f52752b = nVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f52751a);
        df.k(parcel, 3, this.f52752b, i10);
        df.r(parcel, q5);
    }
}
