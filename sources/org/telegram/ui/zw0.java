package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.GenericProvider;

public final class zw0 implements GenericProvider, org.telegram.ui.Components.rk0, k60 {

    public final cx0 f45269a;

    public zw0(cx0 cx0Var) {
        this.f45269a = cx0Var;
    }

    @Override
    public boolean a(int i10, View view) {
        cx0 cx0Var = this.f45269a;
        if (i10 < cx0Var.f37186r || i10 >= cx0Var.f37187s) {
            return false;
        }
        if (cx0Var.f37190y != 1) {
            throw null;
        }
        cx0Var.U(Long.valueOf(cx0Var.getMessagesController().blockePeers.keyAt(i10 - cx0Var.f37186r)), view);
        return true;
    }

    @Override
    public void b(ArrayList arrayList, boolean z10, boolean z11) {
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw null;
        }
        this.f45269a.V();
    }

    @Override
    public Object provide(Object obj) {
        cx0 cx0Var = this.f45269a;
        cx0Var.getClass();
        if (((Integer) obj).intValue() == cx0Var.f37188w) {
            return Integer.valueOf(org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23269p7, false)));
        }
        return null;
    }
}
