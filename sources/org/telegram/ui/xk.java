package org.telegram.ui;

import android.app.Activity;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;
public final class xk extends UndoView {
    public final qn f44535b0;

    public xk(qn qnVar, Activity activity, qn qnVar2, org.telegram.ui.ActionBar.b6 b6Var) {
        super(activity, qnVar2, true, b6Var);
        this.f44535b0 = qnVar;
    }

    @Override
    public final void b(CharacterStyle characterStyle) {
        this.f44535b0.U7(characterStyle, false, null, null);
    }

    @Override
    public final void k(long j10, int i9, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        float f10;
        int i10;
        vj vjVar = this.f44535b0.T1;
        if (vjVar != null && (((i10 = vjVar.P) == 1 || i10 == 3) && vjVar.O)) {
            f10 = AndroidUtilities.dp(vjVar.getStyleHeight());
        } else {
            f10 = 0.0f;
        }
        setAdditionalTranslationY(f10);
        super.k(j10, i9, obj, obj2, runnable, runnable2);
    }
}
