package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class qv implements Runnable {
    public final int f37040a;
    public final Context f37041b;

    public qv(Context context, int i10) {
        this.f37040a = i10;
        this.f37041b = context;
    }

    @Override
    public final void run() {
        switch (this.f37040a) {
            case 0:
                org.telegram.ui.ActionBar.j6.J(this.f37041b, false);
                return;
            case 1:
                Activity findActivity = AndroidUtilities.findActivity(this.f37041b);
                if (findActivity == null) {
                    findActivity = LaunchActivity.G1;
                }
                if (findActivity != null && !findActivity.isFinishing()) {
                    findActivity.moveTaskToBack(true);
                    return;
                }
                return;
            case 2:
                nf.f.s(this.f37041b, "https://promote.telegram.org/guidelines");
                return;
            case 3:
                nf.f.s(this.f37041b, "https://promote.telegram.org/guidelines");
                return;
            case 4:
                nf.f.s(this.f37041b, "https://promote.telegram.org/guidelines");
                return;
            case 5:
                nf.f.s(this.f37041b, "https://promote.telegram.org/guidelines");
                return;
            case 6:
                nf.f.s(this.f37041b, "https://promote.telegram.org/guidelines");
                return;
            case 7:
                nf.f.s(this.f37041b, "https://promote.telegram.org/guidelines");
                return;
            default:
                nf.f.s(this.f37041b, LocaleController.getString(R.string.WebAppDisclaimerUrl));
                return;
        }
    }
}
