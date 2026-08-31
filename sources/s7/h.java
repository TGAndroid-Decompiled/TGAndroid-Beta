package s7;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import j7.g5;
import r5.c0;
public final class h extends c6.a {
    public static final Parcelable.Creator<h> CREATOR = new c0(9);
    public String[] f47079a;
    public int[] f47080b;
    public RemoteViews f47081c;
    public byte[] d;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.m(parcel, 1, this.f47079a);
        g5.g(parcel, 2, this.f47080b);
        g5.k(parcel, 3, this.f47081c, i10);
        g5.c(parcel, 4, this.d);
        g5.r(parcel, q10);
    }
}
