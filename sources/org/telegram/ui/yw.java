package org.telegram.ui;

import android.text.SpannableStringBuilder;
public final class yw extends org.telegram.ui.Components.pj0 {
    public final int f44514f0 = 0;
    public final Object f44515g0;

    public yw(eg1 eg1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.f44515g0 = eg1Var;
    }

    @Override
    public final float d() {
        switch (this.f44514f0) {
            case 0:
                return ((ry) this.f44515g0).f41530a.getViewOffset();
            default:
                return ((eg1) this.f44515g0).N.f36700d3;
        }
    }

    public yw(String str, String str2, ry ryVar) {
        super(str, str2);
        this.f44515g0 = ryVar;
    }
}
