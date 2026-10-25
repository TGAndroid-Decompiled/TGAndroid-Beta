package s7;

import a8.df;
import android.app.PendingIntent;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
public final class l extends p6.a {
    public static final Parcelable.Creator<l> CREATOR = new m(0);
    public final int f47908a;
    public final IBinder f47909b;
    public final IBinder f47910c;
    public final PendingIntent d;
    public final String e;
    public final String f47911f;

    public l(int i10, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str, String str2) {
        this.f47908a = i10;
        this.f47909b = iBinder;
        this.f47910c = iBinder2;
        this.d = pendingIntent;
        this.e = Build.VERSION.SDK_INT >= 30 ? null : str;
        this.f47911f = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.f47908a);
        df.f(parcel, 2, this.f47909b);
        df.f(parcel, 3, this.f47910c);
        df.k(parcel, 4, this.d, i10);
        df.l(parcel, 5, this.e);
        df.l(parcel, 6, this.f47911f);
        df.r(parcel, q5);
    }
}
