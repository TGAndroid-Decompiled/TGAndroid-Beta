package v7;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import org.telegram.messenger.GoogleMapsProvider;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.d0;
import org.telegram.messenger.i4;
import org.telegram.messenger.j4;
import org.telegram.messenger.k4;
public final class i extends a7.c {
    public final int f45693b = 0;
    public final Object f45694c;

    public i(org.telegram.messenger.c cVar) {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener", 6);
        this.f45694c = cVar;
    }

    @Override
    public final boolean H0(int i10, Parcel parcel, Parcel parcel2) {
        g7.a aVar;
        boolean lambda$setOnMarkerClickListener$1;
        w7.f aVar2;
        switch (this.f45693b) {
            case 0:
                if (i10 == 1) {
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder == null) {
                        aVar = 0;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                        if (queryLocalInterface instanceof g7.a) {
                            aVar = (g7.a) queryLocalInterface;
                        } else {
                            aVar = new a7.a(readStrongBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate", 5);
                        }
                    }
                    g7.b.a(parcel);
                    org.telegram.messenger.c cVar = (org.telegram.messenger.c) this.f45694c;
                    lambda$setOnMarkerClickListener$1 = ((GoogleMapsProvider.GoogleMapImpl) cVar.f16876b).lambda$setOnMarkerClickListener$1((IMapsProvider.OnMarkerClickListener) cVar.f16877c, new x7.g(aVar));
                    parcel2.writeNoException();
                    parcel2.writeInt(lambda$setOnMarkerClickListener$1 ? 1 : 0);
                    return true;
                }
                return false;
            case 1:
                b bVar = (b) this.f45694c;
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
                        if (queryLocalInterface2 instanceof w7.f) {
                            aVar2 = (w7.f) queryLocalInterface2;
                        } else {
                            aVar2 = new a7.a(readStrongBinder2, "com.google.android.gms.maps.internal.IGoogleMapDelegate", 5);
                        }
                    }
                    g7.b.a(parcel);
                    c cVar2 = new c(aVar2);
                    k4 k4Var = (k4) ((f) this.f45694c);
                    k4Var.f17607a.lambda$getMapAsync$0(k4Var.f17608b, cVar2);
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            case 3:
                if (i10 == 1) {
                    l6.a J0 = l6.b.J0(parcel.readStrongBinder());
                    g7.b.a(parcel);
                    ((i4) this.f45694c).f17431b.accept((Location) l6.b.K0(J0));
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            case 4:
                if (i10 == 1) {
                    ((j4) this.f45694c).f17525a.run();
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            case 5:
                if (i10 == 1) {
                    int readInt = parcel.readInt();
                    g7.b.a(parcel);
                    GoogleMapsProvider.GoogleMapImpl.lambda$setOnCameraMoveStartedListener$0((IMapsProvider.OnCameraMoveStartedListener) ((d0) this.f45694c).f16997b, readInt);
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            case 6:
                if (i10 == 1) {
                    ((j4) this.f45694c).f17525a.run();
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            default:
                if (i10 == 1) {
                    ((j4) this.f45694c).f17525a.run();
                    parcel2.writeNoException();
                    return true;
                }
                return false;
        }
    }

    public i(d0 d0Var) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener", 6);
        this.f45694c = d0Var;
    }

    public i(i4 i4Var) {
        super("com.google.android.gms.maps.internal.IOnMyLocationChangeListener", 6);
        this.f45694c = i4Var;
    }

    public i(j4 j4Var) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveListener", 6);
        this.f45694c = j4Var;
    }

    public i(j4 j4Var, byte b10) {
        super("com.google.android.gms.maps.internal.IOnMapLoadedCallback", 6);
        this.f45694c = j4Var;
    }

    public i(j4 j4Var, char c3) {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener", 6);
        this.f45694c = j4Var;
    }

    public i(b bVar) {
        super("com.google.android.gms.maps.internal.ICancelableCallback", 6);
        this.f45694c = bVar;
    }

    public i(f fVar) {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback", 6);
        this.f45694c = fVar;
    }
}
