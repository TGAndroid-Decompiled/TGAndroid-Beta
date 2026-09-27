package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new r(10);
    public String f44540a;
    public String f44541b;
    public int f44542c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.f44540a);
        f0.l(parcel, 3, this.f44541b);
        int i11 = this.f44542c;
        if (i11 != 1 && i11 != 2 && i11 != 3) {
            i11 = 0;
        }
        f0.s(parcel, 4, 4);
        parcel.writeInt(i11);
        f0.r(parcel, q6);
    }
}
