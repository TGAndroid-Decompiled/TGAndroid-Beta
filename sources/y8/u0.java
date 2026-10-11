package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class u0 extends o6.a {
    public static final Parcelable.Creator<u0> CREATOR = new n0(7);
    public final int f51919a;
    public final long f51920b;
    public final List f51921c;

    public u0(int i10, long j3, ArrayList arrayList) {
        this.f51919a = i10;
        this.f51920b = j3;
        this.f51921c = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.s(parcel, 2, 4);
        parcel.writeInt(this.f51919a);
        w7.d0.s(parcel, 3, 8);
        parcel.writeLong(this.f51920b);
        w7.d0.p(parcel, 4, this.f51921c);
        w7.d0.r(parcel, q6);
    }
}
