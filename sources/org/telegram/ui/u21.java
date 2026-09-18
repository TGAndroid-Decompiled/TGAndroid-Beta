package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
public final class u21 implements u9 {
    public final int f37857a;
    public final org.telegram.ui.ActionBar.n2 f37858b;

    public u21(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f37857a = i10;
        this.f37858b = n2Var;
    }

    @Override
    public final String J0() {
        return null;
    }

    @Override
    public final void K(String str) {
        String b10 = nf.f.b(str);
        if (!TextUtils.isEmpty(b10)) {
            MessagesController.getInstance(this.f37857a).getUserNameResolver().resolve(b10, new yb(this.f37858b, 4));
        } else {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.sh(27));
        }
    }

    @Override
    public final boolean e1(String str, m9 m9Var) {
        return false;
    }

    @Override
    public final void T0(MrzRecognizer.Result result) {
    }

    @Override
    public final void onDismiss() {
    }
}
