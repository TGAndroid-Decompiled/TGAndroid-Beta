package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class x21 implements Runnable {
    public final int f39841a;
    public final org.telegram.ui.ActionBar.p2 f39842b;
    public final Context f39843c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final org.telegram.ui.Components.i80 e;

    public x21(org.telegram.ui.ActionBar.p2 p2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.i80 i80Var, int i10) {
        this.f39841a = i10;
        this.f39842b = p2Var;
        this.f39843c = context;
        this.d = f6Var;
        this.e = i80Var;
    }

    @Override
    public final void run() {
        switch (this.f39841a) {
            case 0:
                org.telegram.ui.Components.qc.a0(this.f39842b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new lv(this.f39843c, 4), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
            case 1:
                org.telegram.ui.Components.qc.a0(this.f39842b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new lv(this.f39843c, 3), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
            default:
                org.telegram.ui.Components.qc.a0(this.f39842b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new lv(this.f39843c, 7), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
        }
    }
}
