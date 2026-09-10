package org.telegram.ui;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class xb1 implements Runnable {
    public final int f38671a;
    public final ThemeActivity f38672b;

    public xb1(ThemeActivity themeActivity, int i10) {
        this.f38671a = i10;
        this.f38672b = themeActivity;
    }

    @Override
    public final void run() {
        switch (this.f38671a) {
            case 0:
                ThemeActivity themeActivity = this.f38672b;
                themeActivity.f30663b.d1(new tb1(themeActivity, 0), 700, true);
                return;
            default:
                ThemeActivity themeActivity2 = this.f38672b;
                String str = null;
                try {
                    List<Address> fromLocation = new Geocoder(ApplicationLoader.applicationContext, Locale.getDefault()).getFromLocation(org.telegram.ui.ActionBar.j6.f18282x, org.telegram.ui.ActionBar.j6.f18300y, 1);
                    if (fromLocation.size() > 0) {
                        str = fromLocation.get(0).getLocality();
                    }
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new r91(3, themeActivity2, str));
                return;
        }
    }
}
