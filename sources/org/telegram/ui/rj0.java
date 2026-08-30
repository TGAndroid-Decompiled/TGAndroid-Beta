package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
public final class rj0 implements u9 {
    public final sj0 f38066a;

    public rj0(sj0 sj0Var) {
        this.f38066a = sj0Var;
    }

    @Override
    public final String G0() {
        return null;
    }

    @Override
    public final void K(String str) {
        int i10;
        String b10 = af.g.b(str);
        if (!TextUtils.isEmpty(b10)) {
            i10 = ((org.telegram.ui.ActionBar.g3) this.f38066a).currentAccount;
            MessagesController.getInstance(i10).getUserNameResolver().resolve(b10, new nh.e(12));
            return;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.mc(27));
    }

    @Override
    public final boolean f1(String str, m9 m9Var) {
        return false;
    }

    @Override
    public final void S0(MrzRecognizer.Result result) {
    }

    @Override
    public final void onDismiss() {
    }
}
