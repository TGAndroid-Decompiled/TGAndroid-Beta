package y8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class l extends r6.a {
    public static final Parcelable.Creator<l> CREATOR = new u8.o(22);
    public int f61218a;
    public Bundle f61219b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        int i10 = this.f61218a;
        cc.q(parcel, 2, 4);
        parcel.writeInt(i10);
        cc.b(parcel, 3, this.f61219b);
        cc.s(parcel, r10);
    }
}
