package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class zd extends org.telegram.ui.Components.zc0 {
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
                org.telegram.ui.Components.d61 d61Var = keVar.f38013a1;
                gi.o oVar = keVar.Y0;
                if (oVar != null && !oVar.isFocusable()) {
                    oVar.setFocusable(true);
                    oVar.setFocusableInTouchMode(true);
                    int w12 = d61Var.w1(3);
                    if (w12 >= 0 && w12 < d61Var.Y2.f31138x.size()) {
                        d61Var.B0();
                        d61Var.x0(w12);
                    }
                    oVar.requestFocus();
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                zh.g gVar = (zh.g) this.M;
                gi.o oVar2 = gVar.Q;
                if (oVar2 != null && !oVar2.isFocusable()) {
                    gVar.Q.setFocusable(true);
                    gVar.Q.setFocusableInTouchMode(true);
                    int w13 = gVar.f51908e.w1(1);
                    if (w13 >= 0 && w13 < gVar.f51908e.Y2.f31138x.size()) {
                        gVar.f51908e.B0();
                        gVar.f51908e.x0(w13);
                    }
                    gVar.Q.requestFocus();
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
