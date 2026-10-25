package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class a0 extends p6.a {
    public static final Parcelable.Creator<a0> CREATOR = new d(21);
    public final int f52690a;
    public final n f52691b;

    public a0(int i10, n nVar) {
        this.f52690a = i10;
        this.f52691b = nVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f52690a);
        df.k(parcel, 3, this.f52691b, i10);
        df.r(parcel, q5);
    }
}
