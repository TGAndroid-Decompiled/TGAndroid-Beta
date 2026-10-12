package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class q0 extends o6.a {
    public static final Parcelable.Creator<q0> CREATOR = new n0(3);
    public final int f52039a;
    public final m f52040b;

    public q0(int i10, m mVar) {
        this.f52039a = i10;
        this.f52040b = mVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.c0.q(parcel, 20293);
        w7.c0.s(parcel, 2, 4);
        parcel.writeInt(this.f52039a);
        w7.c0.k(parcel, 3, this.f52040b, i10);
        w7.c0.r(parcel, q6);
    }
}
