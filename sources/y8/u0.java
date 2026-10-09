package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class u0 extends o6.a {
    public static final Parcelable.Creator<u0> CREATOR = new n0(7);
    public final int f51832a;
    public final long f51833b;
    public final List f51834c;

    public u0(int i10, long j3, ArrayList arrayList) {
        this.f51832a = i10;
        this.f51833b = j3;
        this.f51834c = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.s(parcel, 2, 4);
        parcel.writeInt(this.f51832a);
        w7.d0.s(parcel, 3, 8);
        parcel.writeLong(this.f51833b);
        w7.d0.p(parcel, 4, this.f51834c);
        w7.d0.r(parcel, q6);
    }
}
