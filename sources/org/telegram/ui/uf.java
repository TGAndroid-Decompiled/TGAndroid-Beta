package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class uf implements Utilities.CallbackReturn {
    public final int f41224a;
    public final Object f41225b;
    public final Object f41226c;

    public uf(int i10, Object obj, Object obj2) {
        this.f41224a = i10;
        this.f41225b = obj;
        this.f41226c = obj2;
    }

    @Override
    public final Object run(Object obj) {
        org.telegram.ui.Cells.u1 u1Var;
        switch (this.f41224a) {
            case 0:
                yn ynVar = (yn) this.f41225b;
                View view = (View) this.f41226c;
                URLSpan uRLSpan = (URLSpan) obj;
                MessageObject messageObject = ynVar.f43281b5;
                if (view instanceof org.telegram.ui.Cells.u1) {
                    u1Var = (org.telegram.ui.Cells.u1) view;
                } else {
                    u1Var = null;
                }
                ynVar.U7(uRLSpan, false, messageObject, u1Var);
                return Boolean.TRUE;
            default:
                return rh.c.d((View) obj, (String) this.f41225b, (String) this.f41226c, null, null);
        }
    }
}
