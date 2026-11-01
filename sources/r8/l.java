package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.h0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new p7.n(17);
    public String f46417a;
    public String f46418b;
    public int f46419c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 2, this.f46417a);
        h0.l(parcel, 3, this.f46418b);
        int i11 = this.f46419c;
        h0.s(parcel, 4, 4);
        parcel.writeInt(i11);
        h0.r(parcel, q6);
    }
}
