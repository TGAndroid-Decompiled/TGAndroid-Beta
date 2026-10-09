package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class zd extends org.telegram.ui.Components.zd0 {
    public final int L;
    public final Object M;

    public zd(Object obj, Context context, int i10) {
        super(context, null);
        this.L = i10;
        this.M = obj;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.L) {
            case 0:
                ke keVar = (ke) this.M;
                org.telegram.ui.Components.k71 k71Var = keVar.f39231a1;
                fi.o oVar = keVar.Y0;
                if (oVar != null && !oVar.isFocusable()) {
                    oVar.setFocusable(true);
                    oVar.setFocusableInTouchMode(true);
                    int y12 = k71Var.y1(3);
                    if (y12 >= 0 && y12 < k71Var.W2.f25283x.size()) {
                        k71Var.B0();
                        k71Var.x0(y12);
                    }
                    oVar.requestFocus();
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                yh.g gVar = (yh.g) this.M;
                fi.o oVar2 = gVar.Q;
                if (oVar2 != null && !oVar2.isFocusable()) {
                    gVar.Q.setFocusable(true);
                    gVar.Q.setFocusableInTouchMode(true);
                    int y13 = gVar.f52555e.y1(1);
                    if (y13 >= 0 && y13 < gVar.f52555e.W2.f25283x.size()) {
                        gVar.f52555e.B0();
                        gVar.f52555e.x0(y13);
                    }
                    gVar.Q.requestFocus();
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
