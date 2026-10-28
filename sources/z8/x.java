package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
public final class x extends p6.a {
    public static final Parcelable.Creator<x> CREATOR = new d(18);
    public final int f52854a;
    public final ConnectionConfiguration f52855b;

    public x(int i10, ConnectionConfiguration connectionConfiguration) {
        this.f52854a = i10;
        this.f52855b = connectionConfiguration;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f52854a);
        df.k(parcel, 3, this.f52855b, i10);
        df.r(parcel, q5);
    }
}
