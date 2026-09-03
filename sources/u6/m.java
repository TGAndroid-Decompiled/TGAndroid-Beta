package u6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import r5.c0;
public final class m extends c6.a {
    public static final Parcelable.Creator<m> CREATOR = new c0(28);
    public final PendingIntent f48469a;

    public m(PendingIntent pendingIntent) {
        kotlin.jvm.internal.j.e(pendingIntent, "pendingIntent");
        this.f48469a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int q10 = g5.q(dest, 20293);
        g5.k(dest, 1, this.f48469a, i10);
        g5.r(dest, q10);
    }
}
