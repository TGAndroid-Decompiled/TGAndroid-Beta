package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class w31 implements Runnable {
    public final int f40855a;
    public final org.telegram.ui.ActionBar.m2 f40856b;
    public final Context f40857c;
    public final org.telegram.ui.ActionBar.c6 d;
    public final org.telegram.ui.Components.g90 e;

    public w31(org.telegram.ui.ActionBar.m2 m2Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.g90 g90Var, int i10) {
        this.f40855a = i10;
        this.f40856b = m2Var;
        this.f40857c = context;
        this.d = c6Var;
        this.e = g90Var;
    }

    @Override
    public final void run() {
        switch (this.f40855a) {
            case 0:
                org.telegram.ui.Components.zc.a0(this.f40856b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new tv(this.f40857c, 4), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
            case 1:
                org.telegram.ui.Components.zc.a0(this.f40856b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new tv(this.f40857c, 3), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
            default:
                org.telegram.ui.Components.zc.a0(this.f40856b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new tv(this.f40857c, 7), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
        }
    }
}
