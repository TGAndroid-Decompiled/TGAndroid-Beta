package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class q0 extends p6.a {
    public static final Parcelable.Creator<q0> CREATOR = new o0(2);
    public final int f52764a;
    public final String f52765b;

    public q0(int i10, String str) {
        this.f52764a = i10;
        this.f52765b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f52764a);
        df.l(parcel, 3, this.f52765b);
        df.r(parcel, q5);
    }
}
