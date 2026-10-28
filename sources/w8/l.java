package w8;

import a8.df;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class l extends p6.a {
    public static final Parcelable.Creator<l> CREATOR = new q7.m(29);
    public int f51173a;
    public Bundle f51174b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        int i11 = this.f51173a;
        df.s(parcel, 2, 4);
        parcel.writeInt(i11);
        df.b(parcel, 3, this.f51174b);
        df.r(parcel, q5);
    }
}
