package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new s(8);
    public String f46869a;
    public String f46870b;
    public int f46871c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.f46869a);
        g0.l(parcel, 3, this.f46870b);
        int i11 = this.f46871c;
        if (i11 != 1 && i11 != 2 && i11 != 3) {
            i11 = 0;
        }
        g0.s(parcel, 4, 4);
        parcel.writeInt(i11);
        g0.r(parcel, q6);
    }
}
