package org.telegram.ui;

import android.text.SpannableStringBuilder;
public final class ww extends org.telegram.ui.Components.wi0 {
    public final int f39866f0 = 0;
    public final Object f39867g0;

    public ww(wf1 wf1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.f39867g0 = wf1Var;
    }

    @Override
    public final float d() {
        switch (this.f39866f0) {
            case 0:
                return ((py) this.f39867g0).f36794a.getViewOffset();
            default:
                return ((wf1) this.f39867g0).N.f38559m3;
        }
    }

    public ww(String str, String str2, py pyVar) {
        super(str, str2);
        this.f39867g0 = pyVar;
    }
}
