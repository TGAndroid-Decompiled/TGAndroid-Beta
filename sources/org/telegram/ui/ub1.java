package org.telegram.ui;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class ub1 implements Runnable {
    public final int f38041a;
    public final ThemeActivity f38042b;

    public ub1(ThemeActivity themeActivity, int i10) {
        this.f38041a = i10;
        this.f38042b = themeActivity;
    }

    @Override
    public final void run() {
        switch (this.f38041a) {
            case 0:
                ThemeActivity themeActivity = this.f38042b;
                themeActivity.f31568b.f1(new pb1(themeActivity, 0), 700, true);
                return;
            default:
                ThemeActivity themeActivity2 = this.f38042b;
                String str = null;
                try {
                    List<Address> fromLocation = new Geocoder(ApplicationLoader.applicationContext, Locale.getDefault()).getFromLocation(org.telegram.ui.ActionBar.j6.f19221x, org.telegram.ui.ActionBar.j6.f19239y, 1);
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
