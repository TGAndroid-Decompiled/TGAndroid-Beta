package s5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import r5.c0;
public final class b extends c6.a {
    public static final Parcelable.Creator<b> CREATOR = new c0(3);
    public final int f44110a;
    public final int f44111b;
    public final int f44112c;

    public b(int i10, int i11, int i12) {
        this.f44110a = i10;
        this.f44111b = i11;
        this.f44112c = i12;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f44110a);
        f5.s(parcel, 3, 4);
        parcel.writeInt(this.f44111b);
        f5.s(parcel, 4, 4);
        parcel.writeInt(this.f44112c);
        f5.r(parcel, q10);
    }
}
