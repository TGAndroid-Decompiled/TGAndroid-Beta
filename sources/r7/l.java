package r7;

import android.app.PendingIntent;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import w7.c0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new m(0);
    public final int f47230a;
    public final IBinder f47231b;
    public final IBinder f47232c;
    public final PendingIntent d;
    public final String f47233e;
    public final String f47234f;

    public l(int i10, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str, String str2) {
        this.f47230a = i10;
        this.f47231b = iBinder;
        this.f47232c = iBinder2;
        this.d = pendingIntent;
        this.f47233e = Build.VERSION.SDK_INT >= 30 ? null : str;
        this.f47234f = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.s(parcel, 1, 4);
        parcel.writeInt(this.f47230a);
        c0.f(parcel, 2, this.f47231b);
        c0.f(parcel, 3, this.f47232c);
        c0.k(parcel, 4, this.d, i10);
        c0.l(parcel, 5, this.f47233e);
        c0.l(parcel, 6, this.f47234f);
        c0.r(parcel, q6);
    }
}
