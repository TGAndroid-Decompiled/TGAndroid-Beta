package r6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class m extends z5.a {
    public static final Parcelable.Creator<m> CREATOR = new l(1);

    public final PendingIntent f46852a;

    public m(PendingIntent pendingIntent) {
        kotlin.jvm.internal.j.e(pendingIntent, "pendingIntent");
        this.f46852a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int iQ = r8.q(dest, 20293);
        r8.k(dest, 1, this.f46852a, i10);
        r8.r(dest, iQ);
    }
}
