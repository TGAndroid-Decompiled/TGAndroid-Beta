package org.telegram.ui;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class wb1 implements Runnable {
    public final int f43130a;
    public final ThemeActivity f43131b;

    public wb1(ThemeActivity themeActivity, int i10) {
        this.f43130a = i10;
        this.f43131b = themeActivity;
    }

    @Override
    public final void run() {
        switch (this.f43130a) {
            case 0:
                ThemeActivity themeActivity = this.f43131b;
                themeActivity.f34370b.e1(new sb1(themeActivity, 0), 700, true);
                return;
            default:
                ThemeActivity themeActivity2 = this.f43131b;
                String str = null;
                try {
                    List<Address> fromLocation = new Geocoder(ApplicationLoader.applicationContext, Locale.getDefault()).getFromLocation(org.telegram.ui.ActionBar.h6.f20923x, org.telegram.ui.ActionBar.h6.f20940y, 1);
                    if (fromLocation.size() > 0) {
                        str = fromLocation.get(0).getLocality();
                    }
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new u31(12, themeActivity2, str));
                return;
        }
    }
}
