package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class w00 implements TextWatcher {
    public final y00 f38857a;

    public w00(y00 y00Var) {
        this.f38857a = y00Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        String str;
        int i10;
        b10 b10Var = this.f38857a.e;
        if (!TextUtils.equals(editable, b10Var.f32279w)) {
            b10Var.f32276n = !TextUtils.isEmpty(editable);
            b10Var.f32279w = org.telegram.ui.Components.z5.onlyEmojiSpans(editable);
            p00 p00Var = b10Var.I;
            if (p00Var != null) {
                p00Var.e(org.telegram.ui.Components.z5.cloneSpans(b10Var.f32279w, -1, p00Var.f36372s.getPaint().getFontMetricsInt(), 0.5f), true);
            }
            q00 q00Var = b10Var.J;
            if (q00Var != null) {
                org.telegram.ui.Cells.u3 u3Var = q00Var.f36718r;
                if (b10.k0(b10Var.f32279w)) {
                    if (b10Var.f32280x) {
                        i10 = R.string.FilterNameAnimationsDisable;
                    } else {
                        i10 = R.string.FilterNameAnimationsEnable;
                    }
                    str = LocaleController.getString(i10);
                } else {
                    str = null;
                }
                u3Var.setText(str);
            }
            kVar = ((org.telegram.ui.ActionBar.m2) b10Var).actionBar;
            CharSequence charSequence = b10Var.f32279w;
            kVar2 = ((org.telegram.ui.ActionBar.m2) b10Var).actionBar;
            kVar.setTitle(org.telegram.ui.Components.z5.cloneSpans(charSequence, -1, kVar2.getTitleFontMetricsInt()));
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
