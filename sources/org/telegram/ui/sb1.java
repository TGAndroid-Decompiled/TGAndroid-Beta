package org.telegram.ui;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class sb1 implements Runnable {
    public final int f37243a;
    public final ThemeActivity f37244b;

    public sb1(ThemeActivity themeActivity, int i10) {
        this.f37243a = i10;
        this.f37244b = themeActivity;
    }

    @Override
    public final void run() {
        switch (this.f37243a) {
            case 0:
                ThemeActivity themeActivity = this.f37244b;
                themeActivity.f31795b.f1(new ob1(themeActivity, 0), 700, true);
                return;
            default:
                ThemeActivity themeActivity2 = this.f37244b;
                String str = null;
                try {
                    List<Address> fromLocation = new Geocoder(ApplicationLoader.applicationContext, Locale.getDefault()).getFromLocation(org.telegram.ui.ActionBar.j6.f19421x, org.telegram.ui.ActionBar.j6.f19439y, 1);
                    if (fromLocation.size() > 0) {
                        str = fromLocation.get(0).getLocality();
                    }
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new x81(4, themeActivity2, str));
                return;
        }
    }
}
