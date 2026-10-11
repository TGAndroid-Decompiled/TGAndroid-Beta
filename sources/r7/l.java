package r7;

import android.app.PendingIntent;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import w7.d0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new m(0);
    public final int f47106a;
    public final IBinder f47107b;
    public final IBinder f47108c;
    public final PendingIntent d;
    public final String f47109e;
    public final String f47110f;

    public l(int i10, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str, String str2) {
        this.f47106a = i10;
        this.f47107b = iBinder;
        this.f47108c = iBinder2;
        this.d = pendingIntent;
        this.f47109e = Build.VERSION.SDK_INT >= 30 ? null : str;
        this.f47110f = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.s(parcel, 1, 4);
        parcel.writeInt(this.f47106a);
        d0.f(parcel, 2, this.f47107b);
        d0.f(parcel, 3, this.f47108c);
        d0.k(parcel, 4, this.d, i10);
        d0.l(parcel, 5, this.f47109e);
        d0.l(parcel, 6, this.f47110f);
        d0.r(parcel, q6);
    }
}
