package s7;

import a8.df;
import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
public final class o extends p6.a {
    public static final Parcelable.Creator<o> CREATOR = new m(2);
    public final int f47952a;
    public final n f47953b;
    public final h8.q f47954c;
    public final h8.n d;
    public final PendingIntent e;
    public final y f47955f;
    public final String h;

    public o(int i10, n nVar, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        h8.q qVar;
        h8.n nVar2;
        this.f47952a = i10;
        this.f47953b = nVar;
        y yVar = null;
        if (iBinder != null) {
            int i11 = h8.p.f12717b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            if (queryLocalInterface instanceof h8.q) {
                qVar = (h8.q) queryLocalInterface;
            } else {
                qVar = new a8.a(iBinder, "com.google.android.gms.location.ILocationListener", 9);
            }
        } else {
            qVar = null;
        }
        this.f47954c = qVar;
        this.e = pendingIntent;
        if (iBinder2 != null) {
            int i12 = i.f47939c;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            if (queryLocalInterface2 instanceof h8.n) {
                nVar2 = (h8.n) queryLocalInterface2;
            } else {
                nVar2 = new a8.a(iBinder2, "com.google.android.gms.location.ILocationCallback", 9);
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
                yVar = new a8.a(iBinder3, "com.google.android.gms.location.internal.IFusedLocationProviderCallback", 9);
            }
        }
        this.f47955f = yVar;
        this.h = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        IBinder asBinder;
        IBinder asBinder2;
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.f47952a);
        df.k(parcel, 2, this.f47953b, i10);
        IBinder iBinder = null;
        h8.q qVar = this.f47954c;
        if (qVar == null) {
            asBinder = null;
        } else {
            asBinder = qVar.asBinder();
        }
        df.f(parcel, 3, asBinder);
        df.k(parcel, 4, this.e, i10);
        h8.n nVar = this.d;
        if (nVar == null) {
            asBinder2 = null;
        } else {
            asBinder2 = nVar.asBinder();
        }
        df.f(parcel, 5, asBinder2);
        y yVar = this.f47955f;
        if (yVar != null) {
            iBinder = yVar.asBinder();
        }
        df.f(parcel, 6, iBinder);
        df.l(parcel, 8, this.h);
        df.r(parcel, q5);
    }
}
