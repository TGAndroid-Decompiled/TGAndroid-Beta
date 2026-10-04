package org.telegram.ui;

import android.text.SpannableStringBuilder;
public final class yw extends org.telegram.ui.Components.vi0 {
    public final int f43641f0 = 0;
    public final Object f43642g0;

    public yw(yf1 yf1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.f43642g0 = yf1Var;
    }

    @Override
    public final float d() {
        switch (this.f43641f0) {
            case 0:
                return ((ty) this.f43642g0).f40984a.getViewOffset();
            default:
                return ((yf1) this.f43642g0).N.f42450m3;
        }
    }

    public yw(String str, String str2, ty tyVar) {
        super(str, str2);
        this.f43642g0 = tyVar;
    }
}
