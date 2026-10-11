package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import org.telegram.messenger.Emoji;
public final class wt extends org.telegram.ui.Components.rm0 {
    public final Context f43871c;
    public Timer d;
    public ArrayList f43872e;
    public final ArrayList f43873f = new ArrayList();
    public final yt h;

    public wt(yt ytVar, Context context, HashMap hashMap) {
        this.h = ytVar;
        this.f43871c = context;
        for (List<tt> list : hashMap.values()) {
            for (tt ttVar : list) {
                this.f43873f.add(ttVar);
            }
        }
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f43872e;
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
        tt ttVar = (tt) this.f43872e.get(i10);
        org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) d1Var.f47748a;
        CharSequence replaceEmoji = Emoji.replaceEmoji(yt.V(ttVar), caVar.getTextView().getPaint().getFontMetricsInt(), false);
        if (this.h.h) {
            str = "+" + ttVar.f42261c;
        } else {
            str = null;
        }
        caVar.c(replaceEmoji, str, false, false);
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        return new s4.d1(yt.U(this.f43871c));
    }
}
