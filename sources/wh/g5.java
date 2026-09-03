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
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
public final class g5 extends g51 {
    public static final int f49798a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        boolean z10;
        i5 i5Var = (i5) view;
        a aVar = (a) h51Var.G;
        y2 y2Var = (y2) h51Var.H;
        k5 k5Var = i5Var.v;
        boolean z11 = true;
        if (i5Var.f50211a != aVar) {
            z10 = true;
        } else {
            z10 = false;
        }
        i5Var.f50211a = aVar;
        i5Var.B = y2Var;
        i5Var.f49838y = LocaleController.isRTL;
        i5Var.c(aVar);
        TL_iv.PageBlock pageBlock = aVar.f49653b;
        if (!(pageBlock instanceof TL_iv.pageBlockTable)) {
            return;
        }
        z5 z5Var = new z5((TL_iv.pageBlockTable) pageBlock);
        i5Var.C = z5Var;
        k5Var.setModel(z5Var);
        LinkedHashSet linkedHashSet = i5Var.E;
        Objects.requireNonNull(linkedHashSet);
        k5Var.setSelectionProvider(new sf.h(linkedHashSet, 20));
        i5Var.y();
        e1 e1Var = i5Var.f49834r;
        a aVar2 = i5Var.f50211a;
        if (aVar2 != null) {
            TL_iv.PageBlock pageBlock2 = aVar2.f49653b;
            if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock2;
                if (pageblocktable.title == null) {
                    pageblocktable.title = new TL_iv.textEmpty();
                }
                String l10 = x5.l(pageblocktable.title);
                SpannableStringBuilder r10 = x5.r(pageblocktable.title, null, true);
                a aVar3 = i5Var.f50211a;
                if (!aVar3.f49668s) {
                    aVar3.f49668s = true;
                    if (r10.length() != 0 && (x5.q(0, r10.length(), r10) & 1) == 0) {
                        z11 = false;
                    }
                    aVar3.f49667r = z11;
                }
                e1Var.setAutoBold(i5Var.f50211a.f49667r);
                if (z10 || !String.valueOf(e1Var.getText()).equals(l10)) {
                    e1Var.setTextSilently(Emoji.replaceEmoji(r10, e1Var.getPaint().getFontMetricsInt(), false));
                    e1Var.invalidateEffects();
                }
            }
        }
        i5Var.e();
        i5Var.f49836w.requestLayout();
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, g6 g6Var) {
        i5 i5Var = new i5(context, g6Var);
        i5Var.setBackground(new w1(k6.v0(k6.f21661d6, g6Var)));
        return i5Var;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
