package s7;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import r5.c0;
public final class g extends c6.a {
    public static final Parcelable.Creator<g> CREATOR = new c0(8);
    public final PendingIntent f47109a;

    public g(PendingIntent pendingIntent) {
        this.f47109a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.k(parcel, 1, this.f47109a, i10);
        g5.r(parcel, q10);
    }
}
