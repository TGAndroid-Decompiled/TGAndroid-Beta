package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class vf implements Utilities.CallbackReturn {
    public final int f41555a;
    public final Object f41556b;
    public final Object f41557c;

    public vf(int i10, Object obj, Object obj2) {
        this.f41555a = i10;
        this.f41556b = obj;
        this.f41557c = obj2;
    }

    @Override
    public final Object run(Object obj) {
        org.telegram.ui.Cells.t1 t1Var;
        switch (this.f41555a) {
            case 0:
                co coVar = (co) this.f41556b;
                View view = (View) this.f41557c;
                URLSpan uRLSpan = (URLSpan) obj;
                MessageObject messageObject = coVar.f35256d5;
                if (view instanceof org.telegram.ui.Cells.t1) {
                    t1Var = (org.telegram.ui.Cells.t1) view;
                } else {
                    t1Var = null;
                }
                coVar.U7(uRLSpan, false, messageObject, t1Var);
                return Boolean.TRUE;
            default:
                return sh.c.d((View) obj, (String) this.f41556b, (String) this.f41557c, null, null);
        }
    }
}
