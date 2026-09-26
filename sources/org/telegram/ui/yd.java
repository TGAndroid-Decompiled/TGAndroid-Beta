package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class yd extends org.telegram.ui.Components.jd0 {
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
                org.telegram.ui.Components.r61 r61Var = jeVar.f34752a1;
                fi.o oVar = jeVar.Y0;
                if (oVar != null && !oVar.isFocusable()) {
                    oVar.setFocusable(true);
                    oVar.setFocusableInTouchMode(true);
                    int x12 = r61Var.x1(3);
                    if (x12 >= 0 && x12 < r61Var.Y2.f25293x.size()) {
                        r61Var.B0();
                        r61Var.x0(x12);
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
                    int x13 = gVar.e.x1(1);
                    if (x13 >= 0 && x13 < gVar.e.Y2.f25293x.size()) {
                        gVar.e.B0();
                        gVar.e.x0(x13);
                    }
                    gVar.Q.requestFocus();
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
