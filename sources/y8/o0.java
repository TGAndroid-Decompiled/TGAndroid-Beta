package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class o0 extends o6.a {
    public static final Parcelable.Creator<o0> CREATOR = new n0(1);
    public final String f46425a;
    public final String f46426b;
    public final long f46427c;

    public o0(long j3, String str, String str2) {
        this.f46425a = str;
        this.f46426b = str2;
        this.f46427c = j3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.l(parcel, 2, this.f46425a);
        w7.e0.l(parcel, 3, this.f46426b);
        w7.e0.s(parcel, 4, 8);
        parcel.writeLong(this.f46427c);
        w7.e0.r(parcel, q6);
    }
}
