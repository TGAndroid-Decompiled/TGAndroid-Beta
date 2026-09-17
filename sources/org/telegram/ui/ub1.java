package org.telegram.ui;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class ub1 implements Runnable {
    public final int f38036a;
    public final ThemeActivity f38037b;

    public ub1(ThemeActivity themeActivity, int i10) {
        this.f38036a = i10;
        this.f38037b = themeActivity;
    }

    @Override
    public final void run() {
        switch (this.f38036a) {
            case 0:
                ThemeActivity themeActivity = this.f38037b;
                themeActivity.f31564b.f1(new pb1(themeActivity, 0), 700, true);
                return;
            default:
                ThemeActivity themeActivity2 = this.f38037b;
                String str = null;
                try {
                    List<Address> fromLocation = new Geocoder(ApplicationLoader.applicationContext, Locale.getDefault()).getFromLocation(org.telegram.ui.ActionBar.j6.f19220x, org.telegram.ui.ActionBar.j6.f19238y, 1);
                    if (fromLocation.size() > 0) {
                        str = fromLocation.get(0).getLocality();
                    }
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new qb1(0, themeActivity2, str));
                return;
        }
    }
}
