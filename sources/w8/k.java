package w8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class k extends p6.a {
    public static final Parcelable.Creator<k> CREATOR = new q7.m(28);
    public int f51110a;
    public String f51111b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        int i11 = this.f51110a;
        df.s(parcel, 2, 4);
        parcel.writeInt(i11);
        df.l(parcel, 3, this.f51111b);
        df.r(parcel, q5);
    }
}
