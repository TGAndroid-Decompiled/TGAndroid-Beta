package yh;

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
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.c61;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.xj0;
public final class p3 extends e61 {
    public static final int f50467a = 0;

    static {
        e61.setup(new e61());
    }

    @Override
    public final void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
        q3 q3Var = (q3) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) f61Var.G;
        int i10 = f61Var.f26153z;
        String str = (String) f61Var.f26140l;
        boolean z11 = f61Var.e;
        d6 d6Var = q3Var.F;
        xj0 xj0Var = q3Var.f20759c;
        o3 o3Var = q3Var.N;
        if (o3Var == null || q3Var.M != stargiftattributepattern.document.f20278id) {
            q3Var.M = stargiftattributepattern.document.f20278id;
            if (o3Var != null) {
                o3Var.o(xj0Var);
            }
            ?? r5Var = new r5(3, q3Var.L, stargiftattributepattern.document);
            q3Var.N = r5Var;
            r5Var.setColorFilter(new PorterDuffColorFilter(h6.w0(h6.E8, d6Var), PorterDuff.Mode.SRC_IN));
        }
        if (xj0Var.isAttachedToWindow()) {
            q3Var.N.a(xj0Var);
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
            spannableStringBuilder2.setSpan(new c61(AndroidUtilities.bold()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        q3Var.g(spannableStringBuilder, 0, q3Var.N);
        q3Var.setChecked(z11);
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, d6 d6Var) {
        return new q3(context, i10, d6Var);
    }
}
