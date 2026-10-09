package x5;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import n6.l;
import v8.r;
import w7.d0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new r(26);
    public final PendingIntent f50676a;

    public f(PendingIntent pendingIntent) {
        l.h(pendingIntent);
        this.f50676a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.k(parcel, 1, this.f50676a, i10);
        d0.r(parcel, q6);
    }
}
