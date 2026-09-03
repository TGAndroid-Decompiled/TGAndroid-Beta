package u6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import r5.c0;
public final class l extends c6.a {
    public static final Parcelable.Creator<l> CREATOR = new c0(27);
    public final PendingIntent f45237a;

    public l(PendingIntent pendingIntent) {
        kotlin.jvm.internal.j.e(pendingIntent, "pendingIntent");
        this.f45237a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int q10 = f5.q(dest, 20293);
        f5.k(dest, 1, this.f45237a, i10);
        f5.r(dest, q10);
    }
}
