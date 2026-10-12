package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
public final class x21 implements x9 {
    public final int f43745a;
    public final org.telegram.ui.ActionBar.m2 f43746b;

    public x21(int i10, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f43745a = i10;
        this.f43746b = m2Var;
    }

    @Override
    public final String A0() {
        return null;
    }

    @Override
    public final void K(String str) {
        String b10 = of.f.b(str);
        if (!TextUtils.isEmpty(b10)) {
            MessagesController.getInstance(this.f43745a).getUserNameResolver().resolve(b10, new t3(this.f43746b, 21));
        } else {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.xh(29));
        }
    }

    @Override
    public final boolean Z0(String str, n9 n9Var) {
        return false;
    }

    @Override
    public final void P0(MrzRecognizer.Result result) {
    }

    @Override
    public final void onDismiss() {
    }
}
