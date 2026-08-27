package y5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class f0 extends z5.a {
    public static final Parcelable.Creator<f0> CREATOR = new w7.f(17);

    public Bundle f49627a;

    public v5.c[] f49628b;

    public int f49629c;
    public e d;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.b(parcel, 1, this.f49627a);
        r8.o(parcel, 2, this.f49628b, i10);
        int i11 = this.f49629c;
        r8.s(parcel, 3, 4);
        parcel.writeInt(i11);
        r8.k(parcel, 4, this.d, i10);
        r8.r(parcel, iQ);
    }
}
