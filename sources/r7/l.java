package r7;

import android.app.PendingIntent;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import w7.c0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new m(0);
    public final int f47238a;
    public final IBinder f47239b;
    public final IBinder f47240c;
    public final PendingIntent d;
    public final String f47241e;
    public final String f47242f;

    public l(int i10, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str, String str2) {
        this.f47238a = i10;
        this.f47239b = iBinder;
        this.f47240c = iBinder2;
        this.d = pendingIntent;
        this.f47241e = Build.VERSION.SDK_INT >= 30 ? null : str;
        this.f47242f = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.s(parcel, 1, 4);
        parcel.writeInt(this.f47238a);
        c0.f(parcel, 2, this.f47239b);
        c0.f(parcel, 3, this.f47240c);
        c0.k(parcel, 4, this.d, i10);
        c0.l(parcel, 5, this.f47241e);
        c0.l(parcel, 6, this.f47242f);
        c0.r(parcel, q6);
    }
}
