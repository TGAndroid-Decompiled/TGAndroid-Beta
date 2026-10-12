package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.c0;
public final class i extends o6.a {
    public static final Parcelable.Creator<i> CREATOR = new p7.j(19);
    public int f47291a;
    public String f47292b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        int i11 = this.f47291a;
        c0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        c0.l(parcel, 3, this.f47292b);
        c0.r(parcel, q6);
    }
}
