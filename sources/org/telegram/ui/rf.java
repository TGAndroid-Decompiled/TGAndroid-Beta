package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
public final class rf implements org.telegram.messenger.s20 {
    public final int f41078a;
    public final Object f41079b;
    public final Object f41080c;

    public rf(int i10, Object obj, Object obj2) {
        this.f41078a = i10;
        this.f41079b = obj;
        this.f41080c = obj2;
    }

    @Override
    public final Object a(Object obj) {
        org.telegram.ui.Cells.q1 q1Var;
        switch (this.f41078a) {
            case 0:
                un unVar = (un) this.f41079b;
                View view = (View) this.f41080c;
                URLSpan uRLSpan = (URLSpan) obj;
                org.telegram.messenger.kj kjVar = unVar.f42232t5;
                if (view instanceof org.telegram.ui.Cells.q1) {
                    q1Var = (org.telegram.ui.Cells.q1) view;
                } else {
                    q1Var = null;
                }
                unVar.g8(uRLSpan, false, kjVar, q1Var);
                return Boolean.TRUE;
            default:
                return jh.c.d((View) obj, (String) this.f41079b, (String) this.f41080c, null, null);
        }
    }
}
