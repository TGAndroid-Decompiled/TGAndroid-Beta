package org.telegram.ui;

import android.text.SpannableStringBuilder;
public final class ww extends org.telegram.ui.Components.ri0 {
    public final int f42896f0 = 0;
    public final Object f42897g0;

    public ww(mf1 mf1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.f42897g0 = mf1Var;
    }

    @Override
    public final float d() {
        switch (this.f42896f0) {
            case 0:
                return ((oy) this.f42897g0).f39866a.getViewOffset();
            default:
                return ((mf1) this.f42897g0).K.c3;
        }
    }

    public ww(String str, String str2, oy oyVar) {
        super(str, str2);
        this.f42897g0 = oyVar;
    }
}
