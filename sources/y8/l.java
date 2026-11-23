package y8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class l extends r6.a {
    public static final Parcelable.Creator<l> CREATOR = new u8.o(22);
    public int f61099a;
    public Bundle f61100b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        int i10 = this.f61099a;
        cc.q(parcel, 2, 4);
        parcel.writeInt(i10);
        cc.b(parcel, 3, this.f61100b);
        cc.s(parcel, r10);
    }
}
