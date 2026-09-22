package org.telegram.ui;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class tb1 implements Runnable {
    public final int f37628a;
    public final ThemeActivity f37629b;

    public tb1(ThemeActivity themeActivity, int i10) {
        this.f37628a = i10;
        this.f37629b = themeActivity;
    }

    @Override
    public final void run() {
        switch (this.f37628a) {
            case 0:
                ThemeActivity themeActivity = this.f37629b;
                themeActivity.f31548b.e1(new ob1(themeActivity, 0), 700, true);
                return;
            default:
                ThemeActivity themeActivity2 = this.f37629b;
                String str = null;
                try {
                    List<Address> fromLocation = new Geocoder(ApplicationLoader.applicationContext, Locale.getDefault()).getFromLocation(org.telegram.ui.ActionBar.i6.f19191x, org.telegram.ui.ActionBar.i6.f19209y, 1);
                    if (fromLocation.size() > 0) {
                        str = fromLocation.get(0).getLocality();
                    }
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new pb1(0, themeActivity2, str));
                return;
        }
    }
}
