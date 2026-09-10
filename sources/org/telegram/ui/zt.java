package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import org.telegram.messenger.Emoji;
public final class zt extends org.telegram.ui.Components.ul0 {
    public final Context f39439c;
    public Timer d;
    public ArrayList e;
    public final ArrayList f39440f = new ArrayList();
    public final bu h;

    public zt(bu buVar, Context context, HashMap hashMap) {
        this.h = buVar;
        this.f39439c = context;
        for (List<wt> list : hashMap.values()) {
            for (wt wtVar : list) {
                this.f39440f.add(wtVar);
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
        wt wtVar = (wt) this.e.get(i10);
        org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) c1Var.f41610a;
        CharSequence replaceEmoji = Emoji.replaceEmoji(bu.V(wtVar), gaVar.getTextView().getPaint().getFontMetricsInt(), false);
        if (this.h.h) {
            str = "+" + wtVar.f38388c;
        } else {
            str = null;
        }
        gaVar.c(replaceEmoji, str, false, false);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(bu.U(this.f39439c));
    }
}
