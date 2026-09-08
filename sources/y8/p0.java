package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class p0 extends o6.a {
    public static final Parcelable.Creator<p0> CREATOR = new n0(2);
    public final int f49662a;
    public final String f49663b;

    public p0(int i10, String str) {
        this.f49662a = i10;
        this.f49663b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f49662a);
        w7.e0.l(parcel, 3, this.f49663b);
        w7.e0.r(parcel, q6);
    }
}
