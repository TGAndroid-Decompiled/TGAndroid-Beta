package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class v31 implements Runnable {
    public final int f37406a;
    public final org.telegram.ui.ActionBar.p2 f37407b;
    public final Context f37408c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final org.telegram.ui.Components.hy e;

    public v31(org.telegram.ui.ActionBar.p2 p2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.hy hyVar, int i10) {
        this.f37406a = i10;
        this.f37407b = p2Var;
        this.f37408c = context;
        this.d = f6Var;
        this.e = hyVar;
    }

    @Override
    public final void run() {
        switch (this.f37406a) {
            case 0:
                org.telegram.ui.Components.wc.a0(this.f37407b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new qv(this.f37408c, 4), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
            case 1:
                org.telegram.ui.Components.wc.a0(this.f37407b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new qv(this.f37408c, 3), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
            default:
                org.telegram.ui.Components.wc.a0(this.f37407b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new qv(this.f37408c, 7), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
        }
    }
}
