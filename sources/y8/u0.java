package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class u0 extends o6.a {
    public static final Parcelable.Creator<u0> CREATOR = new n0(7);
    public final int f50059a;
    public final long f50060b;
    public final List f50061c;

    public u0(int i10, long j10, ArrayList arrayList) {
        this.f50059a = i10;
        this.f50060b = j10;
        this.f50061c = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f50059a);
        w7.f0.s(parcel, 3, 8);
        parcel.writeLong(this.f50060b);
        w7.f0.p(parcel, 4, this.f50061c);
        w7.f0.r(parcel, q6);
    }
}
