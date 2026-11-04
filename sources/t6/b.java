package t6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import q8.i;
public final class b extends q6.a {
    public static final Parcelable.Creator<b> CREATOR = new i(12);
    public final PendingIntent f54945a;

    public b(PendingIntent pendingIntent) {
        this.f54945a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.l(parcel, 1, this.f54945a, i3);
        j8.a.t(parcel, s6);
    }
}
