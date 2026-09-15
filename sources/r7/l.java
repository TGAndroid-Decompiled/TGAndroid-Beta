package r7;

import android.app.PendingIntent;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new m(0);
    public final int f42077a;
    public final IBinder f42078b;
    public final IBinder f42079c;
    public final PendingIntent d;
    public final String e;
    public final String f42080f;

    public l(int i10, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str, String str2) {
        this.f42077a = i10;
        this.f42078b = iBinder;
        this.f42079c = iBinder2;
        this.d = pendingIntent;
        this.e = Build.VERSION.SDK_INT >= 30 ? null : str;
        this.f42080f = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 1, 4);
        parcel.writeInt(this.f42077a);
        e0.f(parcel, 2, this.f42078b);
        e0.f(parcel, 3, this.f42079c);
        e0.k(parcel, 4, this.d, i10);
        e0.l(parcel, 5, this.e);
        e0.l(parcel, 6, this.f42080f);
        e0.r(parcel, q6);
    }
}
