package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class p0 extends p6.a {
    public static final Parcelable.Creator<p0> CREATOR = new o0(1);
    public final String f52762a;
    public final String f52763b;
    public final long f52764c;

    public p0(long j10, String str, String str2) {
        this.f52762a = str;
        this.f52763b = str2;
        this.f52764c = j10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.f52762a);
        df.l(parcel, 3, this.f52763b);
        df.s(parcel, 4, 8);
        parcel.writeLong(this.f52764c);
        df.r(parcel, q5);
    }
}
