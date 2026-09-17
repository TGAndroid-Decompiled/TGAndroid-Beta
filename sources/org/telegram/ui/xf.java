package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class xf implements Utilities.CallbackReturn {
    public final int f39605a;
    public final Object f39606b;
    public final Object f39607c;

    public xf(int i10, Object obj, Object obj2) {
        this.f39605a = i10;
        this.f39606b = obj;
        this.f39607c = obj2;
    }

    @Override
    public final Object run(Object obj) {
        org.telegram.ui.Cells.t1 t1Var;
        switch (this.f39605a) {
            case 0:
                bo boVar = (bo) this.f39606b;
                View view = (View) this.f39607c;
                URLSpan uRLSpan = (URLSpan) obj;
                MessageObject messageObject = boVar.f32258d5;
                if (view instanceof org.telegram.ui.Cells.t1) {
                    t1Var = (org.telegram.ui.Cells.t1) view;
                } else {
                    t1Var = null;
                }
                boVar.U7(uRLSpan, false, messageObject, t1Var);
                return Boolean.TRUE;
            default:
                return rh.c.d((View) obj, (String) this.f39606b, (String) this.f39607c, null, null);
        }
    }
}
