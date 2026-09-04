package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class u0 extends o6.a {
    public static final Parcelable.Creator<u0> CREATOR = new n0(7);
    public final int f49654a;
    public final long f49655b;
    public final List f49656c;

    public u0(int i10, long j3, ArrayList arrayList) {
        this.f49654a = i10;
        this.f49655b = j3;
        this.f49656c = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f49654a);
        w7.e0.s(parcel, 3, 8);
        parcel.writeLong(this.f49655b);
        w7.e0.p(parcel, 4, this.f49656c);
        w7.e0.r(parcel, q6);
    }
}
