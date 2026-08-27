package t7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class e extends c7.a {
    public final a U0() {
        a aVar;
        Parcel parcelL0 = L0(M0(), 4);
        IBinder strongBinder = parcelL0.readStrongBinder();
        if (strongBinder == null) {
            aVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            aVar = iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new a(strongBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate", 4);
        }
        parcelL0.recycle();
        return aVar;
    }

    public final g V0(i6.b bVar) {
        g gVar;
        Parcel parcelM0 = M0();
        d7.b.c(parcelM0, bVar);
        parcelM0.writeInt(0);
        Parcel parcelL0 = L0(parcelM0, 3);
        IBinder strongBinder = parcelL0.readStrongBinder();
        if (strongBinder == null) {
            gVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            gVar = iInterfaceQueryLocalInterface instanceof g ? (g) iInterfaceQueryLocalInterface : new g(strongBinder, "com.google.android.gms.maps.internal.IMapViewDelegate", 4);
        }
        parcelL0.recycle();
        return gVar;
    }

    public final d7.e W0() {
        d7.e cVar;
        Parcel parcelL0 = L0(M0(), 5);
        IBinder strongBinder = parcelL0.readStrongBinder();
        int i10 = d7.d.f4869b;
        if (strongBinder == null) {
            cVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            cVar = iInterfaceQueryLocalInterface instanceof d7.e ? (d7.e) iInterfaceQueryLocalInterface : new d7.c(strongBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate", 4);
        }
        parcelL0.recycle();
        return cVar;
    }
}
