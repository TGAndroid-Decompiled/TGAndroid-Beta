package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class s0 extends p6.a {
    public static final Parcelable.Creator<s0> CREATOR = new o0(4);
    public final int f52833a;

    public s0(int i10) {
        this.f52833a = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f52833a);
        df.r(parcel, q5);
    }
}
