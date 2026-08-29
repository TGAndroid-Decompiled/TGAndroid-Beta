package s6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
public final class n extends a6.a {
    public static final Parcelable.Creator<n> CREATOR = new i(6);
    public final PendingIntent f47665a;

    public n(PendingIntent pendingIntent) {
        kotlin.jvm.internal.j.e(pendingIntent, "pendingIntent");
        this.f47665a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int q6 = com.google.android.gms.internal.cast.o.q(dest, 20293);
        com.google.android.gms.internal.cast.o.k(dest, 1, this.f47665a, i10);
        com.google.android.gms.internal.cast.o.r(dest, q6);
    }
}
