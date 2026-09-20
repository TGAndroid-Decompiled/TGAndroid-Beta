package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class te1 extends org.telegram.ui.Components.ul0 {
    public final ArrayList f37741c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public se1 e;
    public int f37742f;
    public final ue1 h;

    public te1(ue1 ue1Var) {
        this.h = ue1Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.f37741c.size();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        ArrayList arrayList = this.f37741c;
        TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i10);
        String str = (String) this.d.get(i10);
        org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) c1Var.f42974a;
        String str2 = chat.title;
        boolean z10 = true;
        if (i10 == arrayList.size() - 1) {
            z10 = false;
        }
        h4Var.e(chat, str2, str, z10);
        h4Var.c(this.h.f38076w.contains(Long.valueOf(chat.f18328id)), false);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new org.telegram.ui.Cells.h4(viewGroup.getContext(), 1, 0, false));
    }
}
