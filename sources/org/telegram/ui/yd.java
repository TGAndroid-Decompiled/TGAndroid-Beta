package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class yd extends org.telegram.ui.Components.ec0 {
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
                le leVar = (le) this.M;
                org.telegram.ui.Components.v51 v51Var = leVar.X0;
                zd zdVar = leVar.O0;
                if (zdVar != null && !zdVar.isFocusable()) {
                    zdVar.setFocusable(true);
                    zdVar.setFocusableInTouchMode(true);
                    int A1 = v51Var.A1(3);
                    if (A1 >= 0 && A1 < v51Var.f31183f3.D.size()) {
                        v51Var.C0();
                        v51Var.y0(A1);
                    }
                    zdVar.requestFocus();
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                rh.i iVar = (rh.i) this.M;
                zd zdVar2 = iVar.Z;
                if (zdVar2 != null && !zdVar2.isFocusable()) {
                    iVar.Z.setFocusable(true);
                    iVar.Z.setFocusableInTouchMode(true);
                    int A12 = iVar.e.A1(1);
                    if (A12 >= 0 && A12 < iVar.e.f31183f3.D.size()) {
                        iVar.e.C0();
                        iVar.e.y0(A12);
                    }
                    iVar.Z.requestFocus();
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
