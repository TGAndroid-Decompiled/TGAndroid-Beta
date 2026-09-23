package org.telegram.ui;

import android.text.SpannableStringBuilder;
public final class xw extends org.telegram.ui.Components.ji0 {
    public final int f39670f0 = 0;
    public final Object f39671g0;

    public xw(wf1 wf1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.f39671g0 = wf1Var;
    }

    @Override
    public final float d() {
        switch (this.f39670f0) {
            case 0:
                return ((qy) this.f39671g0).f36629a.getViewOffset();
            default:
                return ((wf1) this.f39671g0).N.f38100f3;
        }
    }

    public xw(String str, String str2, qy qyVar) {
        super(str, str2);
        this.f39671g0 = qyVar;
    }
}
