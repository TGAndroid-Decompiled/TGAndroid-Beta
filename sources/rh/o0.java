package rh;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import org.telegram.messenger.Utilities;
public final class o0 implements LocationListener {
    public final LocationManager f43701a;
    public final LocationListener[] f43702b;
    public final Utilities.Callback f43703c;
    public final q0 d;

    public o0(q0 q0Var, LocationManager locationManager, LocationListener[] locationListenerArr, Utilities.Callback callback) {
        this.d = q0Var;
        this.f43701a = locationManager;
        this.f43702b = locationListenerArr;
        this.f43703c = callback;
    }

    @Override
    public final void onLocationChanged(Location location) {
        this.f43701a.removeUpdates(this.f43702b[0]);
        this.d.getClass();
        this.f43703c.run(q0.h(location));
    }
}
