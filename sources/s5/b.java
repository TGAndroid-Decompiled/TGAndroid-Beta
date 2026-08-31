package s5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import r5.c0;
public final class b extends c6.a {
    public static final Parcelable.Creator<b> CREATOR = new c0(3);
    public final int f47016a;
    public final int f47017b;
    public final int f47018c;

    public b(int i10, int i11, int i12) {
        this.f47016a = i10;
        this.f47017b = i11;
        this.f47018c = i12;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f47016a);
        g5.s(parcel, 3, 4);
        parcel.writeInt(this.f47017b);
        g5.s(parcel, 4, 4);
        parcel.writeInt(this.f47018c);
        g5.r(parcel, q10);
    }
}
