package org.telegram.ui;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class ya1 implements Runnable {
    public final int f40463a;
    public final ThemeActivity f40464b;

    public ya1(ThemeActivity themeActivity, int i10) {
        this.f40463a = i10;
        this.f40464b = themeActivity;
    }

    @Override
    public final void run() {
        switch (this.f40463a) {
            case 0:
                ThemeActivity themeActivity = this.f40464b;
                themeActivity.f32333b.e1(new ua1(themeActivity, 0), 700, true);
                return;
            default:
                ThemeActivity themeActivity2 = this.f40464b;
                String str = null;
                try {
                    List<Address> fromLocation = new Geocoder(ApplicationLoader.applicationContext, Locale.getDefault()).getFromLocation(org.telegram.ui.ActionBar.j6.f20256x, org.telegram.ui.ActionBar.j6.f20274y, 1);
                    if (fromLocation.size() > 0) {
                        str = fromLocation.get(0).getLocality();
                    }
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new l01(18, themeActivity2, str));
                return;
        }
    }
}
