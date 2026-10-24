package yh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.p5;
public final class p3 extends k61 {
    public static final int f50933a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, a71 a71Var, i71 i71Var) {
        q3 q3Var = (q3) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) l61Var.G;
        int i10 = l61Var.f28240z;
        String str = (String) l61Var.f28227l;
        boolean z11 = l61Var.e;
        g6 g6Var = q3Var.O;
        ak0 ak0Var = q3Var.f20838c;
        o3 o3Var = q3Var.f50946a0;
        if (o3Var == null || q3Var.W != stargiftattributepattern.document.f20350id) {
            q3Var.W = stargiftattributepattern.document.f20350id;
            if (o3Var != null) {
                o3Var.o(ak0Var);
            }
            ?? p5Var = new p5(3, q3Var.V, stargiftattributepattern.document);
            q3Var.f50946a0 = p5Var;
            r6.z(q3Var, p5Var, k6.E8, g6Var, PorterDuff.Mode.SRC_IN);
        }
        if (ak0Var.isAttachedToWindow()) {
            q3Var.f50946a0.a(ak0Var);
        }
        SpannableStringBuilder spannableStringBuilder = stargiftattributepattern.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = AndroidUtilities.highlightText(spannableStringBuilder, str, g6Var);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder2.setSpan(new i61(AndroidUtilities.bold()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        q3Var.j(spannableStringBuilder, 0, q3Var.f50946a0);
        q3Var.setChecked(z11);
    }

    @Override
    public final View createView(Context context, lm0 lm0Var, int i10, int i11, g6 g6Var) {
        return new q3(context, i10, g6Var);
    }
}
