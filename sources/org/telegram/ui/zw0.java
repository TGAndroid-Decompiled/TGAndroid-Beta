package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.GenericProvider;
public final class zw0 implements GenericProvider, org.telegram.ui.Components.ok0, g60 {
    public final cx0 f45264a;

    public zw0(cx0 cx0Var) {
        this.f45264a = cx0Var;
    }

    @Override
    public boolean a(int i9, View view) {
        cx0 cx0Var = this.f45264a;
        if (i9 >= cx0Var.f37345r && i9 < cx0Var.f37346s) {
            if (cx0Var.f37349y == 1) {
                cx0Var.T(Long.valueOf(cx0Var.getMessagesController().blockePeers.keyAt(i9 - cx0Var.f37345r)), view);
                return true;
            }
            throw null;
        }
        return false;
    }

    @Override
    public void b(ArrayList arrayList, boolean z10, boolean z11) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            this.f45264a.U();
        } else {
            Long l10 = (Long) it.next();
            throw null;
        }
    }

    @Override
    public Object provide(Object obj) {
        cx0 cx0Var = this.f45264a;
        cx0Var.getClass();
        if (((Integer) obj).intValue() != cx0Var.f37347w) {
            return null;
        }
        return Integer.valueOf(org.telegram.ui.ActionBar.f6.l1(0.12f, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23212p7, false)));
    }
}
