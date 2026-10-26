package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class q extends p6.a {
    public static final Parcelable.Creator<q> CREATOR = new d(11);
    public final int f52765a;
    public final c f52766b;

    public q(int i10, c cVar) {
        this.f52765a = i10;
        this.f52766b = cVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f52765a);
        df.k(parcel, 3, this.f52766b, i10);
        df.r(parcel, q5);
    }
}
