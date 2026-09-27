package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class wf implements Utilities.CallbackReturn {
    public final int f39254a;
    public final Object f39255b;
    public final Object f39256c;

    public wf(int i10, Object obj, Object obj2) {
        this.f39254a = i10;
        this.f39255b = obj;
        this.f39256c = obj2;
    }

    @Override
    public final Object run(Object obj) {
        org.telegram.ui.Cells.u1 u1Var;
        switch (this.f39254a) {
            case 0:
                xn xnVar = (xn) this.f39255b;
                View view = (View) this.f39256c;
                URLSpan uRLSpan = (URLSpan) obj;
                MessageObject messageObject = xnVar.f39733d5;
                if (view instanceof org.telegram.ui.Cells.u1) {
                    u1Var = (org.telegram.ui.Cells.u1) view;
                } else {
                    u1Var = null;
                }
                xnVar.U7(uRLSpan, false, messageObject, u1Var);
                return Boolean.TRUE;
            default:
                return rh.c.d((View) obj, (String) this.f39255b, (String) this.f39256c, null, null);
        }
    }
}
