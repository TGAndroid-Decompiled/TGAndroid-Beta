package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_chatlists;
public final class qz implements Utilities.Callback {
    public final int f40557a;
    public final p00 f40558b;

    public qz(p00 p00Var, int i10) {
        this.f40557a = i10;
        this.f40558b = p00Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f40557a) {
            case 0:
                Boolean bool = (Boolean) obj;
                this.f40558b.finishFragment();
                return;
            case 1:
                this.f40558b.m0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
            default:
                this.f40558b.l0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
        }
    }
}
