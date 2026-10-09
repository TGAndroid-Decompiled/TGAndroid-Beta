package r7;

import android.app.PendingIntent;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import w7.d0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new m(0);
    public final int f47016a;
    public final IBinder f47017b;
    public final IBinder f47018c;
    public final PendingIntent d;
    public final String f47019e;
    public final String f47020f;

    public l(int i10, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str, String str2) {
        this.f47016a = i10;
        this.f47017b = iBinder;
        this.f47018c = iBinder2;
        this.d = pendingIntent;
        this.f47019e = Build.VERSION.SDK_INT >= 30 ? null : str;
        this.f47020f = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.s(parcel, 1, 4);
        parcel.writeInt(this.f47016a);
        d0.f(parcel, 2, this.f47017b);
        d0.f(parcel, 3, this.f47018c);
        d0.k(parcel, 4, this.d, i10);
        d0.l(parcel, 5, this.f47019e);
        d0.l(parcel, 6, this.f47020f);
        d0.r(parcel, q6);
    }
}
