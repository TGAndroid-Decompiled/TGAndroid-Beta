package ph;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import org.telegram.messenger.Utilities;
public final class o0 implements LocationListener {
    public final LocationManager f45925a;
    public final LocationListener[] f45926b;
    public final Utilities.Callback f45927c;
    public final q0 d;

    public o0(q0 q0Var, LocationManager locationManager, LocationListener[] locationListenerArr, Utilities.Callback callback) {
        this.d = q0Var;
        this.f45925a = locationManager;
        this.f45926b = locationListenerArr;
        this.f45927c = callback;
    }

    @Override
    public final void onLocationChanged(Location location) {
        this.f45925a.removeUpdates(this.f45926b[0]);
        this.d.getClass();
        this.f45927c.run(q0.h(location));
    }
}
