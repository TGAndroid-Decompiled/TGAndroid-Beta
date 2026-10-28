package y5;

import a8.df;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import o6.l;
import w8.s;
public final class f extends p6.a {
    public static final Parcelable.Creator<f> CREATOR = new s(24);
    public final PendingIntent f52115a;

    public f(PendingIntent pendingIntent) {
        l.h(pendingIntent);
        this.f52115a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.k(parcel, 1, this.f52115a, i10);
        df.r(parcel, q5);
    }
}
