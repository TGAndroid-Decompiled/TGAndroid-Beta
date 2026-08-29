package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_chatlists;
public final class qz implements Utilities.Callback {
    public final int f41814a;
    public final p00 f41815b;

    public qz(p00 p00Var, int i10) {
        this.f41814a = i10;
        this.f41815b = p00Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f41814a) {
            case 0:
                Boolean bool = (Boolean) obj;
                this.f41815b.finishFragment();
                return;
            case 1:
                this.f41815b.m0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
            default:
                this.f41815b.l0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
        }
    }
}
