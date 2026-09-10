package r7;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class o extends o6.a {
    public static final Parcelable.Creator<o> CREATOR = new m(2);
    public final int f41300a;
    public final n f41301b;
    public final g8.q f41302c;
    public final g8.n d;
    public final PendingIntent e;
    public final y f41303f;
    public final String h;

    public o(int i10, n nVar, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        g8.q qVar;
        g8.n nVar2;
        this.f41300a = i10;
        this.f41301b = nVar;
        y yVar = null;
        if (iBinder != null) {
            int i11 = g8.p.f8655b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            if (queryLocalInterface instanceof g8.q) {
                qVar = (g8.q) queryLocalInterface;
            } else {
                qVar = new a9.a(iBinder, "com.google.android.gms.location.ILocationListener", 8);
            }
        } else {
            qVar = null;
        }
        this.f41302c = qVar;
        this.e = pendingIntent;
        if (iBinder2 != null) {
            int i12 = i.f41287c;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            if (queryLocalInterface2 instanceof g8.n) {
                nVar2 = (g8.n) queryLocalInterface2;
            } else {
                nVar2 = new a9.a(iBinder2, "com.google.android.gms.location.ILocationCallback", 8);
            }
        } else {
            nVar2 = null;
        }
        this.d = nVar2;
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface3 instanceof y) {
                yVar = (y) queryLocalInterface3;
            } else {
                yVar = new a9.a(iBinder3, "com.google.android.gms.location.internal.IFusedLocationProviderCallback", 8);
            }
        }
        this.f41303f = yVar;
        this.h = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        IBinder asBinder;
        IBinder asBinder2;
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 1, 4);
        parcel.writeInt(this.f41300a);
        e0.k(parcel, 2, this.f41301b, i10);
        IBinder iBinder = null;
        g8.q qVar = this.f41302c;
        if (qVar == null) {
            asBinder = null;
        } else {
            asBinder = qVar.asBinder();
        }
        e0.f(parcel, 3, asBinder);
        e0.k(parcel, 4, this.e, i10);
        g8.n nVar = this.d;
        if (nVar == null) {
            asBinder2 = null;
        } else {
            asBinder2 = nVar.asBinder();
        }
        e0.f(parcel, 5, asBinder2);
        y yVar = this.f41303f;
        if (yVar != null) {
            iBinder = yVar.asBinder();
        }
        e0.f(parcel, 6, iBinder);
        e0.l(parcel, 8, this.h);
        e0.r(parcel, q6);
    }
}
