package org.telegram.ui;

import android.text.SpannableStringBuilder;
public final class zw extends org.telegram.ui.Components.nj0 {
    public final int f45083f0 = 0;
    public final Object f45084g0;

    public zw(fg1 fg1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.f45084g0 = fg1Var;
    }

    @Override
    public final float d() {
        switch (this.f45083f0) {
            case 0:
                return ((sy) this.f45084g0).f41790a.getViewOffset();
            default:
                return ((fg1) this.f45084g0).N.f36964d3;
        }
    }

    public zw(String str, String str2, sy syVar) {
        super(str, str2);
        this.f45084g0 = syVar;
    }
}
