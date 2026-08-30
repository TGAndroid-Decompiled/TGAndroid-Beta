package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class w00 implements TextWatcher {
    public final y00 f39292a;

    public w00(y00 y00Var) {
        this.f39292a = y00Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        String str;
        int i10;
        b10 b10Var = this.f39292a.e;
        if (!TextUtils.equals(editable, b10Var.f32766w)) {
            b10Var.f32763n = !TextUtils.isEmpty(editable);
            b10Var.f32766w = org.telegram.ui.Components.u5.onlyEmojiSpans(editable);
            p00 p00Var = b10Var.F;
            if (p00Var != null) {
                p00Var.e(org.telegram.ui.Components.u5.cloneSpans(b10Var.f32766w, -1, p00Var.f37143s.getPaint().getFontMetricsInt(), 0.5f), true);
            }
            q00 q00Var = b10Var.G;
            if (q00Var != null) {
                org.telegram.ui.Cells.t3 t3Var = q00Var.f37564r;
                if (b10.k0(b10Var.f32766w)) {
                    if (b10Var.f32767x) {
                        i10 = R.string.FilterNameAnimationsDisable;
                    } else {
                        i10 = R.string.FilterNameAnimationsEnable;
                    }
                    str = LocaleController.getString(i10);
                } else {
                    str = null;
                }
                t3Var.setText(str);
            }
            kVar = ((org.telegram.ui.ActionBar.p2) b10Var).actionBar;
            CharSequence charSequence = b10Var.f32766w;
            kVar2 = ((org.telegram.ui.ActionBar.p2) b10Var).actionBar;
            kVar.setTitle(org.telegram.ui.Components.u5.cloneSpans(charSequence, -1, kVar2.getTitleFontMetricsInt()));
        }
        b10Var.i0(true);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
