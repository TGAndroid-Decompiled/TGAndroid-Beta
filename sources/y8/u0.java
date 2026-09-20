package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class u0 extends o6.a {
    public static final Parcelable.Creator<u0> CREATOR = new n0(7);
    public final int f46725a;
    public final long f46726b;
    public final List f46727c;

    public u0(int i10, long j3, ArrayList arrayList) {
        this.f46725a = i10;
        this.f46726b = j3;
        this.f46727c = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f46725a);
        w7.f0.s(parcel, 3, 8);
        parcel.writeLong(this.f46726b);
        w7.f0.p(parcel, 4, this.f46727c);
        w7.f0.r(parcel, q6);
    }
}
