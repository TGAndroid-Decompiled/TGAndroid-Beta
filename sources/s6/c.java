package s6;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import q7.m;
public final class c extends p6.a {
    public static final Parcelable.Creator<c> CREATOR = new m(7);
    public final int f47925a;
    public final boolean f47926b;

    public c(int i10, boolean z10) {
        this.f47925a = i10;
        this.f47926b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.f47925a);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f47926b ? 1 : 0);
        df.r(parcel, q5);
    }
}
