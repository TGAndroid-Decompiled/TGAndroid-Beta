package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class q extends p6.a {
    public static final Parcelable.Creator<q> CREATOR = new d(11);
    public final int f52823a;
    public final c f52824b;

    public q(int i10, c cVar) {
        this.f52823a = i10;
        this.f52824b = cVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f52823a);
        df.k(parcel, 3, this.f52824b, i10);
        df.r(parcel, q5);
    }
}
