package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
public final class tj0 implements w9 {
    public final uj0 f38534a;

    public tj0(uj0 uj0Var) {
        this.f38534a = uj0Var;
    }

    @Override
    public final String C0() {
        return null;
    }

    @Override
    public final void K(String str) {
        int i10;
        String b10 = ze.d.b(str);
        if (!TextUtils.isEmpty(b10)) {
            i10 = ((org.telegram.ui.ActionBar.g3) this.f38534a).currentAccount;
            MessagesController.getInstance(i10).getUserNameResolver().resolve(b10, new nh.e(12));
            return;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.mc(27));
    }

    @Override
    public final boolean a1(String str, o9 o9Var) {
        return false;
    }

    @Override
    public final void P0(MrzRecognizer.Result result) {
    }

    @Override
    public final void onDismiss() {
    }
}
