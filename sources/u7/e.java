package u7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class e extends com.google.android.gms.internal.cast.a {
    public final a U0() {
        a aVar;
        Parcel L0 = L0(M0(), 4);
        IBinder readStrongBinder = L0.readStrongBinder();
        if (readStrongBinder == null) {
            aVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (queryLocalInterface instanceof a) {
                aVar = (a) queryLocalInterface;
            } else {
                aVar = new com.google.android.gms.internal.cast.a(readStrongBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate", 4);
            }
        }
        L0.recycle();
        return aVar;
    }

    public final g V0(j6.b bVar) {
        g aVar;
        Parcel M0 = M0();
        e7.b.c(M0, bVar);
        M0.writeInt(0);
        Parcel L0 = L0(M0, 3);
        IBinder readStrongBinder = L0.readStrongBinder();
        if (readStrongBinder == null) {
            aVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            if (queryLocalInterface instanceof g) {
                aVar = (g) queryLocalInterface;
            } else {
                aVar = new com.google.android.gms.internal.cast.a(readStrongBinder, "com.google.android.gms.maps.internal.IMapViewDelegate", 4);
            }
        }
        L0.recycle();
        return aVar;
    }

    public final e7.e W0() {
        e7.e aVar;
        Parcel L0 = L0(M0(), 5);
        IBinder readStrongBinder = L0.readStrongBinder();
        int i10 = e7.d.f5837b;
        if (readStrongBinder == null) {
            aVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            if (queryLocalInterface instanceof e7.e) {
                aVar = (e7.e) queryLocalInterface;
            } else {
                aVar = new com.google.android.gms.internal.cast.a(readStrongBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate", 4);
            }
        }
        L0.recycle();
        return aVar;
    }
}
