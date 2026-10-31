package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.h0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new s(7);
    public String f50679a;
    public String f50680b;
    public int f50681c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 2, this.f50679a);
        h0.l(parcel, 3, this.f50680b);
        int i11 = this.f50681c;
        if (i11 != 1 && i11 != 2 && i11 != 3) {
            i11 = 0;
        }
        h0.s(parcel, 4, 4);
        parcel.writeInt(i11);
        h0.r(parcel, q6);
    }
}
