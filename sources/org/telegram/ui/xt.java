package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import org.telegram.messenger.Emoji;
public final class xt extends org.telegram.ui.Components.yl0 {
    public final Context f42941c;
    public Timer d;
    public ArrayList f42942e;
    public final ArrayList f42943f = new ArrayList();
    public final zt h;

    public xt(zt ztVar, Context context, HashMap hashMap) {
        this.h = ztVar;
        this.f42941c = context;
        for (List<ut> list : hashMap.values()) {
            for (ut utVar : list) {
                this.f42943f.add(utVar);
            }
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f42942e;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final int j(int i10) {
        return 0;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        String str;
        ut utVar = (ut) this.f42942e.get(i10);
        org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) c1Var.f46523a;
        CharSequence replaceEmoji = Emoji.replaceEmoji(zt.T(utVar), eaVar.getTextView().getPaint().getFontMetricsInt(), false);
        if (this.h.h) {
            str = "+" + utVar.f41299c;
        } else {
            str = null;
        }
        eaVar.c(replaceEmoji, str, false, false);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(zt.S(this.f42941c));
    }
}
