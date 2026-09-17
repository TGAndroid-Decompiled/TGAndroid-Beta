package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
public final class w21 implements v9 {
    public final int f38560a;
    public final org.telegram.ui.ActionBar.o2 f38561b;

    public w21(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f38560a = i10;
        this.f38561b = o2Var;
    }

    @Override
    public final String J0() {
        return null;
    }

    @Override
    public final void K(String str) {
        String b10 = nf.f.b(str);
        if (!TextUtils.isEmpty(b10)) {
            MessagesController.getInstance(this.f38560a).getUserNameResolver().resolve(b10, new zb(this.f38561b, 4));
        } else {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.sh(27));
        }
    }

    @Override
    public final boolean e1(String str, n9 n9Var) {
        return false;
    }

    @Override
    public final void T0(MrzRecognizer.Result result) {
    }

    @Override
    public final void onDismiss() {
    }
}
