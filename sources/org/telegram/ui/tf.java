package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class tf implements Utilities.CallbackReturn {
    public final int f38180a;
    public final Object f38181b;
    public final Object f38182c;

    public tf(int i10, Object obj, Object obj2) {
        this.f38180a = i10;
        this.f38181b = obj;
        this.f38182c = obj2;
    }

    @Override
    public final Object run(Object obj) {
        org.telegram.ui.Cells.u1 u1Var;
        switch (this.f38180a) {
            case 0:
                wn wnVar = (wn) this.f38181b;
                View view = (View) this.f38182c;
                URLSpan uRLSpan = (URLSpan) obj;
                MessageObject messageObject = wnVar.f39545d5;
                if (view instanceof org.telegram.ui.Cells.u1) {
                    u1Var = (org.telegram.ui.Cells.u1) view;
                } else {
                    u1Var = null;
                }
                wnVar.U7(uRLSpan, false, messageObject, u1Var);
                return Boolean.TRUE;
            default:
                return rh.c.d((View) obj, (String) this.f38181b, (String) this.f38182c, null, null);
        }
    }
}
