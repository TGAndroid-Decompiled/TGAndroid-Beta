package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import org.telegram.messenger.Emoji;
public final class zt extends org.telegram.ui.Components.kl0 {
    public final Context f43539c;
    public Timer d;
    public ArrayList f43540e;
    public final ArrayList f43541f = new ArrayList();
    public final bu h;

    public zt(bu buVar, Context context, HashMap hashMap) {
        this.h = buVar;
        this.f43539c = context;
        for (List<vt> list : hashMap.values()) {
            for (vt vtVar : list) {
                this.f43541f.add(vtVar);
            }
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f43540e;
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
        vt vtVar = (vt) this.f43540e.get(i10);
        org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) c1Var.f45766a;
        CharSequence replaceEmoji = Emoji.replaceEmoji(bu.V(vtVar), eaVar.getTextView().getPaint().getFontMetricsInt(), false);
        if (this.h.h) {
            str = "+" + vtVar.f41722c;
        } else {
            str = null;
        }
        eaVar.c(replaceEmoji, str, false, false);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(bu.U(this.f43539c));
    }
}
