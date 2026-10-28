package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_chatlists;
public final class rz implements Utilities.Callback {
    public final int f43192a;
    public final q00 f43193b;

    public rz(q00 q00Var, int i10) {
        this.f43192a = i10;
        this.f43193b = q00Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43192a) {
            case 0:
                Boolean bool = (Boolean) obj;
                this.f43193b.finishFragment();
                return;
            case 1:
                this.f43193b.o0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
            default:
                this.f43193b.n0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
        }
    }
}
