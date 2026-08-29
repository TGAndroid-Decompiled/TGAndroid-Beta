package q7;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import com.google.android.gms.internal.cast.o;
import o6.w0;
public final class h extends a6.a {
    public static final Parcelable.Creator<h> CREATOR = new w0(18);
    public String[] f46422a;
    public int[] f46423b;
    public RemoteViews f46424c;
    public byte[] d;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.m(parcel, 1, this.f46422a);
        o.g(parcel, 2, this.f46423b);
        o.k(parcel, 3, this.f46424c, i10);
        o.c(parcel, 4, this.d);
        o.r(parcel, q6);
    }
}
