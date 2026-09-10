package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class wf implements Utilities.CallbackReturn {
    public final int f38171a;
    public final Object f38172b;
    public final Object f38173c;

    public wf(int i10, Object obj, Object obj2) {
        this.f38171a = i10;
        this.f38172b = obj;
        this.f38173c = obj2;
    }

    @Override
    public final Object run(Object obj) {
        org.telegram.ui.Cells.t1 t1Var;
        switch (this.f38171a) {
            case 0:
                eo eoVar = (eo) this.f38172b;
                View view = (View) this.f38173c;
                URLSpan uRLSpan = (URLSpan) obj;
                MessageObject messageObject = eoVar.f32299d5;
                if (view instanceof org.telegram.ui.Cells.t1) {
                    t1Var = (org.telegram.ui.Cells.t1) view;
                } else {
                    t1Var = null;
                }
                eoVar.U7(uRLSpan, false, messageObject, t1Var);
                return Boolean.TRUE;
            default:
                return qh.c.d((View) obj, (String) this.f38172b, (String) this.f38173c, null, null);
        }
    }
}
