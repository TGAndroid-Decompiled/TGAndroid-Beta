package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;
public final class y00 extends v00 {
    public final z00 B;

    public y00(z00 z00Var, Context context, org.telegram.ui.ActionBar.p2 p2Var, int i10, int i11) {
        super(context, p2Var, i10, i11);
        this.B = z00Var;
    }

    @Override
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        this.B.e.l0(tL_exportedChatlistInvite);
    }
}
