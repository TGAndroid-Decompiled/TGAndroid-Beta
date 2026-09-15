package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class vf implements Utilities.CallbackReturn {
    public final int f38587a;
    public final Object f38588b;
    public final Object f38589c;

    public vf(int i10, Object obj, Object obj2) {
        this.f38587a = i10;
        this.f38588b = obj;
        this.f38589c = obj2;
    }

    @Override
    public final Object run(Object obj) {
        org.telegram.ui.Cells.t1 t1Var;
        switch (this.f38587a) {
            case 0:
                bo boVar = (bo) this.f38588b;
                View view = (View) this.f38589c;
                URLSpan uRLSpan = (URLSpan) obj;
                MessageObject messageObject = boVar.f32280d5;
                if (view instanceof org.telegram.ui.Cells.t1) {
                    t1Var = (org.telegram.ui.Cells.t1) view;
                } else {
                    t1Var = null;
                }
                boVar.U7(uRLSpan, false, messageObject, t1Var);
                return Boolean.TRUE;
            default:
                return rh.c.d((View) obj, (String) this.f38588b, (String) this.f38589c, null, null);
        }
    }
}
