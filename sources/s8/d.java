package s8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class d extends p6.a {
    public static final Parcelable.Creator<d> CREATOR = new q7.m(11);
    public h f47937a;
    public String f47938b;
    public String f47939c;
    public i[] d;
    public f[] e;
    public String[] f47940f;
    public a[] h;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.k(parcel, 2, this.f47937a, i10);
        df.l(parcel, 3, this.f47938b);
        df.l(parcel, 4, this.f47939c);
        df.o(parcel, 5, this.d, i10);
        df.o(parcel, 6, this.e, i10);
        df.m(parcel, 7, this.f47940f);
        df.o(parcel, 8, this.h, i10);
        df.r(parcel, q5);
    }
}
