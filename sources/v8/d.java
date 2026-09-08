package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new r(10);
    public String f47720a;
    public String f47721b;
    public int f47722c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 2, this.f47720a);
        e0.l(parcel, 3, this.f47721b);
        int i11 = this.f47722c;
        if (i11 != 1 && i11 != 2 && i11 != 3) {
            i11 = 0;
        }
        e0.s(parcel, 4, 4);
        parcel.writeInt(i11);
        e0.r(parcel, q6);
    }
}
