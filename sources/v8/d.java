package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new r(10);
    public String f48173a;
    public String f48174b;
    public int f48175c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.f48173a);
        g0.l(parcel, 3, this.f48174b);
        int i11 = this.f48175c;
        if (i11 != 1 && i11 != 2 && i11 != 3) {
            i11 = 0;
        }
        g0.s(parcel, 4, 4);
        parcel.writeInt(i11);
        g0.r(parcel, q6);
    }
}
