package u6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import r5.c0;
public final class e extends c6.a {
    public static final Parcelable.Creator<e> CREATOR = new c0(19);
    public final PendingIntent f45160a;
    public final g f45161b;

    public e(PendingIntent pendingIntent, g gVar) {
        this.f45160a = pendingIntent;
        this.f45161b = gVar;
        if (pendingIntent == null && gVar == null) {
            throw new IllegalArgumentException("pendingIntent or createCredentialResponse must be specified.");
        }
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int q10 = f5.q(dest, 20293);
        f5.k(dest, 1, this.f45160a, i10);
        f5.k(dest, 2, this.f45161b, i10);
        f5.r(dest, q10);
    }
}
