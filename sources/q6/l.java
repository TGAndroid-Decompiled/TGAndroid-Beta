package q6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class l extends y5.a {
    public static final Parcelable.Creator<l> CREATOR = new o5.p(23);
    public final PendingIntent f46092a;

    public l(PendingIntent pendingIntent) {
        kotlin.jvm.internal.i.e(pendingIntent, "pendingIntent");
        this.f46092a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i9) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q10 = p8.q(dest, 20293);
        p8.k(dest, 1, this.f46092a, i9);
        p8.r(dest, q10);
    }
}
