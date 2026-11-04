package x8;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
public final class h extends q6.a {
    public static final Parcelable.Creator<h> CREATOR = new w8.b(21);
    public PendingIntent f58543a;

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.l(parcel, 1, this.f58543a, i3);
        j8.a.t(parcel, s6);
    }
}
