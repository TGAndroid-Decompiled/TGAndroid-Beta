package xh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.yl0;
public final class t3 extends w51 {
    public static final int f46479a = 0;

    static {
        w51.setup(new w51());
    }

    @Override
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        u3 u3Var = (u3) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) x51Var.G;
        int i10 = x51Var.f30315z;
        String str = (String) x51Var.f30302l;
        boolean z11 = x51Var.e;
        e6 e6Var = u3Var.F;
        nj0 nj0Var = u3Var.f18882c;
        s3 s3Var = u3Var.N;
        if (s3Var == null || u3Var.M != stargiftattributepattern.document.f18335id) {
            u3Var.M = stargiftattributepattern.document.f18335id;
            if (s3Var != null) {
                s3Var.o(nj0Var);
            }
            ?? q5Var = new q5(3, u3Var.L, stargiftattributepattern.document);
            u3Var.N = q5Var;
            q5Var.setColorFilter(new PorterDuffColorFilter(i6.v0(i6.E8, e6Var), PorterDuff.Mode.SRC_IN));
        }
        if (nj0Var.isAttachedToWindow()) {
            u3Var.N.a(nj0Var);
        }
        SpannableStringBuilder spannableStringBuilder = stargiftattributepattern.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = AndroidUtilities.highlightText(spannableStringBuilder, str, e6Var);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder2.setSpan(new u51(AndroidUtilities.bold()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        u3Var.g(spannableStringBuilder, 0, u3Var.N);
        u3Var.setChecked(z11);
    }

    @Override
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, e6 e6Var) {
        return new u3(context, i10, e6Var);
    }
}
