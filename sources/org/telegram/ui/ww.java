package org.telegram.ui;

import android.text.SpannableStringBuilder;
public final class ww extends org.telegram.ui.Components.ri0 {
    public final int f42865f0 = 0;
    public final Object f42866g0;

    public ww(sf1 sf1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.f42866g0 = sf1Var;
    }

    @Override
    public final float d() {
        switch (this.f42865f0) {
            case 0:
                return ((oy) this.f42866g0).f39822a.getViewOffset();
            default:
                return ((sf1) this.f42866g0).K.c3;
        }
    }

    public ww(String str, String str2, oy oyVar) {
        super(str, str2);
        this.f42866g0 = oyVar;
    }
}
