package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import org.telegram.messenger.Emoji;
public final class wt extends org.telegram.ui.Components.rl0 {
    public final Context f39790c;
    public Timer d;
    public ArrayList e;
    public final ArrayList f39791f = new ArrayList();
    public final yt h;

    public wt(yt ytVar, Context context, HashMap hashMap) {
        this.h = ytVar;
        this.f39790c = context;
        for (List<st> list : hashMap.values()) {
            for (st stVar : list) {
                this.f39791f.add(stVar);
            }
        }
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
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
    public final void v(f2.l1 l1Var, int i10) {
        String str;
        st stVar = (st) this.e.get(i10);
        org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) l1Var.f5785a;
        CharSequence replaceEmoji = Emoji.replaceEmoji(yt.V(stVar), aaVar.getTextView().getPaint().getFontMetricsInt(), false);
        if (this.h.h) {
            str = "+" + stVar.f38437c;
        } else {
            str = null;
        }
        aaVar.c(replaceEmoji, str, false, false);
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        return new f2.l1(yt.U(this.f39790c));
    }
}
