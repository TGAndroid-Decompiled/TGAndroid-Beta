package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import org.telegram.messenger.Emoji;
public final class vt extends org.telegram.ui.Components.ll0 {
    public final Context f38475c;
    public Timer d;
    public ArrayList e;
    public final ArrayList f38476f = new ArrayList();
    public final xt h;

    public vt(xt xtVar, Context context, HashMap hashMap) {
        this.h = xtVar;
        this.f38475c = context;
        for (List<st> list : hashMap.values()) {
            for (st stVar : list) {
                this.f38476f.add(stVar);
            }
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.e;
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
        st stVar = (st) this.e.get(i10);
        org.telegram.ui.Cells.fa faVar = (org.telegram.ui.Cells.fa) c1Var.f42627a;
        CharSequence replaceEmoji = Emoji.replaceEmoji(xt.V(stVar), faVar.getTextView().getPaint().getFontMetricsInt(), false);
        if (this.h.h) {
            str = "+" + stVar.f37417c;
        } else {
            str = null;
        }
        faVar.c(replaceEmoji, str, false, false);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(xt.U(this.f38475c));
    }
}
