package u6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import r5.c0;
public final class e extends c6.a {
    public static final Parcelable.Creator<e> CREATOR = new c0(19);
    public final PendingIntent f48451a;
    public final g f48452b;

    public e(PendingIntent pendingIntent, g gVar) {
        this.f48451a = pendingIntent;
        this.f48452b = gVar;
        if (pendingIntent == null && gVar == null) {
            throw new IllegalArgumentException("pendingIntent or createCredentialResponse must be specified.");
        }
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int q10 = g5.q(dest, 20293);
        g5.k(dest, 1, this.f48451a, i10);
        g5.k(dest, 2, this.f48452b, i10);
        g5.r(dest, q10);
    }
}
