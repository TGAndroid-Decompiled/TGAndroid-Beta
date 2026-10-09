package r6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import p7.j;
import w7.d0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new j(7);
    public final PendingIntent f46991a;

    public b(PendingIntent pendingIntent) {
        this.f46991a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.k(parcel, 1, this.f46991a, i10);
        d0.r(parcel, q6);
    }
}
