package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class uf implements Utilities.CallbackReturn {
    public final int f41172a;
    public final Object f41173b;
    public final Object f41174c;

    public uf(int i10, Object obj, Object obj2) {
        this.f41172a = i10;
        this.f41173b = obj;
        this.f41174c = obj2;
    }

    @Override
    public final Object run(Object obj) {
        org.telegram.ui.Cells.u1 u1Var;
        switch (this.f41172a) {
            case 0:
                yn ynVar = (yn) this.f41173b;
                View view = (View) this.f41174c;
                URLSpan uRLSpan = (URLSpan) obj;
                MessageObject messageObject = ynVar.f43288b5;
                if (view instanceof org.telegram.ui.Cells.u1) {
                    u1Var = (org.telegram.ui.Cells.u1) view;
                } else {
                    u1Var = null;
                }
                ynVar.U7(uRLSpan, false, messageObject, u1Var);
                return Boolean.TRUE;
            default:
                return rh.c.d((View) obj, (String) this.f41173b, (String) this.f41174c, null, null);
        }
    }
}
