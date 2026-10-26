package s8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class f extends p6.a {
    public static final Parcelable.Creator<f> CREATOR = new q7.m(13);
    public int f47954a;
    public String f47955b;
    public String f47956c;
    public String d;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        int i11 = this.f47954a;
        df.s(parcel, 2, 4);
        parcel.writeInt(i11);
        df.l(parcel, 3, this.f47955b);
        df.l(parcel, 4, this.f47956c);
        df.l(parcel, 5, this.d);
        df.r(parcel, q5);
    }
}
