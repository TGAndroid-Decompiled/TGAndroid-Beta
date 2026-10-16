package r7;

import android.app.PendingIntent;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new m(0);
    public final int f43716a;
    public final IBinder f43717b;
    public final IBinder f43718c;
    public final PendingIntent d;
    public final String e;
    public final String f43719f;

    public l(int i10, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str, String str2) {
        this.f43716a = i10;
        this.f43717b = iBinder;
        this.f43718c = iBinder2;
        this.d = pendingIntent;
        this.e = Build.VERSION.SDK_INT >= 30 ? null : str;
        this.f43719f = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 4);
        parcel.writeInt(this.f43716a);
        f0.f(parcel, 2, this.f43717b);
        f0.f(parcel, 3, this.f43718c);
        f0.k(parcel, 4, this.d, i10);
        f0.l(parcel, 5, this.e);
        f0.l(parcel, 6, this.f43719f);
        f0.r(parcel, q6);
    }
}
