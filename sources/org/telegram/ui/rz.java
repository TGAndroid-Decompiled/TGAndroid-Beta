package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_chatlists;
public final class rz implements Utilities.Callback {
    public final int f41268a;
    public final q00 f41269b;

    public rz(q00 q00Var, int i10) {
        this.f41268a = i10;
        this.f41269b = q00Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f41268a) {
            case 0:
                Boolean bool = (Boolean) obj;
                this.f41269b.finishFragment();
                return;
            case 1:
                this.f41269b.m0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
            default:
                this.f41269b.l0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
        }
    }
}
