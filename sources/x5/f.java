package x5;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import n6.l;
import v8.s;
import w7.g0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new s(24);
    public final PendingIntent f47912a;

    public f(PendingIntent pendingIntent) {
        l.h(pendingIntent);
        this.f47912a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.k(parcel, 1, this.f47912a, i10);
        g0.r(parcel, q6);
    }
}
