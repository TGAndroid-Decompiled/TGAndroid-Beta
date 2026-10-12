package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.c0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new r(10);
    public String f49668a;
    public String f49669b;
    public int f49670c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.l(parcel, 2, this.f49668a);
        c0.l(parcel, 3, this.f49669b);
        int i11 = this.f49670c;
        if (i11 != 1 && i11 != 2 && i11 != 3) {
            i11 = 0;
        }
        c0.s(parcel, 4, 4);
        parcel.writeInt(i11);
        c0.r(parcel, q6);
    }
}
