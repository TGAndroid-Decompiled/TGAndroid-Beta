package xh;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import org.telegram.messenger.q20;
public final class m0 implements LocationListener {
    public final LocationManager f53865a;
    public final LocationListener[] f53866b;
    public final q20 f53867c;
    public final o0 d;

    public m0(o0 o0Var, LocationManager locationManager, LocationListener[] locationListenerArr, q20 q20Var) {
        this.d = o0Var;
        this.f53865a = locationManager;
        this.f53866b = locationListenerArr;
        this.f53867c = q20Var;
    }

    @Override
    public final void onLocationChanged(Location location) {
        this.f53865a.removeUpdates(this.f53866b[0]);
        this.d.getClass();
        this.f53867c.a(o0.h(location));
    }
}
