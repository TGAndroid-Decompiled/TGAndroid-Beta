package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class s0 extends o6.a {
    public static final Parcelable.Creator<s0> CREATOR = new l0(7);
    public final int f54298a;
    public final long f54299b;
    public final List f54300c;

    public s0(int i10, long j10, ArrayList arrayList) {
        this.f54298a = i10;
        this.f54299b = j10;
        this.f54300c = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 2, 4);
        parcel.writeInt(this.f54298a);
        w7.h0.s(parcel, 3, 8);
        parcel.writeLong(this.f54299b);
        w7.h0.p(parcel, 4, this.f54300c);
        w7.h0.r(parcel, q6);
    }
}
