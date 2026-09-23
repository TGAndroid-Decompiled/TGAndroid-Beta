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
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.v51;
public final class s3 extends g51 {
    public static final int f46078a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        t3 t3Var = (t3) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) h51Var.G;
        int i10 = h51Var.f24520z;
        String str = (String) h51Var.f24507l;
        boolean z11 = h51Var.e;
        d6 d6Var = t3Var.F;
        bj0 bj0Var = t3Var.f18612c;
        r3 r3Var = t3Var.N;
        if (r3Var == null || t3Var.M != stargiftattributepattern.document.f18089id) {
            t3Var.M = stargiftattributepattern.document.f18089id;
            if (r3Var != null) {
                r3Var.o(bj0Var);
            }
            ?? q5Var = new q5(3, t3Var.L, stargiftattributepattern.document);
            t3Var.N = q5Var;
            q5Var.setColorFilter(new PorterDuffColorFilter(h6.v0(h6.E8, d6Var), PorterDuff.Mode.SRC_IN));
        }
        if (bj0Var.isAttachedToWindow()) {
            t3Var.N.a(bj0Var);
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
            spannableStringBuilder2.setSpan(new e51(AndroidUtilities.bold()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        t3Var.g(spannableStringBuilder, 0, t3Var.N);
        t3Var.setChecked(z11);
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, d6 d6Var) {
        return new t3(context, i10, d6Var);
    }
}
