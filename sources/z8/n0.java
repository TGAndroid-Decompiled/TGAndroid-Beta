package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class n0 extends p6.a {
    public static final Parcelable.Creator<n0> CREATOR = new o0(0);
    public final int f52755a;
    public final g f52756b;

    public n0(int i10, g gVar) {
        this.f52755a = i10;
        this.f52756b = gVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f52755a);
        df.k(parcel, 3, this.f52756b, i10);
        df.r(parcel, q5);
    }
}
