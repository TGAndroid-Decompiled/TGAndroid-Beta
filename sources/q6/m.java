package q6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class m extends y5.a {
    public static final Parcelable.Creator<m> CREATOR = new o5.p(24);
    public final PendingIntent f46093a;

    public m(PendingIntent pendingIntent) {
        kotlin.jvm.internal.i.e(pendingIntent, "pendingIntent");
        this.f46093a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i9) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q10 = p8.q(dest, 20293);
        p8.k(dest, 1, this.f46093a, i9);
        p8.r(dest, q10);
    }
}
