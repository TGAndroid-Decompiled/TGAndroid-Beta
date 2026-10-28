package w8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class d extends p6.a {
    public static final Parcelable.Creator<d> CREATOR = new s(8);
    public String f51138a;
    public String f51139b;
    public int f51140c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.f51138a);
        df.l(parcel, 3, this.f51139b);
        int i11 = this.f51140c;
        if (i11 != 1 && i11 != 2 && i11 != 3) {
            i11 = 0;
        }
        df.s(parcel, 4, 4);
        parcel.writeInt(i11);
        df.r(parcel, q5);
    }
}
