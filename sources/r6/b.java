package r6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import p7.j;
import w7.c0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new j(7);
    public final PendingIntent f47215a;

    public b(PendingIntent pendingIntent) {
        this.f47215a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.k(parcel, 1, this.f47215a, i10);
        c0.r(parcel, q6);
    }
}
