package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
public final class v21 implements t9 {
    public final int f38348a;
    public final org.telegram.ui.ActionBar.n2 f38349b;

    public v21(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f38348a = i10;
        this.f38349b = n2Var;
    }

    @Override
    public final String J0() {
        return null;
    }

    @Override
    public final void K(String str) {
        String b10 = nf.f.b(str);
        if (!TextUtils.isEmpty(b10)) {
            MessagesController.getInstance(this.f38348a).getUserNameResolver().resolve(b10, new xb(this.f38349b, 4));
        } else {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.sh(27));
        }
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
