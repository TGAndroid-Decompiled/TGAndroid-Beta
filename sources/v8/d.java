package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.d0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new r(10);
    public String f49440a;
    public String f49441b;
    public int f49442c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 2, this.f49440a);
        d0.l(parcel, 3, this.f49441b);
        int i11 = this.f49442c;
        if (i11 != 1 && i11 != 2 && i11 != 3) {
            i11 = 0;
        }
        d0.s(parcel, 4, 4);
        parcel.writeInt(i11);
        d0.r(parcel, q6);
    }
}
