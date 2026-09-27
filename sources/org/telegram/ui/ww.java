package org.telegram.ui;

import android.text.SpannableStringBuilder;
public final class ww extends org.telegram.ui.Components.vi0 {
    public final int f39465f0 = 0;
    public final Object f39466g0;

    public ww(wf1 wf1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.f39466g0 = wf1Var;
    }

    @Override
    public final float d() {
        switch (this.f39465f0) {
            case 0:
                return ((sy) this.f39466g0).f37593a.getViewOffset();
            default:
                return ((wf1) this.f39466g0).N.f38247f3;
        }
    }

    public ww(String str, String str2, sy syVar) {
        super(str, str2);
        this.f39466g0 = syVar;
    }
}
