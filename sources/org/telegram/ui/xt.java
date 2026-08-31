package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import org.telegram.messenger.Emoji;
public final class xt extends org.telegram.ui.Components.sl0 {
    public final Context f43456c;
    public Timer d;
    public ArrayList f43457e;
    public final ArrayList f43458f = new ArrayList();
    public final zt h;

    public xt(zt ztVar, Context context, HashMap hashMap) {
        this.h = ztVar;
        this.f43456c = context;
        for (List<tt> list : hashMap.values()) {
            for (tt ttVar : list) {
                this.f43458f.add(ttVar);
            }
        }
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f43457e;
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
    public final void v(f2.m1 m1Var, int i10) {
        String str;
        tt ttVar = (tt) this.f43457e.get(i10);
        org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) m1Var.f5875a;
        CharSequence replaceEmoji = Emoji.replaceEmoji(zt.V(ttVar), aaVar.getTextView().getPaint().getFontMetricsInt(), false);
        if (this.h.h) {
            str = "+" + ttVar.f41705c;
        } else {
            str = null;
        }
        aaVar.c(replaceEmoji, str, false, false);
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        return new f2.m1(zt.U(this.f43456c));
    }
}
