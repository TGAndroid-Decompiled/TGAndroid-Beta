package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_chatlists;
public final class qz implements Utilities.Callback {
    public final int f40523a;
    public final p00 f40524b;

    public qz(p00 p00Var, int i10) {
        this.f40523a = i10;
        this.f40524b = p00Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f40523a) {
            case 0:
                Boolean bool = (Boolean) obj;
                this.f40524b.finishFragment();
                return;
            case 1:
                this.f40524b.m0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
            default:
                this.f40524b.l0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
        }
    }
}
