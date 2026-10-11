package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.r;
import w7.d0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new r(20);
    public String f50281a;
    public d f50282b;
    public f f50283c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 2, this.f50281a);
        d0.k(parcel, 3, this.f50282b, i10);
        d0.k(parcel, 5, this.f50283c, i10);
        d0.r(parcel, q6);
    }
}
