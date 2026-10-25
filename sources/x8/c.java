package x8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import w8.s;
public final class c extends p6.a {
    public static final Parcelable.Creator<c> CREATOR = new s(18);
    public String f51685a;
    public d f51686b;
    public f f51687c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.f51685a);
        df.k(parcel, 3, this.f51686b, i10);
        df.k(parcel, 5, this.f51687c, i10);
        df.r(parcel, q5);
    }
}
