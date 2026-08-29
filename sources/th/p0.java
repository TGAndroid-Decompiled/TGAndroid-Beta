package th;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w41;
public final class p0 extends v41 {
    public static final int f48628a = 0;

    static {
        v41.setup(new v41());
    }

    @Override
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        boolean z11;
        float f9;
        q0 q0Var = (q0) view;
        a aVar = (a) w41Var.G;
        x2 x2Var = (x2) w41Var.H;
        d1 d1Var = q0Var.d;
        boolean z12 = false;
        if (q0Var.f48686f != aVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        q0Var.f48686f = aVar;
        q0Var.h = x2Var;
        TL_iv.PageBlock pageBlock = aVar.f48328b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            AnimatedArrowDrawable animatedArrowDrawable = q0Var.f48684c;
            if (pageblockdetails.open) {
                f9 = 0.0f;
            } else {
                f9 = 1.0f;
            }
            animatedArrowDrawable.a(f9);
            SpannableStringBuilder r6 = v5.r(pageblockdetails.title, null, true);
            if (!aVar.f48343s) {
                aVar.f48343s = true;
                aVar.f48342r = (r6.length() == 0 || (v5.q(0, r6.length(), r6) & 1) != 0) ? true : true;
            }
            d1Var.setAutoBold(aVar.f48342r);
            if (!z11 && String.valueOf(d1Var.getText()).equals(v5.l(pageblockdetails.title))) {
                return;
            }
            d1Var.setTextSilently(r6);
            d1Var.invalidateEffects();
        }
    }

    @Override
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, c6 c6Var) {
        return new q0(context, c6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
