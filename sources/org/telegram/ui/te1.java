package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class te1 extends org.telegram.ui.Components.pm0 {
    public final ArrayList f41990c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public se1 f41991e;
    public int f41992f;
    public final ue1 h;

    public te1(ue1 ue1Var) {
        this.h = ue1Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.f41990c.size();
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        ArrayList arrayList = this.f41990c;
        TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i10);
        String str = (String) this.d.get(i10);
        org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) d1Var.f47656a;
        String str2 = chat.title;
        boolean z10 = true;
        if (i10 == arrayList.size() - 1) {
            z10 = false;
        }
        g4Var.e(chat, str2, str, z10);
        g4Var.c(this.h.f42418w.contains(Long.valueOf(chat.f20038id)), false);
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        return new s4.d1(new org.telegram.ui.Cells.g4(1, 0, viewGroup.getContext(), false));
    }
}
