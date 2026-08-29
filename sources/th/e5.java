package th;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import j$.util.Objects;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w41;
public final class e5 extends v41 {
    public static final int f48428a = 0;

    static {
        v41.setup(new v41());
    }

    @Override
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        boolean z11;
        g5 g5Var = (g5) view;
        a aVar = (a) w41Var.G;
        w2 w2Var = (w2) w41Var.H;
        i5 i5Var = g5Var.v;
        boolean z12 = true;
        if (g5Var.f48892a != aVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        g5Var.f48892a = aVar;
        g5Var.A = w2Var;
        g5Var.f48468y = LocaleController.isRTL;
        g5Var.c(aVar);
        TL_iv.PageBlock pageBlock = aVar.f48328b;
        if (!(pageBlock instanceof TL_iv.pageBlockTable)) {
            return;
        }
        x5 x5Var = new x5((TL_iv.pageBlockTable) pageBlock);
        g5Var.B = x5Var;
        i5Var.setModel(x5Var);
        LinkedHashSet linkedHashSet = g5Var.D;
        Objects.requireNonNull(linkedHashSet);
        i5Var.setSelectionProvider(new sf.f1(linkedHashSet, 11));
        g5Var.y();
        d1 d1Var = g5Var.f48464r;
        a aVar2 = g5Var.f48892a;
        if (aVar2 != null) {
            TL_iv.PageBlock pageBlock2 = aVar2.f48328b;
            if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock2;
                if (pageblocktable.title == null) {
                    pageblocktable.title = new TL_iv.textEmpty();
                }
                String l10 = v5.l(pageblocktable.title);
                SpannableStringBuilder r6 = v5.r(pageblocktable.title, null, true);
                a aVar3 = g5Var.f48892a;
                if (!aVar3.f48343s) {
                    aVar3.f48343s = true;
                    if (r6.length() != 0 && (v5.q(0, r6.length(), r6) & 1) == 0) {
                        z12 = false;
                    }
                    aVar3.f48342r = z12;
                }
                d1Var.setAutoBold(g5Var.f48892a.f48342r);
                if (z11 || !String.valueOf(d1Var.getText()).equals(l10)) {
                    d1Var.setTextSilently(Emoji.replaceEmoji(r6, d1Var.getPaint().getFontMetricsInt(), false));
                    d1Var.invalidateEffects();
                }
            }
        }
        g5Var.e();
        g5Var.f48466w.requestLayout();
    }

    @Override
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, c6 c6Var) {
        g5 g5Var = new g5(context, c6Var);
        g5Var.setBackground(new u1(g6.v0(g6.f23062d6, c6Var)));
        return g5Var;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
