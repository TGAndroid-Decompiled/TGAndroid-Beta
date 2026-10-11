package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class vf implements Utilities.CallbackReturn {
    public final int f43002a;
    public final Object f43003b;
    public final Object f43004c;

    public vf(int i10, Object obj, Object obj2) {
        this.f43002a = i10;
        this.f43003b = obj;
        this.f43004c = obj2;
    }

    @Override
    public final Object run(Object obj) {
        org.telegram.ui.Cells.u1 u1Var;
        switch (this.f43002a) {
            case 0:
                zn znVar = (zn) this.f43003b;
                View view = (View) this.f43004c;
                URLSpan uRLSpan = (URLSpan) obj;
                MessageObject messageObject = znVar.f44744d5;
                if (view instanceof org.telegram.ui.Cells.u1) {
                    u1Var = (org.telegram.ui.Cells.u1) view;
                } else {
                    u1Var = null;
                }
                znVar.X7(uRLSpan, false, messageObject, u1Var);
                return Boolean.TRUE;
            default:
                return rh.c.d((View) obj, (String) this.f43003b, (String) this.f43004c, null, null);
        }
    }
}
