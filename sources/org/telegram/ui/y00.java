package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;
public final class y00 extends v00 {
    public final z00 E;

    public y00(z00 z00Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10, int i11) {
        super(context, n2Var, i10, i11);
        this.E = z00Var;
    }

    @Override
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        this.E.e.l0(tL_exportedChatlistInvite);
    }
}
