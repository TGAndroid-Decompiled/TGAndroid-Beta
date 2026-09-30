package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class yd extends org.telegram.ui.Components.md0 {
    public final int L;
    public final Object M;

    public yd(Object obj, Context context, int i10) {
        super(context, null);
        this.L = i10;
        this.M = obj;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.L) {
            case 0:
                je jeVar = (je) this.M;
                org.telegram.ui.Components.u61 u61Var = jeVar.f34845a1;
                fi.o oVar = jeVar.Y0;
                if (oVar != null && !oVar.isFocusable()) {
                    oVar.setFocusable(true);
                    oVar.setFocusableInTouchMode(true);
                    int z12 = u61Var.z1(3);
                    if (z12 >= 0 && z12 < u61Var.f28778f3.f26226x.size()) {
                        u61Var.C0();
                        u61Var.y0(z12);
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
                    int z13 = gVar.e.z1(1);
                    if (z13 >= 0 && z13 < gVar.e.f28778f3.f26226x.size()) {
                        gVar.e.C0();
                        gVar.e.y0(z13);
                    }
                    gVar.Q.requestFocus();
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
