package sh;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import org.telegram.messenger.Utilities;
public final class o0 implements LocationListener {
    public final LocationManager f47586a;
    public final LocationListener[] f47587b;
    public final Utilities.Callback f47588c;
    public final q0 d;

    public o0(q0 q0Var, LocationManager locationManager, LocationListener[] locationListenerArr, Utilities.Callback callback) {
        this.d = q0Var;
        this.f47586a = locationManager;
        this.f47587b = locationListenerArr;
        this.f47588c = callback;
    }

    @Override
    public final void onLocationChanged(Location location) {
        this.f47586a.removeUpdates(this.f47587b[0]);
        this.d.getClass();
        this.f47588c.run(q0.h(location));
    }
}
