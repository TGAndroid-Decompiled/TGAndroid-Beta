package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class tf implements Utilities.CallbackReturn {
    public final int f38070a;
    public final Object f38071b;
    public final Object f38072c;

    public tf(int i10, Object obj, Object obj2) {
        this.f38070a = i10;
        this.f38071b = obj;
        this.f38072c = obj2;
    }

    @Override
    public final Object run(Object obj) {
        org.telegram.ui.Cells.u1 u1Var;
        switch (this.f38070a) {
            case 0:
                wn wnVar = (wn) this.f38071b;
                View view = (View) this.f38072c;
                URLSpan uRLSpan = (URLSpan) obj;
                MessageObject messageObject = wnVar.f39452d5;
                if (view instanceof org.telegram.ui.Cells.u1) {
                    u1Var = (org.telegram.ui.Cells.u1) view;
                } else {
                    u1Var = null;
                }
                wnVar.U7(uRLSpan, false, messageObject, u1Var);
                return Boolean.TRUE;
            default:
                return rh.c.d((View) obj, (String) this.f38071b, (String) this.f38072c, null, null);
        }
    }
}
