package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class o0 extends o6.a {
    public static final Parcelable.Creator<o0> CREATOR = new n0(1);
    public final String f49629a;
    public final String f49630b;
    public final long f49631c;

    public o0(long j3, String str, String str2) {
        this.f49629a = str;
        this.f49630b = str2;
        this.f49631c = j3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.l(parcel, 2, this.f49629a);
        w7.e0.l(parcel, 3, this.f49630b);
        w7.e0.s(parcel, 4, 8);
        parcel.writeLong(this.f49631c);
        w7.e0.r(parcel, q6);
    }
}
