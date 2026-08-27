package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import org.telegram.messenger.Emoji;

public final class rt extends org.telegram.ui.Components.yk0 {

    public final Context f42326c;
    public Timer d;

    public ArrayList f42327e;

    public final ArrayList f42328f = new ArrayList();
    public final tt h;

    public rt(tt ttVar, Context context, HashMap map) {
        this.h = ttVar;
        this.f42326c = context;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                this.f42328f.add((nt) it2.next());
            }
        }
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f42327e;
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
    public final void v(f2.o1 o1Var, int i10) {
        String str;
        nt ntVar = (nt) this.f42327e.get(i10);
        org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) o1Var.f5789a;
        CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(tt.V(ntVar), x9Var.getTextView().getPaint().getFontMetricsInt(), false);
        if (this.h.h) {
            str = "+" + ntVar.f40917c;
        } else {
            str = null;
        }
        x9Var.c(charSequenceReplaceEmoji, str, false, false);
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        return new org.telegram.ui.Components.lk0(tt.U(this.f42326c));
    }
}
