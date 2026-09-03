package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class x00 implements TextWatcher {
    public final z00 f39798a;

    public x00(z00 z00Var) {
        this.f39798a = z00Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        String str;
        int i10;
        c10 c10Var = this.f39798a.e;
        if (!TextUtils.equals(editable, c10Var.f32983w)) {
            c10Var.f32980n = !TextUtils.isEmpty(editable);
            c10Var.f32983w = org.telegram.ui.Components.u5.onlyEmojiSpans(editable);
            q00 q00Var = c10Var.F;
            if (q00Var != null) {
                q00Var.e(org.telegram.ui.Components.u5.cloneSpans(c10Var.f32983w, -1, q00Var.f37266s.getPaint().getFontMetricsInt(), 0.5f), true);
            }
            r00 r00Var = c10Var.G;
            if (r00Var != null) {
                org.telegram.ui.Cells.s3 s3Var = r00Var.f37671r;
                if (c10.k0(c10Var.f32983w)) {
                    if (c10Var.f32984x) {
                        i10 = R.string.FilterNameAnimationsDisable;
                    } else {
                        i10 = R.string.FilterNameAnimationsEnable;
                    }
                    str = LocaleController.getString(i10);
                } else {
                    str = null;
                }
                s3Var.setText(str);
            }
            kVar = ((org.telegram.ui.ActionBar.p2) c10Var).actionBar;
            CharSequence charSequence = c10Var.f32983w;
            kVar2 = ((org.telegram.ui.ActionBar.p2) c10Var).actionBar;
            kVar.setTitle(org.telegram.ui.Components.u5.cloneSpans(charSequence, -1, kVar2.getTitleFontMetricsInt()));
        }
        c10Var.i0(true);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
