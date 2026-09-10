package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class we1 extends org.telegram.ui.Components.ul0 {
    public final ArrayList f37842c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public ve1 e;
    public int f37843f;
    public final xe1 h;

    public we1(xe1 xe1Var) {
        this.h = xe1Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.f37842c.size();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        ArrayList arrayList = this.f37842c;
        TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i10);
        String str = (String) this.d.get(i10);
        org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) c1Var.f41610a;
        String str2 = chat.title;
        boolean z10 = true;
        if (i10 == arrayList.size() - 1) {
            z10 = false;
        }
        g4Var.e(chat, str2, str, z10);
        g4Var.c(this.h.f38701w.contains(Long.valueOf(chat.f17195id)), false);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new org.telegram.ui.Cells.g4(viewGroup.getContext(), 1, 0, false));
    }
}
