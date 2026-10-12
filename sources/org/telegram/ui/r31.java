package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class r31 implements Runnable {
    public final int f41499a;
    public final org.telegram.ui.ActionBar.m2 f41500b;
    public final Context f41501c;
    public final org.telegram.ui.ActionBar.c6 d;
    public final org.telegram.ui.Components.gi0 f41502e;

    public r31(org.telegram.ui.ActionBar.m2 m2Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.gi0 gi0Var, int i10) {
        this.f41499a = i10;
        this.f41500b = m2Var;
        this.f41501c = context;
        this.d = c6Var;
        this.f41502e = gi0Var;
    }

    @Override
    public final void run() {
        switch (this.f41499a) {
            case 0:
                org.telegram.ui.Components.zc.a0(this.f41500b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new qv(this.f41501c, 4), this.d)).j();
                AndroidUtilities.runOnUIThread(this.f41502e);
                return;
            case 1:
                org.telegram.ui.Components.zc.a0(this.f41500b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new qv(this.f41501c, 3), this.d)).j();
                AndroidUtilities.runOnUIThread(this.f41502e);
                return;
            default:
                org.telegram.ui.Components.zc.a0(this.f41500b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new qv(this.f41501c, 7), this.d)).j();
                AndroidUtilities.runOnUIThread(this.f41502e);
                return;
        }
    }
}
