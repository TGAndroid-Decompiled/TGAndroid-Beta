package r6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import p7.m;
import w7.f0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new m(5);
    public final PendingIntent f45032a;

    public b(PendingIntent pendingIntent) {
        this.f45032a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.k(parcel, 1, this.f45032a, i10);
        f0.r(parcel, q6);
    }
}
