package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.BotWebViewVibrationEffect;

public final class s30 implements TextWatcher {

    public final s50 f42401a;

    public s30(s50 s50Var) {
        this.f42401a = s50Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        s50 s50Var = this.f42401a;
        s50Var.f42505w3.a(TextUtils.isEmpty(editable), true);
        int iCodePointCount = Character.codePointCount(editable, 0, editable.length());
        int i10 = s50Var.Z;
        if (iCodePointCount + 25 > i10) {
            str = "" + (i10 - iCodePointCount);
        } else {
            str = null;
        }
        s50Var.I.a();
        s50Var.I.setText(str);
        s50Var.I.setTextColor(iCodePointCount >= i10 ? -1280137 : -1);
        if (iCodePointCount > i10) {
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
