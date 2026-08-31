package org.telegram.ui;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class za1 implements Runnable {
    public final int f43881a;
    public final ThemeActivity f43882b;

    public za1(ThemeActivity themeActivity, int i10) {
        this.f43881a = i10;
        this.f43882b = themeActivity;
    }

    @Override
    public final void run() {
        switch (this.f43881a) {
            case 0:
                ThemeActivity themeActivity = this.f43882b;
                themeActivity.f34872b.e1(new va1(themeActivity, 0), 700, true);
                return;
            default:
                ThemeActivity themeActivity2 = this.f43882b;
                String str = null;
                try {
                    List<Address> fromLocation = new Geocoder(ApplicationLoader.applicationContext, Locale.getDefault()).getFromLocation(org.telegram.ui.ActionBar.k6.f22010x, org.telegram.ui.ActionBar.k6.f22029y, 1);
                    if (fromLocation.size() > 0) {
                        str = fromLocation.get(0).getLocality();
                    }
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new w01(17, themeActivity2, str));
                return;
        }
    }
}
