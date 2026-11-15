package y8;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new v(6);
    public PendingIntent f60505a;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.k(parcel, 1, this.f60505a, i7);
        yb.s(parcel, r10);
    }
}
