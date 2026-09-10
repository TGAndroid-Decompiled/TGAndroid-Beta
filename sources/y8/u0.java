package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class u0 extends o6.a {
    public static final Parcelable.Creator<u0> CREATOR = new n0(7);
    public final int f46573a;
    public final long f46574b;
    public final List f46575c;

    public u0(int i10, long j3, ArrayList arrayList) {
        this.f46573a = i10;
        this.f46574b = j3;
        this.f46575c = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f46573a);
        w7.e0.s(parcel, 3, 8);
        parcel.writeLong(this.f46574b);
        w7.e0.p(parcel, 4, this.f46575c);
        w7.e0.r(parcel, q6);
    }
}
