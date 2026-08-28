package qh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
public final class p0 extends k41 {
    public static final int f46611a = 0;

    static {
        k41.setup(new k41());
    }

    @Override
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        boolean z11;
        float f10;
        q0 q0Var = (q0) view;
        a aVar = (a) l41Var.G;
        w2 w2Var = (w2) l41Var.H;
        d1 d1Var = q0Var.d;
        boolean z12 = false;
        if (q0Var.f46625f != aVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        q0Var.f46625f = aVar;
        q0Var.h = w2Var;
        TL_iv.PageBlock pageBlock = aVar.f46269b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            AnimatedArrowDrawable animatedArrowDrawable = q0Var.f46623c;
            if (pageblockdetails.open) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            animatedArrowDrawable.a(f10);
            SpannableStringBuilder r10 = u5.r(pageblockdetails.title, null, true);
            if (!aVar.f46284s) {
                aVar.f46284s = true;
                aVar.f46283r = (r10.length() == 0 || (u5.q(0, r10.length(), r10) & 1) != 0) ? true : true;
            }
            d1Var.setAutoBold(aVar.f46283r);
            if (!z11 && String.valueOf(d1Var.getText()).equals(u5.l(pageblockdetails.title))) {
                return;
            }
            d1Var.setTextSilently(r10);
            d1Var.invalidateEffects();
        }
    }

    @Override
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, b6 b6Var) {
        return new q0(context, b6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
