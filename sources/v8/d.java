package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new r(10);
    public String f43232a;
    public String f43233b;
    public int f43234c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 2, this.f43232a);
        e0.l(parcel, 3, this.f43233b);
        int i11 = this.f43234c;
        if (i11 != 1 && i11 != 2 && i11 != 3) {
            i11 = 0;
        }
        e0.s(parcel, 4, 4);
        parcel.writeInt(i11);
        e0.r(parcel, q6);
    }
}
