package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.GenericProvider;
public final class yw0 implements GenericProvider, org.telegram.ui.Components.bl0, i60 {
    public final bx0 f44981a;

    public yw0(bx0 bx0Var) {
        this.f44981a = bx0Var;
    }

    @Override
    public void b(ArrayList arrayList, boolean z10, boolean z11) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            this.f44981a.V();
        } else {
            Long l10 = (Long) it.next();
            throw null;
        }
    }

    @Override
    public boolean c(int i10, View view) {
        bx0 bx0Var = this.f44981a;
        if (i10 >= bx0Var.f36937r && i10 < bx0Var.f36938s) {
            if (bx0Var.f36941y == 1) {
                bx0Var.U(Long.valueOf(bx0Var.getMessagesController().blockePeers.keyAt(i10 - bx0Var.f36937r)), view);
                return true;
            }
            throw null;
        }
        return false;
    }

    @Override
    public Object provide(Object obj) {
        bx0 bx0Var = this.f44981a;
        bx0Var.getClass();
        if (((Integer) obj).intValue() != bx0Var.f36939w) {
            return null;
        }
        return Integer.valueOf(org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23279p7, false)));
    }
}
