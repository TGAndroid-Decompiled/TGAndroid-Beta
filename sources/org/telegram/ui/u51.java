package org.telegram.ui;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
public final class u51 implements LocationListener {
    public final ThemeActivity f51772a;

    public u51(ThemeActivity themeActivity) {
        this.f51772a = themeActivity;
    }

    @Override
    public final void onLocationChanged(Location location) {
        ThemeActivity themeActivity = this.f51772a;
        if (location == null) {
            return;
        }
        themeActivity.M0 = false;
        LocationManager locationManager = (LocationManager) org.telegram.messenger.t0.f26609b.getSystemService("location");
        locationManager.removeUpdates(themeActivity.S0);
        locationManager.removeUpdates(themeActivity.T0);
        themeActivity.G0(location, false);
    }

    @Override
    public final void onProviderDisabled(String str) {
    }

    @Override
    public final void onProviderEnabled(String str) {
    }

    @Override
    public final void onStatusChanged(String str, int i7, Bundle bundle) {
    }
}
