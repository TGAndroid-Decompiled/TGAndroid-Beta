package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.h0;
public final class r extends o6.a {
    public static final Parcelable.Creator<r> CREATOR = new p7.n(29);
    public final String f50733a;
    public final String f50734b;
    public final int f50735c;
    public final int d;

    public r(int i10, int i11, String str, String str2) {
        this.f50733a = str;
        this.f50734b = str2;
        this.f50735c = i10;
        this.d = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 2, this.f50733a);
        h0.l(parcel, 3, this.f50734b);
        h0.s(parcel, 4, 4);
        parcel.writeInt(this.f50735c);
        h0.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        h0.r(parcel, q6);
    }
}
