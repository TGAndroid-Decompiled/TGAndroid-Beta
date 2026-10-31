package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
public final class rf implements org.telegram.messenger.r20 {
    public final int f41211a;
    public final Object f41212b;
    public final Object f41213c;

    public rf(int i10, Object obj, Object obj2) {
        this.f41211a = i10;
        this.f41212b = obj;
        this.f41213c = obj2;
    }

    @Override
    public final Object a(Object obj) {
        org.telegram.ui.Cells.q1 q1Var;
        switch (this.f41211a) {
            case 0:
                un unVar = (un) this.f41212b;
                View view = (View) this.f41213c;
                URLSpan uRLSpan = (URLSpan) obj;
                org.telegram.messenger.jj jjVar = unVar.f42421t5;
                if (view instanceof org.telegram.ui.Cells.q1) {
                    q1Var = (org.telegram.ui.Cells.q1) view;
                } else {
                    q1Var = null;
                }
                unVar.c8(uRLSpan, false, jjVar, q1Var);
                return Boolean.TRUE;
            default:
                return jh.c.d((View) obj, (String) this.f41212b, (String) this.f41213c, null, null);
        }
    }
}
