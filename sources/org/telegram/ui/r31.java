package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class r31 implements Runnable {
    public final int f37073a;
    public final org.telegram.ui.ActionBar.o2 f37074b;
    public final Context f37075c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final org.telegram.ui.Components.ny e;

    public r31(org.telegram.ui.ActionBar.o2 o2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.ny nyVar, int i10) {
        this.f37073a = i10;
        this.f37074b = o2Var;
        this.f37075c = context;
        this.d = f6Var;
        this.e = nyVar;
    }

    @Override
    public final void run() {
        switch (this.f37073a) {
            case 0:
                org.telegram.ui.Components.vc.a0(this.f37074b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new qv(this.f37075c, 4), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
            case 1:
                org.telegram.ui.Components.vc.a0(this.f37074b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new qv(this.f37075c, 3), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
            default:
                org.telegram.ui.Components.vc.a0(this.f37074b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new qv(this.f37075c, 7), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
        }
    }
}
