package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import org.telegram.messenger.Emoji;
public final class xt extends org.telegram.ui.Components.qm0 {
    public final Context f44190c;
    public Timer d;
    public ArrayList f44191e;
    public final ArrayList f44192f = new ArrayList();
    public final zt h;

    public xt(zt ztVar, Context context, HashMap hashMap) {
        this.h = ztVar;
        this.f44190c = context;
        for (List<ut> list : hashMap.values()) {
            for (ut utVar : list) {
                this.f44192f.add(utVar);
            }
        }
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f44191e;
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
    public final void v(s4.d1 d1Var, int i10) {
        String str;
        ut utVar = (ut) this.f44191e.get(i10);
        org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) d1Var.f47702a;
        CharSequence replaceEmoji = Emoji.replaceEmoji(zt.V(utVar), caVar.getTextView().getPaint().getFontMetricsInt(), false);
        if (this.h.h) {
            str = "+" + utVar.f42595c;
        } else {
            str = null;
        }
        caVar.c(replaceEmoji, str, false, false);
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        return new s4.d1(zt.U(this.f44190c));
    }
}
