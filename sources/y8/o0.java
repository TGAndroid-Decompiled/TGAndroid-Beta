package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class o0 extends o6.a {
    public static final Parcelable.Creator<o0> CREATOR = new n0(1);
    public final String f46677a;
    public final String f46678b;
    public final long f46679c;

    public o0(long j3, String str, String str2) {
        this.f46677a = str;
        this.f46678b = str2;
        this.f46679c = j3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 2, this.f46677a);
        w7.f0.l(parcel, 3, this.f46678b);
        w7.f0.s(parcel, 4, 8);
        parcel.writeLong(this.f46679c);
        w7.f0.r(parcel, q6);
    }
}
