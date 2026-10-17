package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_chatlists;
public final class qz implements Utilities.Callback {
    public final int f40532a;
    public final p00 f40533b;

    public qz(p00 p00Var, int i10) {
        this.f40532a = i10;
        this.f40533b = p00Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f40532a) {
            case 0:
                Boolean bool = (Boolean) obj;
                this.f40533b.finishFragment();
                return;
            case 1:
                this.f40533b.m0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
            default:
                this.f40533b.l0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
        }
    }
}
