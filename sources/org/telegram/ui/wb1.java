package org.telegram.ui;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class wb1 implements Runnable {
    public final int f43128a;
    public final ThemeActivity f43129b;

    public wb1(ThemeActivity themeActivity, int i10) {
        this.f43128a = i10;
        this.f43129b = themeActivity;
    }

    @Override
    public final void run() {
        switch (this.f43128a) {
            case 0:
                ThemeActivity themeActivity = this.f43129b;
                themeActivity.f34368b.e1(new sb1(themeActivity, 0), 700, true);
                return;
            default:
                ThemeActivity themeActivity2 = this.f43129b;
                String str = null;
                try {
                    List<Address> fromLocation = new Geocoder(ApplicationLoader.applicationContext, Locale.getDefault()).getFromLocation(org.telegram.ui.ActionBar.h6.f20922x, org.telegram.ui.ActionBar.h6.f20939y, 1);
                    if (fromLocation.size() > 0) {
                        str = fromLocation.get(0).getLocality();
                    }
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new w31(11, themeActivity2, str));
                return;
        }
    }
}
