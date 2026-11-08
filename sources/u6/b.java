package u6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import q4.x;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new x(28);
    public final PendingIntent f56354a;

    public b(PendingIntent pendingIntent) {
        this.f56354a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.k(parcel, 1, this.f56354a, i7);
        xb.s(parcel, r10);
    }
}
