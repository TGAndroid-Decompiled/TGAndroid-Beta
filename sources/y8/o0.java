package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class o0 extends o6.a {
    public static final Parcelable.Creator<o0> CREATOR = new n0(1);
    public final String f49657a;
    public final String f49658b;
    public final long f49659c;

    public o0(long j3, String str, String str2) {
        this.f49657a = str;
        this.f49658b = str2;
        this.f49659c = j3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.l(parcel, 2, this.f49657a);
        w7.e0.l(parcel, 3, this.f49658b);
        w7.e0.s(parcel, 4, 8);
        parcel.writeLong(this.f49659c);
        w7.e0.r(parcel, q6);
    }
}
