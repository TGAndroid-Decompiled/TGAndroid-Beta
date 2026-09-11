package yh;

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
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.v51;
public final class q3 extends g51 {
    public static final int f50526a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        r3 r3Var = (r3) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) h51Var.G;
        int i10 = h51Var.f26607z;
        String str = (String) h51Var.f26594l;
        boolean z11 = h51Var.f26588e;
        f6 f6Var = r3Var.F;
        aj0 aj0Var = r3Var.f20403c;
        p3 p3Var = r3Var.N;
        if (p3Var == null || r3Var.M != stargiftattributepattern.document.f19875id) {
            r3Var.M = stargiftattributepattern.document.f19875id;
            if (p3Var != null) {
                p3Var.o(aj0Var);
            }
            ?? q5Var = new q5(3, r3Var.L, stargiftattributepattern.document);
            r3Var.N = q5Var;
            q5Var.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.E8, f6Var), PorterDuff.Mode.SRC_IN));
        }
        if (aj0Var.isAttachedToWindow()) {
            r3Var.N.a(aj0Var);
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
            spannableStringBuilder2.setSpan(new e51(AndroidUtilities.bold()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        r3Var.g(spannableStringBuilder, 0, r3Var.N);
        r3Var.setChecked(z11);
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, f6 f6Var) {
        return new r3(context, i10, f6Var);
    }
}
