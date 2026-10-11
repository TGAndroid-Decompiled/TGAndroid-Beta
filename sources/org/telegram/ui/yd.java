package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class yd extends org.telegram.ui.Components.ae0 {
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
                org.telegram.ui.Components.l71 l71Var = jeVar.f39029a1;
                fi.o oVar = jeVar.Y0;
                if (oVar != null && !oVar.isFocusable()) {
                    oVar.setFocusable(true);
                    oVar.setFocusableInTouchMode(true);
                    int y12 = l71Var.y1(3);
                    if (y12 >= 0 && y12 < l71Var.W2.f25652x.size()) {
                        l71Var.B0();
                        l71Var.x0(y12);
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
                    int y13 = gVar.f52681e.y1(1);
                    if (y13 >= 0 && y13 < gVar.f52681e.W2.f25652x.size()) {
                        gVar.f52681e.B0();
                        gVar.f52681e.x0(y13);
                    }
                    gVar.Q.requestFocus();
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
