package s8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class i extends p6.a {
    public static final Parcelable.Creator<i> CREATOR = new q7.m(18);
    public int f47960a;
    public String f47961b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        int i11 = this.f47960a;
        df.s(parcel, 2, 4);
        parcel.writeInt(i11);
        df.l(parcel, 3, this.f47961b);
        df.r(parcel, q5);
    }
}
