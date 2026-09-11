package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class vf implements Utilities.CallbackReturn {
    public final int f41528a;
    public final Object f41529b;
    public final Object f41530c;

    public vf(int i10, Object obj, Object obj2) {
        this.f41528a = i10;
        this.f41529b = obj;
        this.f41530c = obj2;
    }

    @Override
    public final Object run(Object obj) {
        org.telegram.ui.Cells.t1 t1Var;
        switch (this.f41528a) {
            case 0:
                co coVar = (co) this.f41529b;
                View view = (View) this.f41530c;
                URLSpan uRLSpan = (URLSpan) obj;
                MessageObject messageObject = coVar.f35229d5;
                if (view instanceof org.telegram.ui.Cells.t1) {
                    t1Var = (org.telegram.ui.Cells.t1) view;
                } else {
                    t1Var = null;
                }
                coVar.U7(uRLSpan, false, messageObject, t1Var);
                return Boolean.TRUE;
            default:
                return sh.c.d((View) obj, (String) this.f41529b, (String) this.f41530c, null, null);
        }
    }
}
