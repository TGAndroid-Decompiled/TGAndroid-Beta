package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class uf implements Utilities.CallbackReturn {
    public final int f38065a;
    public final Object f38066b;
    public final Object f38067c;

    public uf(int i10, Object obj, Object obj2) {
        this.f38065a = i10;
        this.f38066b = obj;
        this.f38067c = obj2;
    }

    @Override
    public final Object run(Object obj) {
        org.telegram.ui.Cells.t1 t1Var;
        switch (this.f38065a) {
            case 0:
                xn xnVar = (xn) this.f38066b;
                View view = (View) this.f38067c;
                URLSpan uRLSpan = (URLSpan) obj;
                MessageObject messageObject = xnVar.f39353d5;
                if (view instanceof org.telegram.ui.Cells.t1) {
                    t1Var = (org.telegram.ui.Cells.t1) view;
                } else {
                    t1Var = null;
                }
                xnVar.U7(uRLSpan, false, messageObject, t1Var);
                return Boolean.TRUE;
            default:
                return rh.c.d((View) obj, (String) this.f38066b, (String) this.f38067c, null, null);
        }
    }
}
