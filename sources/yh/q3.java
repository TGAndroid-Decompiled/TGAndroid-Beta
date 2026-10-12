package yh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.s5;
import org.telegram.ui.Components.z61;
public final class q3 extends k61 {
    public static final int f49099a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        r3 r3Var = (r3) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) l61Var.G;
        int i10 = l61Var.f26967z;
        String str = (String) l61Var.f26954l;
        boolean z11 = l61Var.e;
        c6 c6Var = r3Var.F;
        bk0 bk0Var = r3Var.f19721c;
        p3 p3Var = r3Var.N;
        if (p3Var == null || r3Var.M != stargiftattributepattern.document.f19222id) {
            r3Var.M = stargiftattributepattern.document.f19222id;
            if (p3Var != null) {
                p3Var.o(bk0Var);
            }
            ?? s5Var = new s5(3, r3Var.L, stargiftattributepattern.document);
            r3Var.N = s5Var;
            s5Var.setColorFilter(new PorterDuffColorFilter(g6.w0(g6.E8, c6Var), PorterDuff.Mode.SRC_IN));
        }
        if (bk0Var.isAttachedToWindow()) {
            r3Var.N.a(bk0Var);
        }
        SpannableStringBuilder spannableStringBuilder = stargiftattributepattern.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = AndroidUtilities.highlightText(spannableStringBuilder, str, c6Var);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder2.setSpan(new i61(AndroidUtilities.bold()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        r3Var.g(spannableStringBuilder, 0, r3Var.N);
        r3Var.setChecked(z11);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, c6 c6Var) {
        return new r3(context, i10, c6Var);
    }
}
