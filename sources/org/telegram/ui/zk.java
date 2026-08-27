package org.telegram.ui;

import android.app.Activity;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;

public final class zk extends UndoView {

    public final rn f45195b0;

    public zk(rn rnVar, Activity activity, rn rnVar2, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity, rnVar2, true, c6Var);
        this.f45195b0 = rnVar;
    }

    @Override
    public final void b(CharacterStyle characterStyle) {
        this.f45195b0.U7(characterStyle, false, null, null);
    }

    @Override
    public final void k(long j10, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        int i11;
        xj xjVar = this.f45195b0.T1;
        setAdditionalTranslationY((xjVar == null || !(((i11 = xjVar.P) == 1 || i11 == 3) && xjVar.O)) ? 0.0f : AndroidUtilities.dp(xjVar.getStyleHeight()));
        super.k(j10, i10, obj, obj2, runnable, runnable2);
    }
}
