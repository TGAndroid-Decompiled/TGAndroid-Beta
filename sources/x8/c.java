package x8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import w8.s;
public final class c extends p6.a {
    public static final Parcelable.Creator<c> CREATOR = new s(18);
    public String f51746a;
    public d f51747b;
    public f f51748c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.f51746a);
        df.k(parcel, 3, this.f51747b, i10);
        df.k(parcel, 5, this.f51748c, i10);
        df.r(parcel, q5);
    }
}
