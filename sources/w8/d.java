package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.s;
import w7.h0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new s(16);
    public int f52774a;
    public String f52775b;
    public double f52776c;
    public String d;
    public long e;
    public int f52777f;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        int i11 = this.f52774a;
        h0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        h0.l(parcel, 3, this.f52775b);
        double d = this.f52776c;
        h0.s(parcel, 4, 8);
        parcel.writeDouble(d);
        h0.l(parcel, 5, this.d);
        long j10 = this.e;
        h0.s(parcel, 6, 8);
        parcel.writeLong(j10);
        int i12 = this.f52777f;
        h0.s(parcel, 7, 4);
        parcel.writeInt(i12);
        h0.r(parcel, q6);
    }
}
