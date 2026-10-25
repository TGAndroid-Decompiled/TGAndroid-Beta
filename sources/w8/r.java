package w8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class r extends p6.a {
    public static final Parcelable.Creator<r> CREATOR = new s(0);
    public final String f51129a;
    public final String f51130b;
    public final int f51131c;
    public final int d;

    public r(int i10, int i11, String str, String str2) {
        this.f51129a = str;
        this.f51130b = str2;
        this.f51131c = i10;
        this.d = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.f51129a);
        df.l(parcel, 3, this.f51130b);
        df.s(parcel, 4, 4);
        parcel.writeInt(this.f51131c);
        df.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        df.r(parcel, q5);
    }
}
