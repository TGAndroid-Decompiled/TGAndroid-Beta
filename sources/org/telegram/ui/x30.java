package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class x30 implements TextWatcher {
    public final x50 f45468a;

    public x30(x50 x50Var) {
        this.f45468a = x50Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        int i10;
        x50 x50Var = this.f45468a;
        x50Var.A3.a(TextUtils.isEmpty(editable), true);
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        int i11 = x50Var.f45503d0;
        if (codePointCount + 25 > i11) {
            str = "" + (i11 - codePointCount);
        } else {
            str = null;
        }
        x50Var.M.a();
        x50Var.M.setText(str);
        org.telegram.ui.Components.s6 s6Var = x50Var.M;
        if (codePointCount >= i11) {
            i10 = -1280137;
        } else {
            i10 = -1;
        }
        s6Var.setTextColor(i10);
        if (codePointCount > i11) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
