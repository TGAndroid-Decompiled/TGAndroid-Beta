package v8;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import w7.h0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new s(12);
    public PendingIntent f50713a;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.k(parcel, 1, this.f50713a, i10);
        h0.r(parcel, q6);
    }
}
