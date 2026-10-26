package s8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class a extends p6.a {
    public static final Parcelable.Creator<a> CREATOR = new q7.m(8);
    public int f47929a;
    public String[] f47930b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        int i11 = this.f47929a;
        df.s(parcel, 2, 4);
        parcel.writeInt(i11);
        df.m(parcel, 3, this.f47930b);
        df.r(parcel, q5);
    }
}
