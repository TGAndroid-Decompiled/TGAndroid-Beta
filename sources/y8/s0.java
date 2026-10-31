package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class s0 extends o6.a {
    public static final Parcelable.Creator<s0> CREATOR = new l0(7);
    public final int f54277a;
    public final long f54278b;
    public final List f54279c;

    public s0(int i10, long j10, ArrayList arrayList) {
        this.f54277a = i10;
        this.f54278b = j10;
        this.f54279c = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 2, 4);
        parcel.writeInt(this.f54277a);
        w7.h0.s(parcel, 3, 8);
        parcel.writeLong(this.f54278b);
        w7.h0.p(parcel, 4, this.f54279c);
        w7.h0.r(parcel, q6);
    }
}
