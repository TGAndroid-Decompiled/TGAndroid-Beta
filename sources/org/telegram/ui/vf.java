package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class vf implements Utilities.CallbackReturn {
    public final int f38523a;
    public final Object f38524b;
    public final Object f38525c;

    public vf(int i10, Object obj, Object obj2) {
        this.f38523a = i10;
        this.f38524b = obj;
        this.f38525c = obj2;
    }

    @Override
    public final Object run(Object obj) {
        org.telegram.ui.Cells.t1 t1Var;
        switch (this.f38523a) {
            case 0:
                bo boVar = (bo) this.f38524b;
                View view = (View) this.f38525c;
                URLSpan uRLSpan = (URLSpan) obj;
                MessageObject messageObject = boVar.f32276d5;
                if (view instanceof org.telegram.ui.Cells.t1) {
                    t1Var = (org.telegram.ui.Cells.t1) view;
                } else {
                    t1Var = null;
                }
                boVar.U7(uRLSpan, false, messageObject, t1Var);
                return Boolean.TRUE;
            default:
                return rh.c.d((View) obj, (String) this.f38524b, (String) this.f38525c, null, null);
        }
    }
}
