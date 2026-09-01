package wh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import j$.util.Objects;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.x51;
public final class g5 extends i51 {
    public static final int f49762a = 0;

    static {
        i51.setup(new i51());
    }

    @Override
    public final void bindView(View view, j51 j51Var, boolean z4, x51 x51Var, i61 i61Var) {
        boolean z10;
        i5 i5Var = (i5) view;
        a aVar = (a) j51Var.G;
        y2 y2Var = (y2) j51Var.H;
        k5 k5Var = i5Var.v;
        boolean z11 = true;
        if (i5Var.f50175a != aVar) {
            z10 = true;
        } else {
            z10 = false;
        }
        i5Var.f50175a = aVar;
        i5Var.B = y2Var;
        i5Var.f49802y = LocaleController.isRTL;
        i5Var.c(aVar);
        TL_iv.PageBlock pageBlock = aVar.f49617b;
        if (!(pageBlock instanceof TL_iv.pageBlockTable)) {
            return;
        }
        z5 z5Var = new z5((TL_iv.pageBlockTable) pageBlock);
        i5Var.C = z5Var;
        k5Var.setModel(z5Var);
        LinkedHashSet linkedHashSet = i5Var.E;
        Objects.requireNonNull(linkedHashSet);
        k5Var.setSelectionProvider(new sf.g(linkedHashSet, 20));
        i5Var.y();
        e1 e1Var = i5Var.f49798r;
        a aVar2 = i5Var.f50175a;
        if (aVar2 != null) {
            TL_iv.PageBlock pageBlock2 = aVar2.f49617b;
            if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock2;
                if (pageblocktable.title == null) {
                    pageblocktable.title = new TL_iv.textEmpty();
                }
                String l10 = x5.l(pageblocktable.title);
                SpannableStringBuilder r10 = x5.r(pageblocktable.title, null, true);
                a aVar3 = i5Var.f50175a;
                if (!aVar3.f49632s) {
                    aVar3.f49632s = true;
                    if (r10.length() != 0 && (x5.q(0, r10.length(), r10) & 1) == 0) {
                        z11 = false;
                    }
                    aVar3.f49631r = z11;
                }
                e1Var.setAutoBold(i5Var.f50175a.f49631r);
                if (z10 || !String.valueOf(e1Var.getText()).equals(l10)) {
                    e1Var.setTextSilently(Emoji.replaceEmoji(r10, e1Var.getPaint().getFontMetricsInt(), false));
                    e1Var.invalidateEffects();
                }
            }
        }
        i5Var.e();
        i5Var.f49800w.requestLayout();
    }

    @Override
    public final View createView(Context context, tl0 tl0Var, int i10, int i11, g6 g6Var) {
        i5 i5Var = new i5(context, g6Var);
        i5Var.setBackground(new w1(k6.v0(k6.f21659d6, g6Var)));
        return i5Var;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
