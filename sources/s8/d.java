package s8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class d extends p6.a {
    public static final Parcelable.Creator<d> CREATOR = new q7.m(11);
    public h f47975a;
    public String f47976b;
    public String f47977c;
    public i[] d;
    public f[] e;
    public String[] f47978f;
    public a[] h;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.k(parcel, 2, this.f47975a, i10);
        df.l(parcel, 3, this.f47976b);
        df.l(parcel, 4, this.f47977c);
        df.o(parcel, 5, this.d, i10);
        df.o(parcel, 6, this.e, i10);
        df.m(parcel, 7, this.f47978f);
        df.o(parcel, 8, this.h, i10);
        df.r(parcel, q5);
    }
}
