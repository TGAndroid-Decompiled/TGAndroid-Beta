package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class z00 implements TextWatcher {
    public final b10 f44582a;

    public z00(b10 b10Var) {
        this.f44582a = b10Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        String str;
        int i10;
        e10 e10Var = this.f44582a.f36271e;
        if (!TextUtils.equals(editable, e10Var.f37211w)) {
            e10Var.f37208n = !TextUtils.isEmpty(editable);
            e10Var.f37211w = org.telegram.ui.Components.b6.onlyEmojiSpans(editable);
            s00 s00Var = e10Var.I;
            if (s00Var != null) {
                s00Var.e(org.telegram.ui.Components.b6.cloneSpans(e10Var.f37211w, -1, s00Var.f41583s.getPaint().getFontMetricsInt(), 0.5f), true);
            }
            t00 t00Var = e10Var.J;
            if (t00Var != null) {
                org.telegram.ui.Cells.u3 u3Var = t00Var.f42057r;
                if (e10.k0(e10Var.f37211w)) {
                    if (e10Var.f37212x) {
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
            kVar = ((org.telegram.ui.ActionBar.m2) e10Var).actionBar;
            CharSequence charSequence = e10Var.f37211w;
            kVar2 = ((org.telegram.ui.ActionBar.m2) e10Var).actionBar;
            kVar.setTitle(org.telegram.ui.Components.b6.cloneSpans(charSequence, -1, kVar2.getTitleFontMetricsInt()));
        }
        e10Var.i0(true);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
