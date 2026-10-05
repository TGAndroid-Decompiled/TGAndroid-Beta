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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.zl0;
public final class s3 extends g61 {
    public static final int f50243a = 0;

    static {
        g61.setup(new g61());
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, w61 w61Var, e71 e71Var) {
        t3 t3Var = (t3) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) h61Var.G;
        int i10 = h61Var.f27106z;
        String str = (String) h61Var.f27093l;
        boolean z11 = h61Var.f27087e;
        d6 d6Var = t3Var.F;
        nj0 nj0Var = t3Var.f20594c;
        r3 r3Var = t3Var.N;
        if (r3Var == null || t3Var.M != stargiftattributepattern.document.f20053id) {
            t3Var.M = stargiftattributepattern.document.f20053id;
            if (r3Var != null) {
                r3Var.o(nj0Var);
            }
            ?? q5Var = new q5(3, t3Var.L, stargiftattributepattern.document);
            t3Var.N = q5Var;
            q5Var.setColorFilter(new PorterDuffColorFilter(i6.v0(i6.E8, d6Var), PorterDuff.Mode.SRC_IN));
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
            spannableStringBuilder2.setSpan(new e61(AndroidUtilities.bold()), length, spannableStringBuilder2.length(), 33);
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
