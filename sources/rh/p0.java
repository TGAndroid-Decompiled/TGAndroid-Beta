package rh;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import org.telegram.messenger.Utilities;
public final class p0 implements LocationListener {
    public final LocationManager f43649a;
    public final LocationListener[] f43650b;
    public final Utilities.Callback f43651c;
    public final r0 d;

    public p0(r0 r0Var, LocationManager locationManager, LocationListener[] locationListenerArr, Utilities.Callback callback) {
        this.d = r0Var;
        this.f43649a = locationManager;
        this.f43650b = locationListenerArr;
        this.f43651c = callback;
    }

    @Override
    public final void onLocationChanged(Location location) {
        this.f43649a.removeUpdates(this.f43650b[0]);
        this.d.getClass();
        this.f43651c.run(r0.h(location));
    }
}
