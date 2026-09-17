package org.telegram.ui;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class tb1 implements Runnable {
    public final int f40711a;
    public final ThemeActivity f40712b;

    public tb1(ThemeActivity themeActivity, int i10) {
        this.f40711a = i10;
        this.f40712b = themeActivity;
    }

    @Override
    public final void run() {
        switch (this.f40711a) {
            case 0:
                ThemeActivity themeActivity = this.f40712b;
                themeActivity.f34177b.d1(new pb1(themeActivity, 0), 700, true);
                return;
            default:
                ThemeActivity themeActivity2 = this.f40712b;
                String str = null;
                try {
                    List<Address> fromLocation = new Geocoder(ApplicationLoader.applicationContext, Locale.getDefault()).getFromLocation(org.telegram.ui.ActionBar.j6.f21019x, org.telegram.ui.ActionBar.j6.f21037y, 1);
                    if (fromLocation.size() > 0) {
                        str = fromLocation.get(0).getLocality();
                    }
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new w81(6, themeActivity2, str));
                return;
        }
    }
}
