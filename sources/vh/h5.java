package vh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import j$.util.Objects;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.w51;
import ph.z8;
public final class h5 extends h51 {
    public static final int f46003a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        boolean z10;
        j5 j5Var = (j5) view;
        a aVar = (a) i51Var.G;
        z2 z2Var = (z2) i51Var.H;
        l5 l5Var = j5Var.v;
        boolean z11 = true;
        if (j5Var.f46414a != aVar) {
            z10 = true;
        } else {
            z10 = false;
        }
        j5Var.f46414a = aVar;
        j5Var.B = z2Var;
        j5Var.f46042y = LocaleController.isRTL;
        j5Var.c(aVar);
        TL_iv.PageBlock pageBlock = aVar.f45853b;
        if (!(pageBlock instanceof TL_iv.pageBlockTable)) {
            return;
        }
        a6 a6Var = new a6((TL_iv.pageBlockTable) pageBlock);
        j5Var.C = a6Var;
        l5Var.setModel(a6Var);
        LinkedHashSet linkedHashSet = j5Var.E;
        Objects.requireNonNull(linkedHashSet);
        l5Var.setSelectionProvider(new z8(linkedHashSet, 19));
        j5Var.y();
        e1 e1Var = j5Var.f46038r;
        a aVar2 = j5Var.f46414a;
        if (aVar2 != null) {
            TL_iv.PageBlock pageBlock2 = aVar2.f45853b;
            if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock2;
                if (pageblocktable.title == null) {
                    pageblocktable.title = new TL_iv.textEmpty();
                }
                String l10 = y5.l(pageblocktable.title);
                SpannableStringBuilder r10 = y5.r(pageblocktable.title, null, true);
                a aVar3 = j5Var.f46414a;
                if (!aVar3.f45867s) {
                    aVar3.f45867s = true;
                    if (r10.length() != 0 && (y5.q(0, r10.length(), r10) & 1) == 0) {
                        z11 = false;
                    }
                    aVar3.f45866r = z11;
                }
                e1Var.setAutoBold(j5Var.f46414a.f45866r);
                if (z10 || !String.valueOf(e1Var.getText()).equals(l10)) {
                    e1Var.setTextSilently(Emoji.replaceEmoji(r10, e1Var.getPaint().getFontMetricsInt(), false));
                    e1Var.invalidateEffects();
                }
            }
        }
        j5Var.e();
        j5Var.f46040w.requestLayout();
    }

    @Override
    public final View createView(Context context, rl0 rl0Var, int i10, int i11, f6 f6Var) {
        j5 j5Var = new j5(context, f6Var);
        j5Var.setBackground(new v1(j6.v0(j6.f19881d6, f6Var)));
        return j5Var;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
