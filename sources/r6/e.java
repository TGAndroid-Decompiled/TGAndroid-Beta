package r6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import n6.w0;

public final class e extends z5.a {
    public static final Parcelable.Creator<e> CREATOR = new w0(23);

    public final PendingIntent f46834a;

    public final g f46835b;

    public e(PendingIntent pendingIntent, g gVar) {
        this.f46834a = pendingIntent;
        this.f46835b = gVar;
        if (pendingIntent == null && gVar == null) {
            throw new IllegalArgumentException("pendingIntent or createCredentialResponse must be specified.");
        }
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int iQ = r8.q(dest, 20293);
        r8.k(dest, 1, this.f46834a, i10);
        r8.k(dest, 2, this.f46835b, i10);
        r8.r(dest, iQ);
    }
}
