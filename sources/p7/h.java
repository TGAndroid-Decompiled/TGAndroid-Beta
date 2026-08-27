package p7;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import h7.r8;
import n6.w0;

public final class h extends z5.a {
    public static final Parcelable.Creator<h> CREATOR = new w0(14);

    public String[] f45515a;

    public int[] f45516b;

    public RemoteViews f45517c;
    public byte[] d;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.m(parcel, 1, this.f45515a);
        r8.g(parcel, 2, this.f45516b);
        r8.k(parcel, 3, this.f45517c, i10);
        r8.c(parcel, 4, this.d);
        r8.r(parcel, iQ);
    }
}
