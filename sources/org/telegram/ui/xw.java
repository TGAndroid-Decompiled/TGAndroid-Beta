package org.telegram.ui;

import android.text.SpannableStringBuilder;
public final class xw extends org.telegram.ui.Components.qi0 {
    public final int f40082f0 = 0;
    public final Object f40083g0;

    public xw(sf1 sf1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.f40083g0 = sf1Var;
    }

    @Override
    public final float d() {
        switch (this.f40082f0) {
            case 0:
                return ((py) this.f40083g0).f37246a.getViewOffset();
            default:
                return ((sf1) this.f40083g0).K.c3;
        }
    }

    public xw(String str, String str2, py pyVar) {
        super(str, str2);
        this.f40083g0 = pyVar;
    }
}
