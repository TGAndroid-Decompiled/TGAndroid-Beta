package w7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class e extends a7.a {
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
                aVar = new a7.a(readStrongBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate", 5);
            }
        }
        L0.recycle();
        return aVar;
    }

    public final g V0(l6.b bVar) {
        g aVar;
        Parcel M0 = M0();
        g7.b.c(M0, bVar);
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
                aVar = new a7.a(readStrongBinder, "com.google.android.gms.maps.internal.IMapViewDelegate", 5);
            }
        }
        L0.recycle();
        return aVar;
    }

    public final g7.e W0() {
        g7.e aVar;
        Parcel L0 = L0(M0(), 5);
        IBinder readStrongBinder = L0.readStrongBinder();
        int i10 = g7.d.f6977b;
        if (readStrongBinder == null) {
            aVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            if (queryLocalInterface instanceof g7.e) {
                aVar = (g7.e) queryLocalInterface;
            } else {
                aVar = new a7.a(readStrongBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate", 5);
            }
        }
        L0.recycle();
        return aVar;
    }
}
