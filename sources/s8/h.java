package s8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class h extends p6.a {
    public static final Parcelable.Creator<h> CREATOR = new q7.m(15);
    public String f47959a;
    public String f47960b;
    public String f47961c;
    public String d;
    public String e;
    public String f47962f;
    public String h;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.f47959a);
        df.l(parcel, 3, this.f47960b);
        df.l(parcel, 4, this.f47961c);
        df.l(parcel, 5, this.d);
        df.l(parcel, 6, this.e);
        df.l(parcel, 7, this.f47962f);
        df.l(parcel, 8, this.h);
        df.r(parcel, q5);
    }
}
