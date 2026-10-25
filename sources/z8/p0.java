package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class p0 extends p6.a {
    public static final Parcelable.Creator<p0> CREATOR = new o0(1);
    public final String f52759a;
    public final String f52760b;
    public final long f52761c;

    public p0(long j10, String str, String str2) {
        this.f52759a = str;
        this.f52760b = str2;
        this.f52761c = j10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.f52759a);
        df.l(parcel, 3, this.f52760b);
        df.s(parcel, 4, 8);
        parcel.writeLong(this.f52761c);
        df.r(parcel, q5);
    }
}
