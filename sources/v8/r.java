package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.h0;
public final class r extends o6.a {
    public static final Parcelable.Creator<r> CREATOR = new p7.n(29);
    public final String f50747a;
    public final String f50748b;
    public final int f50749c;
    public final int d;

    public r(int i10, int i11, String str, String str2) {
        this.f50747a = str;
        this.f50748b = str2;
        this.f50749c = i10;
        this.d = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 2, this.f50747a);
        h0.l(parcel, 3, this.f50748b);
        h0.s(parcel, 4, 4);
        parcel.writeInt(this.f50749c);
        h0.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        h0.r(parcel, q6);
    }
}
