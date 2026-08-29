package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class s30 implements TextWatcher {
    public final r50 f42264a;

    public s30(r50 r50Var) {
        this.f42264a = r50Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        int i10;
        r50 r50Var = this.f42264a;
        r50Var.f41963w3.a(TextUtils.isEmpty(editable), true);
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        int i11 = r50Var.Z;
        if (codePointCount + 25 > i11) {
            str = "" + (i11 - codePointCount);
        } else {
            str = null;
        }
        r50Var.I.a();
        r50Var.I.setText(str);
        org.telegram.ui.Components.o6 o6Var = r50Var.I;
        if (codePointCount >= i11) {
            i10 = -1280137;
        } else {
            i10 = -1;
        }
        o6Var.setTextColor(i10);
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
