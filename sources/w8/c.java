package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.r;
import w7.e0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new r(20);
    public String f44886a;
    public d f44887b;
    public f f44888c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 2, this.f44886a);
        e0.k(parcel, 3, this.f44887b, i10);
        e0.k(parcel, 5, this.f44888c, i10);
        e0.r(parcel, q6);
    }
}
