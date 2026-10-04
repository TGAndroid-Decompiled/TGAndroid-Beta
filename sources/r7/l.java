package r7;

import android.app.PendingIntent;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new m(0);
    public final int f45857a;
    public final IBinder f45858b;
    public final IBinder f45859c;
    public final PendingIntent d;
    public final String f45860e;
    public final String f45861f;

    public l(int i10, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str, String str2) {
        this.f45857a = i10;
        this.f45858b = iBinder;
        this.f45859c = iBinder2;
        this.d = pendingIntent;
        this.f45860e = Build.VERSION.SDK_INT >= 30 ? null : str;
        this.f45861f = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 1, 4);
        parcel.writeInt(this.f45857a);
        g0.f(parcel, 2, this.f45858b);
        g0.f(parcel, 3, this.f45859c);
        g0.k(parcel, 4, this.d, i10);
        g0.l(parcel, 5, this.f45860e);
        g0.l(parcel, 6, this.f45861f);
        g0.r(parcel, q6);
    }
}
