package s7;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import r5.c0;
public final class g extends c6.a {
    public static final Parcelable.Creator<g> CREATOR = new c0(8);
    public final PendingIntent f44169a;

    public g(PendingIntent pendingIntent) {
        this.f44169a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.k(parcel, 1, this.f44169a, i10);
        f5.r(parcel, q10);
    }
}
