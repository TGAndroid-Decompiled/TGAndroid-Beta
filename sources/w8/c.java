package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.r;
import w7.d0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new r(20);
    public String f50238a;
    public d f50239b;
    public f f50240c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 2, this.f50238a);
        d0.k(parcel, 3, this.f50239b, i10);
        d0.k(parcel, 5, this.f50240c, i10);
        d0.r(parcel, q6);
    }
}
