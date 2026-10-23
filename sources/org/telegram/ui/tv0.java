package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
public final class tv0 extends org.telegram.ui.Cells.t1 {
    public final int Ge;
    public final int He;
    public final int Ie;

    public tv0(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var, int i11, int i12, int i13) {
        super(context, i10, false, null, g6Var);
        this.Ge = i13;
        this.He = i11;
        this.Ie = i12;
    }

    @Override
    public final void X1(Canvas canvas) {
        switch (this.Ge) {
            case 0:
                this.f23426i6 = 0;
                this.f23440j6 = this.Y5.size() - 1;
                super.X1(canvas);
                return;
            default:
                this.f23426i6 = 0;
                this.f23440j6 = this.Y5.size() - 1;
                super.X1(canvas);
                return;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.Ge) {
            case 0:
                setMeasuredDimension(this.He, this.Ie);
                return;
            default:
                setMeasuredDimension(this.He, this.Ie);
                return;
        }
    }

    @Override
    public final void setPressed(boolean z10) {
        int i10 = this.Ge;
    }

    private final void A4(boolean z10) {
    }

    private final void z4(boolean z10) {
    }
}
