package s6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
public final class m extends a6.a {
    public static final Parcelable.Creator<m> CREATOR = new i(5);
    public final PendingIntent f47664a;

    public m(PendingIntent pendingIntent) {
        kotlin.jvm.internal.j.e(pendingIntent, "pendingIntent");
        this.f47664a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int q6 = com.google.android.gms.internal.cast.o.q(dest, 20293);
        com.google.android.gms.internal.cast.o.k(dest, 1, this.f47664a, i10);
        com.google.android.gms.internal.cast.o.r(dest, q6);
    }
}
