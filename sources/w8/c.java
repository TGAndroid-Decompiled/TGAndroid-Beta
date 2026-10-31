package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.s;
import w7.h0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new s(17);
    public String f52753a;
    public d f52754b;
    public f f52755c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 2, this.f52753a);
        h0.k(parcel, 3, this.f52754b, i10);
        h0.k(parcel, 5, this.f52755c, i10);
        h0.r(parcel, q6);
    }
}
