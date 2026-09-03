package wh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
public final class q0 extends g51 {
    public static final int f49971a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        boolean z10;
        float f10;
        r0 r0Var = (r0) view;
        a aVar = (a) h51Var.G;
        z2 z2Var = (z2) h51Var.H;
        e1 e1Var = r0Var.d;
        boolean z11 = false;
        if (r0Var.f50001f != aVar) {
            z10 = true;
        } else {
            z10 = false;
        }
        r0Var.f50001f = aVar;
        r0Var.h = z2Var;
        TL_iv.PageBlock pageBlock = aVar.f49653b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            AnimatedArrowDrawable animatedArrowDrawable = r0Var.f49999c;
            if (pageblockdetails.open) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            animatedArrowDrawable.a(f10);
            SpannableStringBuilder r10 = x5.r(pageblockdetails.title, null, true);
            if (!aVar.f49668s) {
                aVar.f49668s = true;
                aVar.f49667r = (r10.length() == 0 || (x5.q(0, r10.length(), r10) & 1) != 0) ? true : true;
            }
            e1Var.setAutoBold(aVar.f49667r);
            if (!z10 && String.valueOf(e1Var.getText()).equals(x5.l(pageblockdetails.title))) {
                return;
            }
            e1Var.setTextSilently(r10);
            e1Var.invalidateEffects();
        }
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, g6 g6Var) {
        return new r0(context, g6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
