package rh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.zk0;

public final class p0 extends m41 {

    public static final int f47329a = 0;

    static {
        m41.setup(new p0());
    }

    @Override
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        q0 q0Var = (q0) view;
        a aVar = (a) n41Var.G;
        x2 x2Var = (x2) n41Var.H;
        d1 d1Var = q0Var.d;
        boolean z11 = q0Var.f47388f != aVar;
        q0Var.f47388f = aVar;
        q0Var.h = x2Var;
        TL_iv.PageBlock pageBlock = aVar.f47028b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            q0Var.f47386c.a(pageblockdetails.open ? 0.0f : 1.0f);
            SpannableStringBuilder spannableStringBuilderR = v5.r(pageblockdetails.title, null, true);
            if (!aVar.f47043s) {
                aVar.f47043s = true;
                aVar.f47042r = spannableStringBuilderR.length() == 0 || (v5.q(0, spannableStringBuilderR.length(), spannableStringBuilderR) & 1) != 0;
            }
            d1Var.setAutoBold(aVar.f47042r);
            if (z11 || !String.valueOf(d1Var.getText()).equals(v5.l(pageblockdetails.title))) {
                d1Var.setTextSilently(spannableStringBuilderR);
                d1Var.invalidateEffects();
            }
        }
    }

    @Override
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, c6 c6Var) {
        return new q0(context, c6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
