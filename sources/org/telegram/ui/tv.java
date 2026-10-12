package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class tv implements Runnable {
    public final int f40490a;
    public final Context f40491b;

    public tv(Context context, int i10) {
        this.f40490a = i10;
        this.f40491b = context;
    }

    @Override
    public final void run() {
        switch (this.f40490a) {
            case 0:
                org.telegram.ui.ActionBar.g6.J(this.f40491b, false);
                return;
            case 1:
                Activity findActivity = AndroidUtilities.findActivity(this.f40491b);
                if (findActivity == null) {
                    findActivity = LaunchActivity.G1;
                }
                if (findActivity != null && !findActivity.isFinishing()) {
                    findActivity.moveTaskToBack(true);
                    return;
                }
                return;
            case 2:
                pf.d.s(this.f40491b, "https://promote.telegram.org/guidelines");
                return;
            case 3:
                pf.d.s(this.f40491b, "https://promote.telegram.org/guidelines");
                return;
            case 4:
                pf.d.s(this.f40491b, "https://promote.telegram.org/guidelines");
                return;
            case 5:
                pf.d.s(this.f40491b, "https://promote.telegram.org/guidelines");
                return;
            case 6:
                pf.d.s(this.f40491b, "https://promote.telegram.org/guidelines");
                return;
            case 7:
                pf.d.s(this.f40491b, "https://promote.telegram.org/guidelines");
                return;
            default:
                pf.d.s(this.f40491b, LocaleController.getString(R.string.WebAppDisclaimerUrl));
                return;
        }
    }
}
