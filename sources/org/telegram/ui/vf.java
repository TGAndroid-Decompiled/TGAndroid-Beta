package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class vf implements Utilities.CallbackReturn {
    public final int f43036a;
    public final Object f43037b;
    public final Object f43038c;

    public vf(int i10, Object obj, Object obj2) {
        this.f43036a = i10;
        this.f43037b = obj;
        this.f43038c = obj2;
    }

    @Override
    public final Object run(Object obj) {
        org.telegram.ui.Cells.u1 u1Var;
        switch (this.f43036a) {
            case 0:
                zn znVar = (zn) this.f43037b;
                View view = (View) this.f43038c;
                URLSpan uRLSpan = (URLSpan) obj;
                MessageObject messageObject = znVar.f44778d5;
                if (view instanceof org.telegram.ui.Cells.u1) {
                    u1Var = (org.telegram.ui.Cells.u1) view;
                } else {
                    u1Var = null;
                }
                znVar.X7(uRLSpan, false, messageObject, u1Var);
                return Boolean.TRUE;
            default:
                return rh.c.d((View) obj, (String) this.f43037b, (String) this.f43038c, null, null);
        }
    }
}
