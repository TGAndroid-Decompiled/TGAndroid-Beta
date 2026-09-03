package s5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import r5.c0;
public final class b extends c6.a {
    public static final Parcelable.Creator<b> CREATOR = new c0(3);
    public final int f47047a;
    public final int f47048b;
    public final int f47049c;

    public b(int i10, int i11, int i12) {
        this.f47047a = i10;
        this.f47048b = i11;
        this.f47049c = i12;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f47047a);
        g5.s(parcel, 3, 4);
        parcel.writeInt(this.f47048b);
        g5.s(parcel, 4, 4);
        parcel.writeInt(this.f47049c);
        g5.r(parcel, q10);
    }
}
