package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class r0 extends o6.a {
    public static final Parcelable.Creator<r0> CREATOR = new l0(6);
    public final int f54294a;
    public final int f54295b;

    public r0(int i10, int i11) {
        this.f54294a = i10;
        this.f54295b = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 2, 4);
        parcel.writeInt(this.f54294a);
        w7.h0.s(parcel, 3, 4);
        parcel.writeInt(this.f54295b);
        w7.h0.r(parcel, q6);
    }
}
