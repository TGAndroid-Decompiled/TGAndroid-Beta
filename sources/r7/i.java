package r7;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import org.telegram.messenger.GoogleMapsProvider;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.f4;
import org.telegram.messenger.g4;
import org.telegram.messenger.h4;
public final class i extends a7.a {
    public final int f47090b = 0;
    public final Object f47091c;

    public i(org.telegram.messenger.c cVar) {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener", 2);
        this.f47091c = cVar;
    }

    @Override
    public final boolean H0(int i9, Parcel parcel, Parcel parcel2) {
        c7.a aVar;
        boolean lambda$setOnMarkerClickListener$1;
        s7.f aVar2;
        switch (this.f47090b) {
            case 0:
                if (i9 == 1) {
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder == null) {
                        aVar = 0;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                        if (queryLocalInterface instanceof c7.a) {
                            aVar = (c7.a) queryLocalInterface;
                        } else {
                            aVar = new b7.a(readStrongBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate", 1);
                        }
                    }
                    c7.b.a(parcel);
                    org.telegram.messenger.c cVar = (org.telegram.messenger.c) this.f47091c;
                    lambda$setOnMarkerClickListener$1 = ((GoogleMapsProvider.GoogleMapImpl) cVar.f19898b).lambda$setOnMarkerClickListener$1((IMapsProvider.OnMarkerClickListener) cVar.f19899c, new t7.f(aVar));
                    parcel2.writeNoException();
                    parcel2.writeInt(lambda$setOnMarkerClickListener$1 ? 1 : 0);
                    return true;
                }
                return false;
            case 1:
                b bVar = (b) this.f47091c;
                if (i9 != 1) {
                    if (i9 != 2) {
                        return false;
                    }
                    bVar.onCancel();
                } else {
                    bVar.onFinish();
                }
                parcel2.writeNoException();
                return true;
            case 2:
                if (i9 == 1) {
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 == null) {
                        aVar2 = 0;
                    } else {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                        if (queryLocalInterface2 instanceof s7.f) {
                            aVar2 = (s7.f) queryLocalInterface2;
                        } else {
                            aVar2 = new b7.a(readStrongBinder2, "com.google.android.gms.maps.internal.IGoogleMapDelegate", 1);
                        }
                    }
                    c7.b.a(parcel);
                    c cVar2 = new c(aVar2);
                    h4 h4Var = (h4) ((f) this.f47091c);
                    h4Var.f20453a.lambda$getMapAsync$0(h4Var.f20454b, cVar2);
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            case 3:
                if (i9 == 1) {
                    h6.a J0 = h6.b.J0(parcel.readStrongBinder());
                    c7.b.a(parcel);
                    ((f4) this.f47091c).f20243b.accept((Location) h6.b.K0(J0));
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            case 4:
                if (i9 == 1) {
                    ((g4) this.f47091c).f20355a.run();
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            case 5:
                if (i9 == 1) {
                    int readInt = parcel.readInt();
                    c7.b.a(parcel);
                    GoogleMapsProvider.GoogleMapImpl.lambda$setOnCameraMoveStartedListener$0((IMapsProvider.OnCameraMoveStartedListener) ((org.telegram.messenger.d) this.f47091c).f20037b, readInt);
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            case 6:
                if (i9 == 1) {
                    ((g4) this.f47091c).f20355a.run();
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            default:
                if (i9 == 1) {
                    ((g4) this.f47091c).f20355a.run();
                    parcel2.writeNoException();
                    return true;
                }
                return false;
        }
    }

    public i(org.telegram.messenger.d dVar) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener", 2);
        this.f47091c = dVar;
    }

    public i(f4 f4Var) {
        super("com.google.android.gms.maps.internal.IOnMyLocationChangeListener", 2);
        this.f47091c = f4Var;
    }

    public i(g4 g4Var) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveListener", 2);
        this.f47091c = g4Var;
    }

    public i(g4 g4Var, byte b10) {
        super("com.google.android.gms.maps.internal.IOnMapLoadedCallback", 2);
        this.f47091c = g4Var;
    }

    public i(g4 g4Var, char c10) {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener", 2);
        this.f47091c = g4Var;
    }

    public i(b bVar) {
        super("com.google.android.gms.maps.internal.ICancelableCallback", 2);
        this.f47091c = bVar;
    }

    public i(f fVar) {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback", 2);
        this.f47091c = fVar;
    }
}
