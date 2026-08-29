package s6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import o6.w0;
public final class e extends a6.a {
    public static final Parcelable.Creator<e> CREATOR = new w0(27);
    public final PendingIntent f47646a;
    public final g f47647b;

    public e(PendingIntent pendingIntent, g gVar) {
        this.f47646a = pendingIntent;
        this.f47647b = gVar;
        if (pendingIntent == null && gVar == null) {
            throw new IllegalArgumentException("pendingIntent or createCredentialResponse must be specified.");
        }
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int q6 = com.google.android.gms.internal.cast.o.q(dest, 20293);
        com.google.android.gms.internal.cast.o.k(dest, 1, this.f47646a, i10);
        com.google.android.gms.internal.cast.o.k(dest, 2, this.f47647b, i10);
        com.google.android.gms.internal.cast.o.r(dest, q6);
    }
}
