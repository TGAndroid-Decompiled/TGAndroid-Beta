package z5;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import p6.m;
import y8.i;
public final class f extends q6.a {
    public static final Parcelable.Creator<f> CREATOR = new i(2);
    public final PendingIntent f59782a;

    public f(PendingIntent pendingIntent) {
        m.g(pendingIntent);
        this.f59782a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.l(parcel, 1, this.f59782a, i3);
        j8.a.t(parcel, s6);
    }
}
