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
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.w51;
public final class q0 extends h51 {
    public static final int f46161a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        boolean z10;
        float f10;
        r0 r0Var = (r0) view;
        a aVar = (a) i51Var.G;
        a3 a3Var = (a3) i51Var.H;
        e1 e1Var = r0Var.d;
        boolean z11 = false;
        if (r0Var.f46178f != aVar) {
            z10 = true;
        } else {
            z10 = false;
        }
        r0Var.f46178f = aVar;
        r0Var.h = a3Var;
        TL_iv.PageBlock pageBlock = aVar.f45853b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            AnimatedArrowDrawable animatedArrowDrawable = r0Var.f46177c;
            if (pageblockdetails.open) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            animatedArrowDrawable.a(f10);
            SpannableStringBuilder r10 = y5.r(pageblockdetails.title, null, true);
            if (!aVar.f45867s) {
                aVar.f45867s = true;
                aVar.f45866r = (r10.length() == 0 || (y5.q(0, r10.length(), r10) & 1) != 0) ? true : true;
            }
            e1Var.setAutoBold(aVar.f45866r);
            if (!z10 && String.valueOf(e1Var.getText()).equals(y5.l(pageblockdetails.title))) {
                return;
            }
            e1Var.setTextSilently(r10);
            e1Var.invalidateEffects();
        }
    }

    @Override
    public final View createView(Context context, rl0 rl0Var, int i10, int i11, f6 f6Var) {
        return new r0(context, f6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
