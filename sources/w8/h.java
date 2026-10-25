package w8;

import a8.df;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
public final class h extends p6.a {
    public static final Parcelable.Creator<h> CREATOR = new s(13);
    public PendingIntent f51097a;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.k(parcel, 1, this.f51097a, i10);
        df.r(parcel, q5);
    }
}
