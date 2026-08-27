package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_chatlists;

public final class rz implements Utilities.Callback {

    public final int f42376a;

    public final q00 f42377b;

    public rz(q00 q00Var, int i10) {
        this.f42376a = i10;
        this.f42377b = q00Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f42376a) {
            case 0:
                this.f42377b.finishFragment();
                break;
            case 1:
                this.f42377b.m0((TL_chatlists.TL_exportedChatlistInvite) obj);
                break;
            default:
                this.f42377b.l0((TL_chatlists.TL_exportedChatlistInvite) obj);
                break;
        }
    }
}
