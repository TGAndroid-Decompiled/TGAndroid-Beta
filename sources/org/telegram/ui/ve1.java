package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ve1 extends org.telegram.ui.Components.vm0 {
    public final ArrayList f42771c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public ue1 f42772e;
    public int f42773f;
    public final we1 h;

    public ve1(we1 we1Var) {
        this.h = we1Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.f42771c.size();
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        ArrayList arrayList = this.f42771c;
        TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i10);
        String str = (String) this.d.get(i10);
        org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) d1Var.f47889a;
        String str2 = chat.title;
        boolean z10 = true;
        if (i10 == arrayList.size() - 1) {
            z10 = false;
        }
        g4Var.e(chat, str2, str, z10);
        g4Var.c(this.h.f43153w.contains(Long.valueOf(chat.f19802id)), false);
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        return new s4.d1(new org.telegram.ui.Cells.g4(1, 0, viewGroup.getContext(), false));
    }
}
