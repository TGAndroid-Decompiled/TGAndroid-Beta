package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.GenericProvider;
public final class xx0 implements GenericProvider, org.telegram.ui.Components.ol0, y60 {
    public final ay0 f40062a;

    public xx0(ay0 ay0Var) {
        this.f40062a = ay0Var;
    }

    @Override
    public void b(ArrayList arrayList, boolean z10, boolean z11) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            this.f40062a.V();
        } else {
            Long l4 = (Long) it.next();
            throw null;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        ay0 ay0Var = this.f40062a;
        if (i10 >= ay0Var.f32179r && i10 < ay0Var.f32180s) {
            if (ay0Var.f32183y == 1) {
                ay0Var.U(Long.valueOf(ay0Var.getMessagesController().blockePeers.keyAt(i10 - ay0Var.f32179r)), view);
                return true;
            }
            throw null;
        }
        return false;
    }

    @Override
    public Object provide(Object obj) {
        ay0 ay0Var = this.f40062a;
        ay0Var.getClass();
        if (((Integer) obj).intValue() != ay0Var.f32181w) {
            return null;
        }
        return Integer.valueOf(org.telegram.ui.ActionBar.i6.l1(0.12f, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19278p7, false)));
    }
}
