package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class s31 implements Runnable {
    public final int f40323a;
    public final org.telegram.ui.ActionBar.n2 f40324b;
    public final Context f40325c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final org.telegram.ui.Components.jn0 f40326e;

    public s31(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.jn0 jn0Var, int i10) {
        this.f40323a = i10;
        this.f40324b = n2Var;
        this.f40325c = context;
        this.d = f6Var;
        this.f40326e = jn0Var;
    }

    @Override
    public final void run() {
        switch (this.f40323a) {
            case 0:
                org.telegram.ui.Components.yc.a0(this.f40324b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new pv(this.f40325c, 4), this.d)).j();
                AndroidUtilities.runOnUIThread(this.f40326e);
                return;
            case 1:
                org.telegram.ui.Components.yc.a0(this.f40324b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new pv(this.f40325c, 3), this.d)).j();
                AndroidUtilities.runOnUIThread(this.f40326e);
                return;
            default:
                org.telegram.ui.Components.yc.a0(this.f40324b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new pv(this.f40325c, 7), this.d)).j();
                AndroidUtilities.runOnUIThread(this.f40326e);
                return;
        }
    }
}
