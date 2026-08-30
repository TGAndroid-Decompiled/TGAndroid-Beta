package s5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import r5.c0;
public final class b extends c6.a {
    public static final Parcelable.Creator<b> CREATOR = new c0(3);
    public final int f44045a;
    public final int f44046b;
    public final int f44047c;

    public b(int i10, int i11, int i12) {
        this.f44045a = i10;
        this.f44046b = i11;
        this.f44047c = i12;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f44045a);
        f5.s(parcel, 3, 4);
        parcel.writeInt(this.f44046b);
        f5.s(parcel, 4, 4);
        parcel.writeInt(this.f44047c);
        f5.r(parcel, q10);
    }
}
