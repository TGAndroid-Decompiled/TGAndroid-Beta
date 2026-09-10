package wh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.s51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
public final class q3 extends u51 {
    public static final int f44327a = 0;

    static {
        u51.setup(new u51());
    }

    @Override
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        r3 r3Var = (r3) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) v51Var.G;
        int i10 = v51Var.f27842z;
        String str = (String) v51Var.f27829l;
        boolean z11 = v51Var.e;
        f6 f6Var = r3Var.F;
        kj0 kj0Var = r3Var.f17725c;
        p3 p3Var = r3Var.N;
        if (p3Var == null || r3Var.M != stargiftattributepattern.document.f17201id) {
            r3Var.M = stargiftattributepattern.document.f17201id;
            if (p3Var != null) {
                p3Var.o(kj0Var);
            }
            ?? p5Var = new p5(3, r3Var.L, stargiftattributepattern.document);
            r3Var.N = p5Var;
            p5Var.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.E8, f6Var), PorterDuff.Mode.SRC_IN));
        }
        if (kj0Var.isAttachedToWindow()) {
            r3Var.N.a(kj0Var);
        }
        SpannableStringBuilder spannableStringBuilder = stargiftattributepattern.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = AndroidUtilities.highlightText(spannableStringBuilder, str, f6Var);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder2.setSpan(new s51(AndroidUtilities.bold()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        r3Var.g(spannableStringBuilder, 0, r3Var.N);
        r3Var.setChecked(z11);
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, f6 f6Var) {
        return new r3(context, i10, f6Var);
    }
}
