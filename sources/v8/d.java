package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new s(8);
    public String f48276a;
    public String f48277b;
    public int f48278c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.f48276a);
        f0.l(parcel, 3, this.f48277b);
        int i11 = this.f48278c;
        if (i11 != 1 && i11 != 2 && i11 != 3) {
            i11 = 0;
        }
        f0.s(parcel, 4, 4);
        parcel.writeInt(i11);
        f0.r(parcel, q6);
    }
}
