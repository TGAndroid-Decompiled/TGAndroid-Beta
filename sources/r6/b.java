package r6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import p7.n;
import w7.h0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new n(4);
    public final PendingIntent f46344a;

    public b(PendingIntent pendingIntent) {
        this.f46344a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.k(parcel, 1, this.f46344a, i10);
        h0.r(parcel, q6);
    }
}
