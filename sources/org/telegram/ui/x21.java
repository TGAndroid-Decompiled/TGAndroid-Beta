package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
public final class x21 implements x9 {
    public final int f43740a;
    public final org.telegram.ui.ActionBar.m2 f43741b;

    public x21(int i10, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f43740a = i10;
        this.f43741b = m2Var;
    }

    @Override
    public final String A0() {
        return null;
    }

    @Override
    public final void K(String str) {
        String b10 = of.f.b(str);
        if (!TextUtils.isEmpty(b10)) {
            MessagesController.getInstance(this.f43740a).getUserNameResolver().resolve(b10, new t3(this.f43741b, 21));
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
