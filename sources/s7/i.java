package s7;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import org.telegram.messenger.GoogleMapsProvider;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.h4;
import org.telegram.messenger.i4;
import org.telegram.messenger.j4;

public final class i extends b7.a {

    public final int f47810b = 0;

    public final Object f47811c;

    public i(org.telegram.messenger.c cVar) {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener", 5);
        this.f47811c = cVar;
    }

    @Override
    public final boolean H0(int i10, Parcel parcel, Parcel parcel2) {
        d7.a iVar;
        t7.f fVar;
        switch (this.f47810b) {
            case 0:
                if (i10 != 1) {
                    return false;
                }
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    iVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    iVar = iInterfaceQueryLocalInterface instanceof d7.a ? (d7.a) iInterfaceQueryLocalInterface : new d7.i(strongBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate", 4);
                }
                d7.b.a(parcel);
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) this.f47811c;
                boolean zLambda$setOnMarkerClickListener$1 = ((GoogleMapsProvider.GoogleMapImpl) cVar.f19862b).lambda$setOnMarkerClickListener$1((IMapsProvider.OnMarkerClickListener) cVar.f19863c, new u7.f(iVar));
                parcel2.writeNoException();
                parcel2.writeInt(zLambda$setOnMarkerClickListener$1 ? 1 : 0);
                return true;
            case 1:
                b bVar = (b) this.f47811c;
                if (i10 == 1) {
                    bVar.onFinish();
                } else {
                    if (i10 != 2) {
                        return false;
                    }
                    bVar.onCancel();
                }
                parcel2.writeNoException();
                return true;
            case 2:
                if (i10 != 1) {
                    return false;
                }
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 == null) {
                    fVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    fVar = iInterfaceQueryLocalInterface2 instanceof t7.f ? (t7.f) iInterfaceQueryLocalInterface2 : new t7.f(strongBinder2, "com.google.android.gms.maps.internal.IGoogleMapDelegate", 4);
                }
                d7.b.a(parcel);
                j4 j4Var = (j4) ((f) this.f47811c);
                j4Var.f20635a.lambda$getMapAsync$0(j4Var.f20636b, new c(fVar));
                parcel2.writeNoException();
                return true;
            case 3:
                if (i10 != 1) {
                    return false;
                }
                i6.a aVarJ0 = i6.b.J0(parcel.readStrongBinder());
                d7.b.a(parcel);
                ((h4) this.f47811c).f20445b.accept((Location) i6.b.K0(aVarJ0));
                parcel2.writeNoException();
                return true;
            case 4:
                if (i10 != 1) {
                    return false;
                }
                ((i4) this.f47811c).f20550a.run();
                parcel2.writeNoException();
                return true;
            case 5:
                if (i10 != 1) {
                    return false;
                }
                int i11 = parcel.readInt();
                d7.b.a(parcel);
                GoogleMapsProvider.GoogleMapImpl.lambda$setOnCameraMoveStartedListener$0((IMapsProvider.OnCameraMoveStartedListener) ((org.telegram.messenger.d) this.f47811c).f20003b, i11);
                parcel2.writeNoException();
                return true;
            case 6:
                if (i10 != 1) {
                    return false;
                }
                ((i4) this.f47811c).f20550a.run();
                parcel2.writeNoException();
                return true;
            default:
                if (i10 != 1) {
                    return false;
                }
                ((i4) this.f47811c).f20550a.run();
                parcel2.writeNoException();
                return true;
        }
    }

    public i(org.telegram.messenger.d dVar) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener", 5);
        this.f47811c = dVar;
    }

    public i(h4 h4Var) {
        super("com.google.android.gms.maps.internal.IOnMyLocationChangeListener", 5);
        this.f47811c = h4Var;
    }

    public i(i4 i4Var) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveListener", 5);
        this.f47811c = i4Var;
    }

    public i(i4 i4Var, byte b10) {
        super("com.google.android.gms.maps.internal.IOnMapLoadedCallback", 5);
        this.f47811c = i4Var;
    }

    public i(i4 i4Var, char c10) {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener", 5);
        this.f47811c = i4Var;
    }

    public i(b bVar) {
        super("com.google.android.gms.maps.internal.ICancelableCallback", 5);
        this.f47811c = bVar;
    }

    public i(f fVar) {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback", 5);
        this.f47811c = fVar;
    }
}
