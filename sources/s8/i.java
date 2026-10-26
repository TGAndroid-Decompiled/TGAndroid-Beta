package s8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class i extends p6.a {
    public static final Parcelable.Creator<i> CREATOR = new q7.m(18);
    public int f47963a;
    public String f47964b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        int i11 = this.f47963a;
        df.s(parcel, 2, 4);
        parcel.writeInt(i11);
        df.l(parcel, 3, this.f47964b);
        df.r(parcel, q5);
    }
}
