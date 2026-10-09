package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
public final class u21 implements u9 {
    public final int f42311a;
    public final org.telegram.ui.ActionBar.n2 f42312b;

    public u21(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f42311a = i10;
        this.f42312b = n2Var;
    }

    @Override
    public final void K(String str) {
        String b10 = of.f.b(str);
        if (!TextUtils.isEmpty(b10)) {
            MessagesController.getInstance(this.f42311a).getUserNameResolver().resolve(b10, new t3(this.f42312b, 21));
        } else {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.vh(29));
        }
    }

    @Override
    public final boolean Z0(String str, k9 k9Var) {
        return false;
    }

    @Override
    public final String z0() {
        return null;
    }

    @Override
    public final void P0(MrzRecognizer.Result result) {
    }

    @Override
    public final void onDismiss() {
    }
}
