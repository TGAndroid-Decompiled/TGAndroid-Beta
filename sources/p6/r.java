package p6;

import android.os.Parcel;
import android.os.Parcelable;
public final class r extends q6.a {
    public static final Parcelable.Creator<r> CREATOR = new n8.g(18);
    public final int f53304a;
    public final String f53305b;
    public final long f53306c;
    public final int d;
    public final boolean f53307e;

    public r(int i3, int i10, long j10, String str, boolean z10) {
        this.f53304a = i3;
        this.f53305b = str;
        this.f53306c = j10;
        this.d = i10;
        this.f53307e = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.f53304a);
        j8.a.m(parcel, 2, this.f53305b);
        j8.a.r(parcel, 3, 8);
        parcel.writeLong(this.f53306c);
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(this.d);
        j8.a.r(parcel, 5, 4);
        parcel.writeInt(this.f53307e ? 1 : 0);
        j8.a.t(parcel, s6);
    }
}
