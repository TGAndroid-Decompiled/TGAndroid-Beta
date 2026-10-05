package r7;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;
public final class o extends o6.a {
    public static final Parcelable.Creator<o> CREATOR = new m(2);
    public final int f45871a;
    public final n f45872b;
    public final g8.q f45873c;
    public final g8.n d;
    public final PendingIntent f45874e;
    public final y f45875f;
    public final String h;

    public o(int i10, n nVar, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        g8.q qVar;
        g8.n nVar2;
        this.f45871a = i10;
        this.f45872b = nVar;
        y yVar = null;
        if (iBinder != null) {
            int i11 = g8.p.f10355b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            if (queryLocalInterface instanceof g8.q) {
                qVar = (g8.q) queryLocalInterface;
            } else {
                qVar = new a9.a(iBinder, "com.google.android.gms.location.ILocationListener", 8);
            }
        } else {
            qVar = null;
        }
        this.f45873c = qVar;
        this.f45874e = pendingIntent;
        if (iBinder2 != null) {
            int i12 = i.f45856c;
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
        this.f45875f = yVar;
        this.h = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        IBinder asBinder;
        IBinder asBinder2;
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 1, 4);
        parcel.writeInt(this.f45871a);
        g0.k(parcel, 2, this.f45872b, i10);
        IBinder iBinder = null;
        g8.q qVar = this.f45873c;
        if (qVar == null) {
            asBinder = null;
        } else {
            asBinder = qVar.asBinder();
        }
        g0.f(parcel, 3, asBinder);
        g0.k(parcel, 4, this.f45874e, i10);
        g8.n nVar = this.d;
        if (nVar == null) {
            asBinder2 = null;
        } else {
            asBinder2 = nVar.asBinder();
        }
        g0.f(parcel, 5, asBinder2);
        y yVar = this.f45875f;
        if (yVar != null) {
            iBinder = yVar.asBinder();
        }
        g0.f(parcel, 6, iBinder);
        g0.l(parcel, 8, this.h);
        g0.r(parcel, q6);
    }
}
