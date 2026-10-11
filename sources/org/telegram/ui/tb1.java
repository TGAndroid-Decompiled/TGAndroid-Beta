package org.telegram.ui;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class tb1 implements Runnable {
    public final int f42183a;
    public final ThemeActivity f42184b;

    public tb1(ThemeActivity themeActivity, int i10) {
        this.f42183a = i10;
        this.f42184b = themeActivity;
    }

    @Override
    public final void run() {
        switch (this.f42183a) {
            case 0:
                ThemeActivity themeActivity = this.f42184b;
                themeActivity.f34593b.e1(new pb1(themeActivity, 0), 700, true);
                return;
            default:
                ThemeActivity themeActivity2 = this.f42184b;
                String str = null;
                try {
                    List<Address> fromLocation = new Geocoder(ApplicationLoader.applicationContext, Locale.getDefault()).getFromLocation(org.telegram.ui.ActionBar.h6.f21184x, org.telegram.ui.ActionBar.h6.f21201y, 1);
                    if (fromLocation.size() > 0) {
                        str = fromLocation.get(0).getLocality();
                    }
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new m31(13, themeActivity2, str));
                return;
        }
    }
}
