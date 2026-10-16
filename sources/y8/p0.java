package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class p0 extends o6.a {
    public static final Parcelable.Creator<p0> CREATOR = new n0(2);
    public final int f48649a;
    public final String f48650b;

    public p0(int i10, String str) {
        this.f48649a = i10;
        this.f48650b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f48649a);
        w7.f0.l(parcel, 3, this.f48650b);
        w7.f0.r(parcel, q6);
    }
}
