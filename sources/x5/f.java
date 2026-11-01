package x5;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import n6.l;
import v8.s;
import w7.h0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new s(23);
    public final PendingIntent f53096a;

    public f(PendingIntent pendingIntent) {
        l.g(pendingIntent);
        this.f53096a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.k(parcel, 1, this.f53096a, i10);
        h0.r(parcel, q6);
    }
}
