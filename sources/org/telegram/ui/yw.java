package org.telegram.ui;

import android.text.SpannableStringBuilder;
public final class yw extends org.telegram.ui.Components.vi0 {
    public final int f43640f0 = 0;
    public final Object f43641g0;

    public yw(yf1 yf1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.f43641g0 = yf1Var;
    }

    @Override
    public final float d() {
        switch (this.f43640f0) {
            case 0:
                return ((ty) this.f43641g0).f40983a.getViewOffset();
            default:
                return ((yf1) this.f43641g0).N.f42449m3;
        }
    }

    public yw(String str, String str2, ty tyVar) {
        super(str, str2);
        this.f43641g0 = tyVar;
    }
}
