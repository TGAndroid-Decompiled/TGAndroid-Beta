package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
public final class w21 implements t9 {
    public final int f41750a;
    public final org.telegram.ui.ActionBar.n2 f41751b;

    public w21(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f41750a = i10;
        this.f41751b = n2Var;
    }

    @Override
    public final void K(String str) {
        String b10 = of.f.b(str);
        if (!TextUtils.isEmpty(b10)) {
            MessagesController.getInstance(this.f41750a).getUserNameResolver().resolve(b10, new xb(this.f41751b, 4));
        } else {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ue(28));
        }
    }

    @Override
    public final String K0() {
        return null;
    }

    @Override
    public final boolean f1(String str, l9 l9Var) {
        return false;
    }

    @Override
    public final void W0(MrzRecognizer.Result result) {
    }

    @Override
    public final void onDismiss() {
    }
}
