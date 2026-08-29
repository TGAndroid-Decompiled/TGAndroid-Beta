package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
public final class r11 implements q9 {
    public final int f41841a;
    public final org.telegram.ui.ActionBar.o2 f41842b;

    public r11(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f41841a = i10;
        this.f41842b = o2Var;
    }

    @Override
    public final String E0() {
        return null;
    }

    @Override
    public final void J(String str) {
        String b10 = ye.d.b(str);
        if (!TextUtils.isEmpty(b10)) {
            MessagesController.getInstance(this.f41841a).getUserNameResolver().resolve(b10, new rb(this.f41842b, 4));
        } else {
            AndroidUtilities.runOnUIThread(new ef0(4));
        }
    }

    @Override
    public final boolean d1(String str, i9 i9Var) {
        return false;
    }

    @Override
    public final void S0(MrzRecognizer.Result result) {
    }

    @Override
    public final void onDismiss() {
    }
}
