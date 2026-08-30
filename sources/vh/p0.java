package vh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
public final class p0 extends h51 {
    public static final int f46064a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        boolean z10;
        float f10;
        q0 q0Var = (q0) view;
        a aVar = (a) i51Var.G;
        z2 z2Var = (z2) i51Var.H;
        d1 d1Var = q0Var.d;
        boolean z11 = false;
        if (q0Var.f46081f != aVar) {
            z10 = true;
        } else {
            z10 = false;
        }
        q0Var.f46081f = aVar;
        q0Var.h = z2Var;
        TL_iv.PageBlock pageBlock = aVar.f45775b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            AnimatedArrowDrawable animatedArrowDrawable = q0Var.f46080c;
            if (pageblockdetails.open) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            animatedArrowDrawable.a(f10);
            SpannableStringBuilder r10 = x5.r(pageblockdetails.title, null, true);
            if (!aVar.f45789s) {
                aVar.f45789s = true;
                aVar.f45788r = (r10.length() == 0 || (x5.q(0, r10.length(), r10) & 1) != 0) ? true : true;
            }
            d1Var.setAutoBold(aVar.f45788r);
            if (!z10 && String.valueOf(d1Var.getText()).equals(x5.l(pageblockdetails.title))) {
                return;
            }
            d1Var.setTextSilently(r10);
            d1Var.invalidateEffects();
        }
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, f6 f6Var) {
        return new q0(context, f6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
