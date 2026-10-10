package org.telegram.ui;

import android.text.SpannableStringBuilder;
public final class zw extends org.telegram.ui.Components.oj0 {
    public final int f45127f0 = 0;
    public final Object f45128g0;

    public zw(fg1 fg1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.f45128g0 = fg1Var;
    }

    @Override
    public final float d() {
        switch (this.f45127f0) {
            case 0:
                return ((sy) this.f45128g0).f41834a.getViewOffset();
            default:
                return ((fg1) this.f45128g0).N.f37008d3;
        }
    }

    public zw(String str, String str2, sy syVar) {
        super(str, str2);
        this.f45128g0 = syVar;
    }
}
