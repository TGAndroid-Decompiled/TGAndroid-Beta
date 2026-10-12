package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ze1 extends org.telegram.ui.Components.lm0 {
    public final ArrayList f42606c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public ye1 e;
    public int f42607f;
    public final af1 h;

    public ze1(af1 af1Var) {
        this.h = af1Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.f42606c.size();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        ArrayList arrayList = this.f42606c;
        TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i10);
        String str = (String) this.d.get(i10);
        org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) b1Var.f44838a;
        String str2 = chat.title;
        boolean z10 = true;
        if (i10 == arrayList.size() - 1) {
            z10 = false;
        }
        g4Var.e(chat, str2, str, z10);
        g4Var.c(this.h.f34206w.contains(Long.valueOf(chat.f19216id)), false);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        return new s4.b1(new org.telegram.ui.Cells.g4(1, 0, viewGroup.getContext(), false));
    }
}
