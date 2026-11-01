package xh;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import org.telegram.messenger.r20;
public final class m0 implements LocationListener {
    public final LocationManager f53882a;
    public final LocationListener[] f53883b;
    public final r20 f53884c;
    public final o0 d;

    public m0(o0 o0Var, LocationManager locationManager, LocationListener[] locationListenerArr, r20 r20Var) {
        this.d = o0Var;
        this.f53882a = locationManager;
        this.f53883b = locationListenerArr;
        this.f53884c = r20Var;
    }

    @Override
    public final void onLocationChanged(Location location) {
        this.f53882a.removeUpdates(this.f53883b[0]);
        this.d.getClass();
        this.f53884c.a(o0.h(location));
    }
}
