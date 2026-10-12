package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class r31 implements Runnable {
    public final int f41495a;
    public final org.telegram.ui.ActionBar.m2 f41496b;
    public final Context f41497c;
    public final org.telegram.ui.ActionBar.c6 d;
    public final org.telegram.ui.Components.sj0 f41498e;

    public r31(org.telegram.ui.ActionBar.m2 m2Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.sj0 sj0Var, int i10) {
        this.f41495a = i10;
        this.f41496b = m2Var;
        this.f41497c = context;
        this.d = c6Var;
        this.f41498e = sj0Var;
    }

    @Override
    public final void run() {
        switch (this.f41495a) {
            case 0:
                org.telegram.ui.Components.zc.a0(this.f41496b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new qv(this.f41497c, 4), this.d)).j();
                AndroidUtilities.runOnUIThread(this.f41498e);
                return;
            case 1:
                org.telegram.ui.Components.zc.a0(this.f41496b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new qv(this.f41497c, 3), this.d)).j();
                AndroidUtilities.runOnUIThread(this.f41498e);
                return;
            default:
                org.telegram.ui.Components.zc.a0(this.f41496b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new qv(this.f41497c, 7), this.d)).j();
                AndroidUtilities.runOnUIThread(this.f41498e);
                return;
        }
    }
}
