package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class h0 extends p6.a {
    public static final Parcelable.Creator<h0> CREATOR = new d(28);
    public final int f52734a;

    public h0(int i10) {
        this.f52734a = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f52734a);
        df.r(parcel, q5);
    }
}
