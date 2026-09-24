package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class p0 extends o6.a {
    public static final Parcelable.Creator<p0> CREATOR = new n0(2);
    public final int f46670a;
    public final String f46671b;

    public p0(int i10, String str) {
        this.f46670a = i10;
        this.f46671b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f46670a);
        w7.f0.l(parcel, 3, this.f46671b);
        w7.f0.r(parcel, q6);
    }
}
