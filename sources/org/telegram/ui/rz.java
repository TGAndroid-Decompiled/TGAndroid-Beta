package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_chatlists;
public final class rz implements Utilities.Callback {
    public final int f41254a;
    public final q00 f41255b;

    public rz(q00 q00Var, int i10) {
        this.f41254a = i10;
        this.f41255b = q00Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f41254a) {
            case 0:
                Boolean bool = (Boolean) obj;
                this.f41255b.finishFragment();
                return;
            case 1:
                this.f41255b.m0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
            default:
                this.f41255b.l0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
        }
    }
}
