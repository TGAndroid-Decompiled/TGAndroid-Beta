package r6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class n extends z5.a {
    public static final Parcelable.Creator<n> CREATOR = new l(2);

    public final PendingIntent f46853a;

    public n(PendingIntent pendingIntent) {
        kotlin.jvm.internal.j.e(pendingIntent, "pendingIntent");
        this.f46853a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int iQ = r8.q(dest, 20293);
        r8.k(dest, 1, this.f46853a, i10);
        r8.r(dest, iQ);
    }
}
