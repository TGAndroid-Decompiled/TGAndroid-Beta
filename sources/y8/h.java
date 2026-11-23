package y8;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new v(6);
    public PendingIntent f61116a;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.k(parcel, 1, this.f61116a, i7);
        bc.s(parcel, r10);
    }
}
