package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class wf implements Utilities.CallbackReturn {
    public final int f43610a;
    public final Object f43611b;
    public final Object f43612c;

    public wf(int i10, Object obj, Object obj2) {
        this.f43610a = i10;
        this.f43611b = obj;
        this.f43612c = obj2;
    }

    @Override
    public final Object run(Object obj) {
        org.telegram.ui.Cells.u1 u1Var;
        switch (this.f43610a) {
            case 0:
                zn znVar = (zn) this.f43611b;
                View view = (View) this.f43612c;
                URLSpan uRLSpan = (URLSpan) obj;
                MessageObject messageObject = znVar.f44789d5;
                if (view instanceof org.telegram.ui.Cells.u1) {
                    u1Var = (org.telegram.ui.Cells.u1) view;
                } else {
                    u1Var = null;
                }
                znVar.X7(uRLSpan, false, messageObject, u1Var);
                return Boolean.TRUE;
            default:
                return rh.c.d((View) obj, (String) this.f43611b, (String) this.f43612c, null, null);
        }
    }
}
