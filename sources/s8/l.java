package s8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class l extends p6.a {
    public static final Parcelable.Creator<l> CREATOR = new q7.m(19);
    public String f48004a;
    public String f48005b;
    public int f48006c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.f48004a);
        df.l(parcel, 3, this.f48005b);
        int i11 = this.f48006c;
        df.s(parcel, 4, 4);
        parcel.writeInt(i11);
        df.r(parcel, q5);
    }
}
