package w8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class n extends p6.a {
    public static final Parcelable.Creator<n> CREATOR = new s(2);
    public int f51118a;
    public String f51119b;
    public String f51120c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        int i11 = this.f51118a;
        df.s(parcel, 1, 4);
        parcel.writeInt(i11);
        df.l(parcel, 2, this.f51119b);
        df.l(parcel, 3, this.f51120c);
        df.r(parcel, q5);
    }
}
