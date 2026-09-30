package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
public final class vj0 implements t9 {
    public final wj0 f38763a;

    public vj0(wj0 wj0Var) {
        this.f38763a = wj0Var;
    }

    @Override
    public final String J0() {
        return null;
    }

    @Override
    public final void K(String str) {
        int i10;
        String b10 = nf.f.b(str);
        if (!TextUtils.isEmpty(b10)) {
            i10 = ((org.telegram.ui.ActionBar.e3) this.f38763a).currentAccount;
            MessagesController.getInstance(i10).getUserNameResolver().resolve(b10, new ai.i(18));
            return;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.th(26));
    }

    @Override
    public final boolean e1(String str, l9 l9Var) {
        return false;
    }

    @Override
    public final void T0(MrzRecognizer.Result result) {
    }

    @Override
    public final void onDismiss() {
    }
}
