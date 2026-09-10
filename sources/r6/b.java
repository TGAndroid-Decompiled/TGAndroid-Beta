package r6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import p7.j;
import w7.e0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new j(7);
    public final PendingIntent f41272a;

    public b(PendingIntent pendingIntent) {
        this.f41272a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.k(parcel, 1, this.f41272a, i10);
        e0.r(parcel, q6);
    }
}
