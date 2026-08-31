package sh;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import org.telegram.messenger.Utilities;
public final class o0 implements LocationListener {
    public final LocationManager f47550a;
    public final LocationListener[] f47551b;
    public final Utilities.Callback f47552c;
    public final q0 d;

    public o0(q0 q0Var, LocationManager locationManager, LocationListener[] locationListenerArr, Utilities.Callback callback) {
        this.d = q0Var;
        this.f47550a = locationManager;
        this.f47551b = locationListenerArr;
        this.f47552c = callback;
    }

    @Override
    public final void onLocationChanged(Location location) {
        this.f47550a.removeUpdates(this.f47551b[0]);
        this.d.getClass();
        this.f47552c.run(q0.h(location));
    }
}
