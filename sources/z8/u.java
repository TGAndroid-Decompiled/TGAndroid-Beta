package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class u extends p6.a {
    public static final Parcelable.Creator<u> CREATOR = new d(15);
    public final int f52778a;
    public final boolean f52779b;
    public final boolean f52780c;

    public u(int i10, boolean z10, boolean z11) {
        this.f52778a = i10;
        this.f52779b = z10;
        this.f52780c = z11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f52778a);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.f52779b ? 1 : 0);
        df.s(parcel, 4, 4);
        parcel.writeInt(this.f52780c ? 1 : 0);
        df.r(parcel, q5);
    }
}
