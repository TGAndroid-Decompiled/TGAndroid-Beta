package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import org.telegram.messenger.Emoji;
public final class yt extends org.telegram.ui.Components.ql0 {
    public final Context f40325c;
    public Timer d;
    public ArrayList e;
    public final ArrayList f40326f = new ArrayList();
    public final au h;

    public yt(au auVar, Context context, HashMap hashMap) {
        this.h = auVar;
        this.f40325c = context;
        for (List<ut> list : hashMap.values()) {
            for (ut utVar : list) {
                this.f40326f.add(utVar);
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
        ut utVar = (ut) this.e.get(i10);
        org.telegram.ui.Cells.z9 z9Var = (org.telegram.ui.Cells.z9) l1Var.f5774a;
        CharSequence replaceEmoji = Emoji.replaceEmoji(au.V(utVar), z9Var.getTextView().getPaint().getFontMetricsInt(), false);
        if (this.h.h) {
            str = "+" + utVar.f38915c;
        } else {
            str = null;
        }
        z9Var.c(replaceEmoji, str, false, false);
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        return new f2.l1(au.U(this.f40325c));
    }
}
