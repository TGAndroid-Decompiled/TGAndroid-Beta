package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class xf implements Utilities.CallbackReturn {
    public final int f39610a;
    public final Object f39611b;
    public final Object f39612c;

    public xf(int i10, Object obj, Object obj2) {
        this.f39610a = i10;
        this.f39611b = obj;
        this.f39612c = obj2;
    }

    @Override
    public final Object run(Object obj) {
        org.telegram.ui.Cells.t1 t1Var;
        switch (this.f39610a) {
            case 0:
                bo boVar = (bo) this.f39611b;
                View view = (View) this.f39612c;
                URLSpan uRLSpan = (URLSpan) obj;
                MessageObject messageObject = boVar.f32262d5;
                if (view instanceof org.telegram.ui.Cells.t1) {
                    t1Var = (org.telegram.ui.Cells.t1) view;
                } else {
                    t1Var = null;
                }
                boVar.U7(uRLSpan, false, messageObject, t1Var);
                return Boolean.TRUE;
            default:
                return rh.c.d((View) obj, (String) this.f39611b, (String) this.f39612c, null, null);
        }
    }
}
