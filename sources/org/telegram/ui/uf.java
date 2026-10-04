package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class uf implements Utilities.CallbackReturn {
    public final int f41166a;
    public final Object f41167b;
    public final Object f41168c;

    public uf(int i10, Object obj, Object obj2) {
        this.f41166a = i10;
        this.f41167b = obj;
        this.f41168c = obj2;
    }

    @Override
    public final Object run(Object obj) {
        org.telegram.ui.Cells.u1 u1Var;
        switch (this.f41166a) {
            case 0:
                yn ynVar = (yn) this.f41167b;
                View view = (View) this.f41168c;
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
                return rh.c.d((View) obj, (String) this.f41167b, (String) this.f41168c, null, null);
        }
    }
}
