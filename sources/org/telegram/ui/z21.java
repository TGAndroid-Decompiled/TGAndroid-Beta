package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class z21 implements Runnable {
    public final int f43796a;
    public final org.telegram.ui.ActionBar.p2 f43797b;
    public final Context f43798c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final org.telegram.ui.Components.a90 f43799e;

    public z21(org.telegram.ui.ActionBar.p2 p2Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.Components.a90 a90Var, int i10) {
        this.f43796a = i10;
        this.f43797b = p2Var;
        this.f43798c = context;
        this.d = g6Var;
        this.f43799e = a90Var;
    }

    @Override
    public final void run() {
        switch (this.f43796a) {
            case 0:
                org.telegram.ui.Components.qc.a0(this.f43797b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new mv(this.f43798c, 4), this.d)).j();
                AndroidUtilities.runOnUIThread(this.f43799e);
                return;
            case 1:
                org.telegram.ui.Components.qc.a0(this.f43797b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new mv(this.f43798c, 3), this.d)).j();
                AndroidUtilities.runOnUIThread(this.f43799e);
                return;
            default:
                org.telegram.ui.Components.qc.a0(this.f43797b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new mv(this.f43798c, 7), this.d)).j();
                AndroidUtilities.runOnUIThread(this.f43799e);
                return;
        }
    }
}
