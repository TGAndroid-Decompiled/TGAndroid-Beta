package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class w31 implements Runnable {
    public final int f41148a;
    public final org.telegram.ui.ActionBar.m2 f41149b;
    public final Context f41150c;
    public final org.telegram.ui.ActionBar.c6 d;
    public final org.telegram.ui.Components.f60 e;

    public w31(org.telegram.ui.ActionBar.m2 m2Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.f60 f60Var, int i10) {
        this.f41148a = i10;
        this.f41149b = m2Var;
        this.f41150c = context;
        this.d = c6Var;
        this.e = f60Var;
    }

    @Override
    public final void run() {
        switch (this.f41148a) {
            case 0:
                org.telegram.ui.Components.zc.a0(this.f41149b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new tv(this.f41150c, 4), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
            case 1:
                org.telegram.ui.Components.zc.a0(this.f41149b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new tv(this.f41150c, 3), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
            default:
                org.telegram.ui.Components.zc.a0(this.f41149b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new tv(this.f41150c, 7), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
        }
    }
}
