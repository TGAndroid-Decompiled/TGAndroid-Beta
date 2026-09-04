package r7;

import android.app.PendingIntent;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new m(0);
    public final int f44949a;
    public final IBinder f44950b;
    public final IBinder f44951c;
    public final PendingIntent d;
    public final String f44952e;
    public final String f44953f;

    public l(int i10, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str, String str2) {
        this.f44949a = i10;
        this.f44950b = iBinder;
        this.f44951c = iBinder2;
        this.d = pendingIntent;
        this.f44952e = Build.VERSION.SDK_INT >= 30 ? null : str;
        this.f44953f = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 1, 4);
        parcel.writeInt(this.f44949a);
        e0.f(parcel, 2, this.f44950b);
        e0.f(parcel, 3, this.f44951c);
        e0.k(parcel, 4, this.d, i10);
        e0.l(parcel, 5, this.f44952e);
        e0.l(parcel, 6, this.f44953f);
        e0.r(parcel, q6);
    }
}
