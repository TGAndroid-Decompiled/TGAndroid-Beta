package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import org.telegram.messenger.Emoji;
public final class yt extends org.telegram.ui.Components.vl0 {
    public final Context f39894c;
    public Timer d;
    public ArrayList e;
    public final ArrayList f39895f = new ArrayList();
    public final au h;

    public yt(au auVar, Context context, HashMap hashMap) {
        this.h = auVar;
        this.f39894c = context;
        for (List<vt> list : hashMap.values()) {
            for (vt vtVar : list) {
                this.f39895f.add(vtVar);
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
        vt vtVar = (vt) this.e.get(i10);
        org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) c1Var.f42929a;
        CharSequence replaceEmoji = Emoji.replaceEmoji(au.V(vtVar), eaVar.getTextView().getPaint().getFontMetricsInt(), false);
        if (this.h.h) {
            str = "+" + vtVar.f38619c;
        } else {
            str = null;
        }
        eaVar.c(replaceEmoji, str, false, false);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(au.U(this.f39894c));
    }
}
