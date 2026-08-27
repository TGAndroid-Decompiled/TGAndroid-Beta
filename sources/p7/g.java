package p7;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import n6.w0;

public final class g extends z5.a {
    public static final Parcelable.Creator<g> CREATOR = new w0(13);

    public final PendingIntent f45514a;

    public g(PendingIntent pendingIntent) {
        this.f45514a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.k(parcel, 1, this.f45514a, i10);
        r8.r(parcel, iQ);
    }
}
