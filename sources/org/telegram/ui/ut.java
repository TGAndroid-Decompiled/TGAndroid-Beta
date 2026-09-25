package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import org.telegram.messenger.Emoji;
public final class ut extends org.telegram.ui.Components.vl0 {
    public final Context f38554c;
    public Timer d;
    public ArrayList e;
    public final ArrayList f38555f = new ArrayList();
    public final wt h;

    public ut(wt wtVar, Context context, HashMap hashMap) {
        this.h = wtVar;
        this.f38554c = context;
        for (List<qt> list : hashMap.values()) {
            for (qt qtVar : list) {
                this.f38555f.add(qtVar);
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
        qt qtVar = (qt) this.e.get(i10);
        org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) c1Var.f42961a;
        CharSequence replaceEmoji = Emoji.replaceEmoji(wt.V(qtVar), eaVar.getTextView().getPaint().getFontMetricsInt(), false);
        if (this.h.h) {
            str = "+" + qtVar.f36984c;
        } else {
            str = null;
        }
        eaVar.c(replaceEmoji, str, false, false);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(wt.U(this.f38554c));
    }
}
