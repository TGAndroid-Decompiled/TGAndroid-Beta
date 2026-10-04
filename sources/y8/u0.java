package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class u0 extends o6.a {
    public static final Parcelable.Creator<u0> CREATOR = new n0(7);
    public final int f50536a;
    public final long f50537b;
    public final List f50538c;

    public u0(int i10, long j3, ArrayList arrayList) {
        this.f50536a = i10;
        this.f50537b = j3;
        this.f50538c = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f50536a);
        w7.g0.s(parcel, 3, 8);
        parcel.writeLong(this.f50537b);
        w7.g0.p(parcel, 4, this.f50538c);
        w7.g0.r(parcel, q6);
    }
}
