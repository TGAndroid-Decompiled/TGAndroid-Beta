package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.h0;
public final class i extends o6.a {
    public static final Parcelable.Creator<i> CREATOR = new p7.n(16);
    public int f46400a;
    public String f46401b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        int i11 = this.f46400a;
        h0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        h0.l(parcel, 3, this.f46401b);
        h0.r(parcel, q6);
    }
}
