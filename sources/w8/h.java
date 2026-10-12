package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.r;
import w7.c0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new r(24);
    public String f50443a;
    public String f50444b;
    public f f50445c;
    public g d;
    public g f50446e;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.l(parcel, 2, this.f50443a);
        c0.l(parcel, 3, this.f50444b);
        c0.k(parcel, 4, this.f50445c, i10);
        c0.k(parcel, 5, this.d, i10);
        c0.k(parcel, 6, this.f50446e, i10);
        c0.r(parcel, q6);
    }
}
