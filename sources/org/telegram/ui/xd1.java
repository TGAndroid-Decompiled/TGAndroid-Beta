package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xd1 extends org.telegram.ui.Components.rl0 {
    public final ArrayList f39901c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public wd1 e;
    public int f39902f;
    public final yd1 h;

    public xd1(yd1 yd1Var) {
        this.h = yd1Var;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.f39901c.size();
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        ArrayList arrayList = this.f39901c;
        TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i10);
        String str = (String) this.d.get(i10);
        org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) l1Var.f5785a;
        String str2 = chat.title;
        boolean z4 = true;
        if (i10 == arrayList.size() - 1) {
            z4 = false;
        }
        g4Var.e(chat, str2, str, z4);
        g4Var.c(this.h.f40499w.contains(Long.valueOf(chat.f19184id)), false);
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        return new f2.l1(new org.telegram.ui.Cells.g4(viewGroup.getContext(), 1, 0, false));
    }
}
