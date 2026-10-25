package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class i extends p6.a {
    public static final Parcelable.Creator<i> CREATOR = new d(4);
    public final int f52735a;

    public i(int i10) {
        this.f52735a = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f52735a);
        df.r(parcel, q5);
    }
}
