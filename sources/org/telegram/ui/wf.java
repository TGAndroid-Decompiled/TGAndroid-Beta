package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class wf implements Utilities.CallbackReturn {
    public final int f43566a;
    public final Object f43567b;
    public final Object f43568c;

    public wf(int i10, Object obj, Object obj2) {
        this.f43566a = i10;
        this.f43567b = obj;
        this.f43568c = obj2;
    }

    @Override
    public final Object run(Object obj) {
        org.telegram.ui.Cells.u1 u1Var;
        switch (this.f43566a) {
            case 0:
                zn znVar = (zn) this.f43567b;
                View view = (View) this.f43568c;
                URLSpan uRLSpan = (URLSpan) obj;
                MessageObject messageObject = znVar.f44745d5;
                if (view instanceof org.telegram.ui.Cells.u1) {
                    u1Var = (org.telegram.ui.Cells.u1) view;
                } else {
                    u1Var = null;
                }
                znVar.X7(uRLSpan, false, messageObject, u1Var);
                return Boolean.TRUE;
            default:
                return rh.c.d((View) obj, (String) this.f43567b, (String) this.f43568c, null, null);
        }
    }
}
