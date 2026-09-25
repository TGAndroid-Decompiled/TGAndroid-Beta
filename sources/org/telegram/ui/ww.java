package org.telegram.ui;

import android.text.SpannableStringBuilder;
public final class ww extends org.telegram.ui.Components.ti0 {
    public final int f39772f0 = 0;
    public final Object f39773g0;

    public ww(wf1 wf1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.f39773g0 = wf1Var;
    }

    @Override
    public final float d() {
        switch (this.f39772f0) {
            case 0:
                return ((py) this.f39773g0).f36695a.getViewOffset();
            default:
                return ((wf1) this.f39773g0).N.f38470f3;
        }
    }

    public ww(String str, String str2, py pyVar) {
        super(str, str2);
        this.f39773g0 = pyVar;
    }
}
