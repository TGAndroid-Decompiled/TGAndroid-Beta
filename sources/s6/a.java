package s6;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import q7.m;
public final class a extends p6.a {
    public static final Parcelable.Creator<a> CREATOR = new m(5);
    public final boolean f47922a;
    public final int f47923b;

    public a(int i10, boolean z10) {
        this.f47922a = z10;
        this.f47923b = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.f47922a ? 1 : 0);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f47923b);
        df.r(parcel, q5);
    }
}
