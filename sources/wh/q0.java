package wh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.x51;
public final class q0 extends i51 {
    public static final int f49934a = 0;

    static {
        i51.setup(new i51());
    }

    @Override
    public final void bindView(View view, j51 j51Var, boolean z4, x51 x51Var, i61 i61Var) {
        boolean z10;
        float f10;
        r0 r0Var = (r0) view;
        a aVar = (a) j51Var.G;
        z2 z2Var = (z2) j51Var.H;
        e1 e1Var = r0Var.d;
        boolean z11 = false;
        if (r0Var.f49964f != aVar) {
            z10 = true;
        } else {
            z10 = false;
        }
        r0Var.f49964f = aVar;
        r0Var.h = z2Var;
        TL_iv.PageBlock pageBlock = aVar.f49616b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            AnimatedArrowDrawable animatedArrowDrawable = r0Var.f49962c;
            if (pageblockdetails.open) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            animatedArrowDrawable.a(f10);
            SpannableStringBuilder r10 = x5.r(pageblockdetails.title, null, true);
            if (!aVar.f49631s) {
                aVar.f49631s = true;
                aVar.f49630r = (r10.length() == 0 || (x5.q(0, r10.length(), r10) & 1) != 0) ? true : true;
            }
            e1Var.setAutoBold(aVar.f49630r);
            if (!z10 && String.valueOf(e1Var.getText()).equals(x5.l(pageblockdetails.title))) {
                return;
            }
            e1Var.setTextSilently(r10);
            e1Var.invalidateEffects();
        }
    }

    @Override
    public final View createView(Context context, tl0 tl0Var, int i10, int i11, g6 g6Var) {
        return new r0(context, g6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
