package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class wf implements Utilities.CallbackReturn {
    public final int f39137a;
    public final Object f39138b;
    public final Object f39139c;

    public wf(int i10, Object obj, Object obj2) {
        this.f39137a = i10;
        this.f39138b = obj;
        this.f39139c = obj2;
    }

    @Override
    public final Object run(Object obj) {
        org.telegram.ui.Cells.u1 u1Var;
        switch (this.f39137a) {
            case 0:
                zn znVar = (zn) this.f39138b;
                View view = (View) this.f39139c;
                URLSpan uRLSpan = (URLSpan) obj;
                MessageObject messageObject = znVar.f40286d5;
                if (view instanceof org.telegram.ui.Cells.u1) {
                    u1Var = (org.telegram.ui.Cells.u1) view;
                } else {
                    u1Var = null;
                }
                znVar.U7(uRLSpan, false, messageObject, u1Var);
                return Boolean.TRUE;
            default:
                return rh.c.d((View) obj, (String) this.f39138b, (String) this.f39139c, null, null);
        }
    }
}
