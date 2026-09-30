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
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.yl0;
public final class s3 extends w51 {
    public static final int f46408a = 0;

    static {
        w51.setup(new w51());
    }

    @Override
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        t3 t3Var = (t3) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) x51Var.G;
        int i10 = x51Var.f30291z;
        String str = (String) x51Var.f30278l;
        boolean z11 = x51Var.e;
        d6 d6Var = t3Var.F;
        nj0 nj0Var = t3Var.f18836c;
        r3 r3Var = t3Var.N;
        if (r3Var == null || t3Var.M != stargiftattributepattern.document.f18343id) {
            t3Var.M = stargiftattributepattern.document.f18343id;
            if (r3Var != null) {
                r3Var.o(nj0Var);
            }
            ?? q5Var = new q5(3, t3Var.L, stargiftattributepattern.document);
            t3Var.N = q5Var;
            q5Var.setColorFilter(new PorterDuffColorFilter(h6.v0(h6.E8, d6Var), PorterDuff.Mode.SRC_IN));
        }
        if (nj0Var.isAttachedToWindow()) {
            t3Var.N.a(nj0Var);
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
            spannableStringBuilder2.setSpan(new u51(AndroidUtilities.bold()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        t3Var.g(spannableStringBuilder, 0, t3Var.N);
        t3Var.setChecked(z11);
    }

    @Override
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, d6 d6Var) {
        return new t3(context, i10, d6Var);
    }
}
