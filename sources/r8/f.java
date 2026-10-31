package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.h0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new p7.n(11);
    public int f46391a;
    public String f46392b;
    public String f46393c;
    public String d;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        int i11 = this.f46391a;
        h0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        h0.l(parcel, 3, this.f46392b);
        h0.l(parcel, 4, this.f46393c);
        h0.l(parcel, 5, this.d);
        h0.r(parcel, q6);
    }
}
