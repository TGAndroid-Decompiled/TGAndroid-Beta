package r7;

import android.app.PendingIntent;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import w7.d0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new m(0);
    public final int f47014a;
    public final IBinder f47015b;
    public final IBinder f47016c;
    public final PendingIntent d;
    public final String f47017e;
    public final String f47018f;

    public l(int i10, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str, String str2) {
        this.f47014a = i10;
        this.f47015b = iBinder;
        this.f47016c = iBinder2;
        this.d = pendingIntent;
        this.f47017e = Build.VERSION.SDK_INT >= 30 ? null : str;
        this.f47018f = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.s(parcel, 1, 4);
        parcel.writeInt(this.f47014a);
        d0.f(parcel, 2, this.f47015b);
        d0.f(parcel, 3, this.f47016c);
        d0.k(parcel, 4, this.d, i10);
        d0.l(parcel, 5, this.f47017e);
        d0.l(parcel, 6, this.f47018f);
        d0.r(parcel, q6);
    }
}
