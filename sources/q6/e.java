package q6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class e extends y5.a {
    public static final Parcelable.Creator<e> CREATOR = new o5.p(15);
    public final PendingIntent f46075a;
    public final g f46076b;

    public e(PendingIntent pendingIntent, g gVar) {
        this.f46075a = pendingIntent;
        this.f46076b = gVar;
        if (pendingIntent == null && gVar == null) {
            throw new IllegalArgumentException("pendingIntent or createCredentialResponse must be specified.");
        }
    }

    @Override
    public final void writeToParcel(Parcel dest, int i9) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q10 = p8.q(dest, 20293);
        p8.k(dest, 1, this.f46075a, i9);
        p8.k(dest, 2, this.f46076b, i9);
        p8.r(dest, q10);
    }
}
