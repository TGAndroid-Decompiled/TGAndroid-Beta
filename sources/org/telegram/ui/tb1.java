package org.telegram.ui;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class tb1 implements Runnable {
    public final int f40738a;
    public final ThemeActivity f40739b;

    public tb1(ThemeActivity themeActivity, int i10) {
        this.f40738a = i10;
        this.f40739b = themeActivity;
    }

    @Override
    public final void run() {
        switch (this.f40738a) {
            case 0:
                ThemeActivity themeActivity = this.f40739b;
                themeActivity.f34204b.d1(new pb1(themeActivity, 0), 700, true);
                return;
            default:
                ThemeActivity themeActivity2 = this.f40739b;
                String str = null;
                try {
                    List<Address> fromLocation = new Geocoder(ApplicationLoader.applicationContext, Locale.getDefault()).getFromLocation(org.telegram.ui.ActionBar.j6.f21046x, org.telegram.ui.ActionBar.j6.f21064y, 1);
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
