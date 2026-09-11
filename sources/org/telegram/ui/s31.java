package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class s31 implements Runnable {
    public final int f40296a;
    public final org.telegram.ui.ActionBar.n2 f40297b;
    public final Context f40298c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final org.telegram.ui.Components.jn0 f40299e;

    public s31(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.jn0 jn0Var, int i10) {
        this.f40296a = i10;
        this.f40297b = n2Var;
        this.f40298c = context;
        this.d = f6Var;
        this.f40299e = jn0Var;
    }

    @Override
    public final void run() {
        switch (this.f40296a) {
            case 0:
                org.telegram.ui.Components.yc.a0(this.f40297b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new pv(this.f40298c, 4), this.d)).j();
                AndroidUtilities.runOnUIThread(this.f40299e);
                return;
            case 1:
                org.telegram.ui.Components.yc.a0(this.f40297b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new pv(this.f40298c, 3), this.d)).j();
                AndroidUtilities.runOnUIThread(this.f40299e);
                return;
            default:
                org.telegram.ui.Components.yc.a0(this.f40297b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new pv(this.f40298c, 7), this.d)).j();
                AndroidUtilities.runOnUIThread(this.f40299e);
                return;
        }
    }
}
