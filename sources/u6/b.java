package u6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import q4.x;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new x(28);
    public final PendingIntent f58556a;

    public b(PendingIntent pendingIntent) {
        this.f58556a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.k(parcel, 1, this.f58556a, i7);
        cc.s(parcel, r10);
    }
}
