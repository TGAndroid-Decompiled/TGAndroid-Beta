package org.telegram.ui;

import android.text.SpannableStringBuilder;
public final class ww extends org.telegram.ui.Components.ti0 {
    public final int f39771f0 = 0;
    public final Object f39772g0;

    public ww(wf1 wf1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.f39772g0 = wf1Var;
    }

    @Override
    public final float d() {
        switch (this.f39771f0) {
            case 0:
                return ((py) this.f39772g0).f36694a.getViewOffset();
            default:
                return ((wf1) this.f39772g0).N.f38469f3;
        }
    }

    public ww(String str, String str2, py pyVar) {
        super(str, str2);
        this.f39772g0 = pyVar;
    }
}
