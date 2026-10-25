package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class u0 extends p6.a {
    public static final Parcelable.Creator<u0> CREATOR = new o0(6);
    public final int f52781a;
    public final int f52782b;

    public u0(int i10, int i11) {
        this.f52781a = i10;
        this.f52782b = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f52781a);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.f52782b);
        df.r(parcel, q5);
    }
}
