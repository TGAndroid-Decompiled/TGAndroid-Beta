package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
public final class xv0 extends org.telegram.ui.Cells.t1 {
    public final int Ce;
    public final int De;
    public final int Ee;

    public xv0(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var, int i11, int i12, int i13) {
        super(context, i10, false, null, g6Var);
        this.Ce = i13;
        this.De = i11;
        this.Ee = i12;
    }

    @Override
    public final void Y1(Canvas canvas) {
        switch (this.Ce) {
            case 0:
                this.f23848f6 = 0;
                this.f23862g6 = this.V5.size() - 1;
                super.Y1(canvas);
                return;
            default:
                this.f23848f6 = 0;
                this.f23862g6 = this.V5.size() - 1;
                super.Y1(canvas);
                return;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.Ce) {
            case 0:
                setMeasuredDimension(this.De, this.Ee);
                return;
            default:
                setMeasuredDimension(this.De, this.Ee);
                return;
        }
    }

    @Override
    public final void setPressed(boolean z4) {
        int i10 = this.Ce;
    }

    private final void A4(boolean z4) {
    }

    private final void B4(boolean z4) {
    }
}
