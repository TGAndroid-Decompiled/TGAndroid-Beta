package s6;

import a8.df;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import q7.m;
public final class b extends p6.a {
    public static final Parcelable.Creator<b> CREATOR = new m(6);
    public final PendingIntent f47924a;

    public b(PendingIntent pendingIntent) {
        this.f47924a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.k(parcel, 1, this.f47924a, i10);
        df.r(parcel, q5);
    }
}
