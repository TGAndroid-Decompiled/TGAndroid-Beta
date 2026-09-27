package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import org.telegram.messenger.Emoji;
public final class wt extends org.telegram.ui.Components.xl0 {
    public final Context f39456c;
    public Timer d;
    public ArrayList e;
    public final ArrayList f39457f = new ArrayList();
    public final yt h;

    public wt(yt ytVar, Context context, HashMap hashMap) {
        this.h = ytVar;
        this.f39456c = context;
        for (List<tt> list : hashMap.values()) {
            for (tt ttVar : list) {
                this.f39457f.add(ttVar);
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
        tt ttVar = (tt) this.e.get(i10);
        org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) c1Var.f43005a;
        CharSequence replaceEmoji = Emoji.replaceEmoji(yt.V(ttVar), eaVar.getTextView().getPaint().getFontMetricsInt(), false);
        if (this.h.h) {
            str = "+" + ttVar.f37910c;
        } else {
            str = null;
        }
        eaVar.c(replaceEmoji, str, false, false);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(yt.U(this.f39456c));
    }
}
