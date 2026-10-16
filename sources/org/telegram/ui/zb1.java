package org.telegram.ui;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class zb1 implements Runnable {
    public final int f42271a;
    public final ThemeActivity f42272b;

    public zb1(ThemeActivity themeActivity, int i10) {
        this.f42271a = i10;
        this.f42272b = themeActivity;
    }

    @Override
    public final void run() {
        switch (this.f42271a) {
            case 0:
                ThemeActivity themeActivity = this.f42272b;
                themeActivity.f32544b.e1(new vb1(themeActivity, 0), 700, true);
                return;
            default:
                ThemeActivity themeActivity2 = this.f42272b;
                String str = null;
                try {
                    List<Address> fromLocation = new Geocoder(ApplicationLoader.applicationContext, Locale.getDefault()).getFromLocation(org.telegram.ui.ActionBar.g6.f19963x, org.telegram.ui.ActionBar.g6.f19982y, 1);
                    if (fromLocation.size() > 0) {
                        str = fromLocation.get(0).getLocality();
                    }
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new i11(20, themeActivity2, str));
                return;
        }
    }
}
