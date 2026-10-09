package org.telegram.ui;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class ub1 implements Runnable {
    public final int f42394a;
    public final ThemeActivity f42395b;

    public ub1(ThemeActivity themeActivity, int i10) {
        this.f42394a = i10;
        this.f42395b = themeActivity;
    }

    @Override
    public final void run() {
        switch (this.f42394a) {
            case 0:
                ThemeActivity themeActivity = this.f42395b;
                themeActivity.f34531b.e1(new qb1(themeActivity, 0), 700, true);
                return;
            default:
                ThemeActivity themeActivity2 = this.f42395b;
                String str = null;
                try {
                    List<Address> fromLocation = new Geocoder(ApplicationLoader.applicationContext, Locale.getDefault()).getFromLocation(org.telegram.ui.ActionBar.i6.f21158x, org.telegram.ui.ActionBar.i6.f21175y, 1);
                    if (fromLocation.size() > 0) {
                        str = fromLocation.get(0).getLocality();
                    }
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new n31(14, themeActivity2, str));
                return;
        }
    }
}
