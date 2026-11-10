package q6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class r extends r6.a {
    public static final Parcelable.Creator<r> CREATOR = new q4.x(3);
    public final int f53939a;
    public final String f53940b;
    public final long f53941c;
    public final int d;
    public final boolean f53942e;

    public r(int i7, int i10, long j3, String str, boolean z9) {
        this.f53939a = i7;
        this.f53940b = str;
        this.f53941c = j3;
        this.d = i10;
        this.f53942e = z9;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.f53939a);
        xb.l(parcel, 2, this.f53940b);
        xb.q(parcel, 3, 8);
        parcel.writeLong(this.f53941c);
        xb.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        xb.q(parcel, 5, 4);
        parcel.writeInt(this.f53942e ? 1 : 0);
        xb.s(parcel, r10);
    }
}
