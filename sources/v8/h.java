package v8;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new r(15);
    public PendingIntent f48203a;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.k(parcel, 1, this.f48203a, i10);
        g0.r(parcel, q6);
    }
}
