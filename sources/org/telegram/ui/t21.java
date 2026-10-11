package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
public final class t21 implements t9 {
    public final int f42046a;
    public final org.telegram.ui.ActionBar.m2 f42047b;

    public t21(int i10, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f42046a = i10;
        this.f42047b = m2Var;
    }

    @Override
    public final void K(String str) {
        String b10 = of.f.b(str);
        if (!TextUtils.isEmpty(b10)) {
            MessagesController.getInstance(this.f42046a).getUserNameResolver().resolve(b10, new s3(this.f42047b, 21));
        } else {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.vh(29));
        }
    }

    @Override
    public final boolean Z0(String str, j9 j9Var) {
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
