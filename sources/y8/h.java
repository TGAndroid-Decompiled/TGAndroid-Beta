package y8;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new v(6);
    public PendingIntent f61081a;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.k(parcel, 1, this.f61081a, i7);
        cc.s(parcel, r10);
    }
}
