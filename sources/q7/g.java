package q7;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
import o6.w0;
public final class g extends a6.a {
    public static final Parcelable.Creator<g> CREATOR = new w0(17);
    public final PendingIntent f46421a;

    public g(PendingIntent pendingIntent) {
        this.f46421a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.k(parcel, 1, this.f46421a, i10);
        o.r(parcel, q6);
    }
}
