package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class o0 extends o6.a {
    public static final Parcelable.Creator<o0> CREATOR = new n0(1);
    public final String f46397a;
    public final String f46398b;
    public final long f46399c;

    public o0(long j3, String str, String str2) {
        this.f46397a = str;
        this.f46398b = str2;
        this.f46399c = j3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.l(parcel, 2, this.f46397a);
        w7.e0.l(parcel, 3, this.f46398b);
        w7.e0.s(parcel, 4, 8);
        parcel.writeLong(this.f46399c);
        w7.e0.r(parcel, q6);
    }
}
