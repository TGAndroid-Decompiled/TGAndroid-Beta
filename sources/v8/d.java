package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new r(10);
    public String f44496a;
    public String f44497b;
    public int f44498c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.f44496a);
        f0.l(parcel, 3, this.f44497b);
        int i11 = this.f44498c;
        if (i11 != 1 && i11 != 2 && i11 != 3) {
            i11 = 0;
        }
        f0.s(parcel, 4, 4);
        parcel.writeInt(i11);
        f0.r(parcel, q6);
    }
}
