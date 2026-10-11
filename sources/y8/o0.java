package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class o0 extends o6.a {
    public static final Parcelable.Creator<o0> CREATOR = new n0(1);
    public final String f51927a;
    public final String f51928b;
    public final long f51929c;

    public o0(long j3, String str, String str2) {
        this.f51927a = str;
        this.f51928b = str2;
        this.f51929c = j3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.l(parcel, 2, this.f51927a);
        w7.d0.l(parcel, 3, this.f51928b);
        w7.d0.s(parcel, 4, 8);
        parcel.writeLong(this.f51929c);
        w7.d0.r(parcel, q6);
    }
}
