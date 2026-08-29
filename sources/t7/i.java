package t7;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import org.telegram.messenger.GoogleMapsProvider;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.h4;
import org.telegram.messenger.i4;
import org.telegram.messenger.j4;
public final class i extends c7.a {
    public final int f48173b = 0;
    public final Object f48174c;

    public i(org.telegram.messenger.c cVar) {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener", 5);
        this.f48174c = cVar;
    }

    @Override
    public final boolean H0(int i10, Parcel parcel, Parcel parcel2) {
        e7.a aVar;
        boolean lambda$setOnMarkerClickListener$1;
        u7.f aVar2;
        switch (this.f48173b) {
            case 0:
                if (i10 == 1) {
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder == null) {
                        aVar = 0;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                        if (queryLocalInterface instanceof e7.a) {
                            aVar = (e7.a) queryLocalInterface;
                        } else {
                            aVar = new com.google.android.gms.internal.cast.a(readStrongBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate", 4);
                        }
                    }
                    e7.b.a(parcel);
                    org.telegram.messenger.c cVar = (org.telegram.messenger.c) this.f48174c;
                    lambda$setOnMarkerClickListener$1 = ((GoogleMapsProvider.GoogleMapImpl) cVar.f19849b).lambda$setOnMarkerClickListener$1((IMapsProvider.OnMarkerClickListener) cVar.f19850c, new v7.f(aVar));
                    parcel2.writeNoException();
                    parcel2.writeInt(lambda$setOnMarkerClickListener$1 ? 1 : 0);
                    return true;
                }
                return false;
            case 1:
                b bVar = (b) this.f48174c;
                if (i10 != 1) {
                    if (i10 != 2) {
                        return false;
                    }
                    bVar.onCancel();
                } else {
                    bVar.onFinish();
                }
                parcel2.writeNoException();
                return true;
            case 2:
                if (i10 == 1) {
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 == null) {
                        aVar2 = 0;
                    } else {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                        if (queryLocalInterface2 instanceof u7.f) {
                            aVar2 = (u7.f) queryLocalInterface2;
                        } else {
                            aVar2 = new com.google.android.gms.internal.cast.a(readStrongBinder2, "com.google.android.gms.maps.internal.IGoogleMapDelegate", 4);
                        }
                    }
                    e7.b.a(parcel);
                    c cVar2 = new c(aVar2);
                    j4 j4Var = (j4) ((f) this.f48174c);
                    j4Var.f20630a.lambda$getMapAsync$0(j4Var.f20631b, cVar2);
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            case 3:
                if (i10 == 1) {
                    j6.a J0 = j6.b.J0(parcel.readStrongBinder());
                    e7.b.a(parcel);
                    ((h4) this.f48174c).f20409b.accept((Location) j6.b.K0(J0));
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            case 4:
                if (i10 == 1) {
                    ((i4) this.f48174c).f20519a.run();
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            case 5:
                if (i10 == 1) {
                    int readInt = parcel.readInt();
                    e7.b.a(parcel);
                    GoogleMapsProvider.GoogleMapImpl.lambda$setOnCameraMoveStartedListener$0((IMapsProvider.OnCameraMoveStartedListener) ((org.telegram.messenger.d) this.f48174c).f19986b, readInt);
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            case 6:
                if (i10 == 1) {
                    ((i4) this.f48174c).f20519a.run();
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            default:
                if (i10 == 1) {
                    ((i4) this.f48174c).f20519a.run();
                    parcel2.writeNoException();
                    return true;
                }
                return false;
        }
    }

    public i(org.telegram.messenger.d dVar) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener", 5);
        this.f48174c = dVar;
    }

    public i(h4 h4Var) {
        super("com.google.android.gms.maps.internal.IOnMyLocationChangeListener", 5);
        this.f48174c = h4Var;
    }

    public i(i4 i4Var) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveListener", 5);
        this.f48174c = i4Var;
    }

    public i(i4 i4Var, byte b10) {
        super("com.google.android.gms.maps.internal.IOnMapLoadedCallback", 5);
        this.f48174c = i4Var;
    }

    public i(i4 i4Var, char c3) {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener", 5);
        this.f48174c = i4Var;
    }

    public i(b bVar) {
        super("com.google.android.gms.maps.internal.ICancelableCallback", 5);
        this.f48174c = bVar;
    }

    public i(f fVar) {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback", 5);
        this.f48174c = fVar;
    }
}
