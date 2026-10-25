package s8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class c extends p6.a {
    public static final Parcelable.Creator<c> CREATOR = new q7.m(12);
    public String f47933a;
    public String f47934b;
    public String f47935c;
    public String d;
    public String e;
    public b f47936f;
    public b h;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.f47933a);
        df.l(parcel, 3, this.f47934b);
        df.l(parcel, 4, this.f47935c);
        df.l(parcel, 5, this.d);
        df.l(parcel, 6, this.e);
        df.k(parcel, 7, this.f47936f, i10);
        df.k(parcel, 8, this.h, i10);
        df.r(parcel, q5);
    }
}
