package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
public final class tj0 implements u9 {
    public final uj0 f41581a;

    public tj0(uj0 uj0Var) {
        this.f41581a = uj0Var;
    }

    @Override
    public final String E0() {
        return null;
    }

    @Override
    public final void J(String str) {
        int i10;
        String b10 = af.g.b(str);
        if (!TextUtils.isEmpty(b10)) {
            i10 = ((org.telegram.ui.ActionBar.h3) this.f41581a).currentAccount;
            MessagesController.getInstance(i10).getUserNameResolver().resolve(b10, new ag.d(13));
            return;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jc(29));
    }

    @Override
    public final boolean e1(String str, m9 m9Var) {
        return false;
    }

    @Override
    public final void P0(MrzRecognizer.Result result) {
    }

    @Override
    public final void onDismiss() {
    }
}
