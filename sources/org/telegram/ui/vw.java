package org.telegram.ui;

import android.text.SpannableStringBuilder;
public final class vw extends org.telegram.ui.Components.pi0 {
    public final int f39274f0 = 0;
    public final Object f39275g0;

    public vw(kf1 kf1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.f39275g0 = kf1Var;
    }

    @Override
    public final float d() {
        switch (this.f39274f0) {
            case 0:
                return ((ny) this.f39275g0).f36741a.getViewOffset();
            default:
                return ((kf1) this.f39275g0).K.c3;
        }
    }

    public vw(String str, String str2, ny nyVar) {
        super(str, str2);
        this.f39275g0 = nyVar;
    }
}
