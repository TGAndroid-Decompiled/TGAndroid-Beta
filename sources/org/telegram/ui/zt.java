package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import org.telegram.messenger.Emoji;
public final class zt extends org.telegram.ui.Components.ul0 {
    public final Context f40599c;
    public Timer d;
    public ArrayList e;
    public final ArrayList f40600f = new ArrayList();
    public final bu h;

    public zt(bu buVar, Context context, HashMap hashMap) {
        this.h = buVar;
        this.f40599c = context;
        for (List<vt> list : hashMap.values()) {
            for (vt vtVar : list) {
                this.f40600f.add(vtVar);
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
        org.telegram.ui.Cells.fa faVar = (org.telegram.ui.Cells.fa) c1Var.f42974a;
        CharSequence replaceEmoji = Emoji.replaceEmoji(bu.V(vtVar), faVar.getTextView().getPaint().getFontMetricsInt(), false);
        if (this.h.h) {
            str = "+" + vtVar.f38599c;
        } else {
            str = null;
        }
        faVar.c(replaceEmoji, str, false, false);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(bu.U(this.f40599c));
    }
}
