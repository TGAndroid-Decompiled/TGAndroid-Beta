package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class u0 extends o6.a {
    public static final Parcelable.Creator<u0> CREATOR = new n0(7);
    public final int f48671a;
    public final long f48672b;
    public final List f48673c;

    public u0(int i10, long j10, ArrayList arrayList) {
        this.f48671a = i10;
        this.f48672b = j10;
        this.f48673c = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f48671a);
        w7.g0.s(parcel, 3, 8);
        parcel.writeLong(this.f48672b);
        w7.g0.p(parcel, 4, this.f48673c);
        w7.g0.r(parcel, q6);
    }
}
