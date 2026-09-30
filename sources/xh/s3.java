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
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.zl0;
public final class s3 extends x51 {
    public static final int f46514a = 0;

    static {
        x51.setup(new x51());
    }

    @Override
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        t3 t3Var = (t3) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) y51Var.G;
        int i10 = y51Var.f30650z;
        String str = (String) y51Var.f30637l;
        boolean z11 = y51Var.e;
        d6 d6Var = t3Var.F;
        oj0 oj0Var = t3Var.f18851c;
        r3 r3Var = t3Var.N;
        if (r3Var == null || t3Var.M != stargiftattributepattern.document.f18358id) {
            t3Var.M = stargiftattributepattern.document.f18358id;
            if (r3Var != null) {
                r3Var.o(oj0Var);
            }
            ?? q5Var = new q5(3, t3Var.L, stargiftattributepattern.document);
            t3Var.N = q5Var;
            q5Var.setColorFilter(new PorterDuffColorFilter(h6.v0(h6.E8, d6Var), PorterDuff.Mode.SRC_IN));
        }
        if (oj0Var.isAttachedToWindow()) {
            t3Var.N.a(oj0Var);
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
            spannableStringBuilder2.setSpan(new v51(AndroidUtilities.bold()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        t3Var.g(spannableStringBuilder, 0, t3Var.N);
        t3Var.setChecked(z11);
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, d6 d6Var) {
        return new t3(context, i10, d6Var);
    }
}
