package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
public final class xj0 implements w9 {
    public final yj0 f39669a;

    public xj0(yj0 yj0Var) {
        this.f39669a = yj0Var;
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
            i10 = ((org.telegram.ui.ActionBar.g3) this.f39669a).currentAccount;
            MessagesController.getInstance(i10).getUserNameResolver().resolve(b10, new ai.i(18));
            return;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.th(26));
    }

    @Override
    public final boolean e1(String str, o9 o9Var) {
        return false;
    }

    @Override
    public final void T0(MrzRecognizer.Result result) {
    }

    @Override
    public final void onDismiss() {
    }
}
