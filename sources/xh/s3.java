package xh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.s5;
import org.telegram.ui.Components.sm0;
public final class s3 extends q61 {
    public static final int f51609a = 0;

    static {
        q61.setup(new q61());
    }

    @Override
    public final void bindView(View view, r61 r61Var, boolean z10, e71 e71Var, m71 m71Var) {
        t3 t3Var = (t3) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) r61Var.G;
        int i10 = r61Var.f30374z;
        String str = (String) r61Var.f30361l;
        boolean z11 = r61Var.f30355e;
        d6 d6Var = t3Var.F;
        hk0 hk0Var = t3Var.f20550c;
        r3 r3Var = t3Var.N;
        if (r3Var == null || t3Var.M != stargiftattributepattern.document.f20038id) {
            t3Var.M = stargiftattributepattern.document.f20038id;
            if (r3Var != null) {
                r3Var.o(hk0Var);
            }
            ?? s5Var = new s5(3, t3Var.L, stargiftattributepattern.document);
            t3Var.N = s5Var;
            s5Var.setColorFilter(new PorterDuffColorFilter(h6.w0(h6.E8, d6Var), PorterDuff.Mode.SRC_IN));
        }
        if (hk0Var.isAttachedToWindow()) {
            t3Var.N.a(hk0Var);
        }
        SpannableStringBuilder spannableStringBuilder = stargiftattributepattern.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = AndroidUtilities.highlightText(spannableStringBuilder, str, d6Var);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder2.setSpan(new o61(AndroidUtilities.bold()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        t3Var.g(spannableStringBuilder, 0, t3Var.N);
        t3Var.setChecked(z11);
    }

    @Override
    public final View createView(Context context, sm0 sm0Var, int i10, int i11, d6 d6Var) {
        return new t3(context, i10, d6Var);
    }
}
