package r6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import p7.j;
import w7.g0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new j(7);
    public final PendingIntent f45834a;

    public b(PendingIntent pendingIntent) {
        this.f45834a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.k(parcel, 1, this.f45834a, i10);
        g0.r(parcel, q6);
    }
}
