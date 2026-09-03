package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class rf implements Utilities.CallbackReturn {
    public final int f37822a;
    public final Object f37823b;
    public final Object f37824c;

    public rf(int i10, Object obj, Object obj2) {
        this.f37822a = i10;
        this.f37823b = obj;
        this.f37824c = obj2;
    }

    @Override
    public final Object run(Object obj) {
        org.telegram.ui.Cells.s1 s1Var;
        switch (this.f37822a) {
            case 0:
                zn znVar = (zn) this.f37823b;
                View view = (View) this.f37824c;
                URLSpan uRLSpan = (URLSpan) obj;
                MessageObject messageObject = znVar.f40515a5;
                if (view instanceof org.telegram.ui.Cells.s1) {
                    s1Var = (org.telegram.ui.Cells.s1) view;
                } else {
                    s1Var = null;
                }
                znVar.U7(uRLSpan, false, messageObject, s1Var);
                return Boolean.TRUE;
            default:
                return eh.c.d((View) obj, (String) this.f37823b, (String) this.f37824c, null, null);
        }
    }
}
