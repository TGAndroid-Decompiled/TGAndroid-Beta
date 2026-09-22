package org.telegram.ui;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class ub1 implements Runnable {
    public final int f38051a;
    public final ThemeActivity f38052b;

    public ub1(ThemeActivity themeActivity, int i10) {
        this.f38051a = i10;
        this.f38052b = themeActivity;
    }

    @Override
    public final void run() {
        switch (this.f38051a) {
            case 0:
                ThemeActivity themeActivity = this.f38052b;
                themeActivity.f31856b.f1(new qb1(themeActivity, 0), 700, true);
                return;
            default:
                ThemeActivity themeActivity2 = this.f38052b;
                String str = null;
                try {
                    List<Address> fromLocation = new Geocoder(ApplicationLoader.applicationContext, Locale.getDefault()).getFromLocation(org.telegram.ui.ActionBar.j6.f19468x, org.telegram.ui.ActionBar.j6.f19486y, 1);
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
