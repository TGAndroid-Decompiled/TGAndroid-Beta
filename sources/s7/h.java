package s7;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import j7.f5;
import r5.c0;
public final class h extends c6.a {
    public static final Parcelable.Creator<h> CREATOR = new c0(9);
    public String[] f44170a;
    public int[] f44171b;
    public RemoteViews f44172c;
    public byte[] d;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.m(parcel, 1, this.f44170a);
        f5.g(parcel, 2, this.f44171b);
        f5.k(parcel, 3, this.f44172c, i10);
        f5.c(parcel, 4, this.d);
        f5.r(parcel, q10);
    }
}
