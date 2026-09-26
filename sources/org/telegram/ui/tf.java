package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class tf implements Utilities.CallbackReturn {
    public final int f38069a;
    public final Object f38070b;
    public final Object f38071c;

    public tf(int i10, Object obj, Object obj2) {
        this.f38069a = i10;
        this.f38070b = obj;
        this.f38071c = obj2;
    }

    @Override
    public final Object run(Object obj) {
        org.telegram.ui.Cells.u1 u1Var;
        switch (this.f38069a) {
            case 0:
                wn wnVar = (wn) this.f38070b;
                View view = (View) this.f38071c;
                URLSpan uRLSpan = (URLSpan) obj;
                MessageObject messageObject = wnVar.f39451d5;
                if (view instanceof org.telegram.ui.Cells.u1) {
                    u1Var = (org.telegram.ui.Cells.u1) view;
                } else {
                    u1Var = null;
                }
                wnVar.U7(uRLSpan, false, messageObject, u1Var);
                return Boolean.TRUE;
            default:
                return rh.c.d((View) obj, (String) this.f38070b, (String) this.f38071c, null, null);
        }
    }
}
